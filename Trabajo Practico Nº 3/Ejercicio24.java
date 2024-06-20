import java.util.Random;
import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        mostrarEstudioDetergentes();
    }

    private static void mostrarEstudioDetergentes() {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Estudio de Mercado de Detergentes");
        System.out.println();
        int matriz [][] = new int[106] [4];
        int vectorMayorUso [] = new int [4];
        int sumaDetergentes = 0;
        int sumaPersonas = 0;
        int contadorPersonas = 0;

        for (int i = 1; i < matriz.length; i++) {
            matriz [i] [0] = i;
        }

        for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz[0].length; j++) { 
                matriz[i][j] = rd.nextInt(2);
                sumaDetergentes += matriz [i] [j];
                vectorMayorUso[j] += matriz [i] [j];
            }
        }    

        for (int i = 1; i < matriz.length; i++) {
            sumaPersonas = 0;
            for (int j = 1; j < matriz[0].length; j++) { 
                sumaPersonas += matriz [i] [j];
            }
            if (sumaPersonas >= 2) {
                contadorPersonas++;
            }
        } 

        System.out.println();
        System.out.println("Personas     Ala   Granby  Drive       ");
        System.out.println();
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t      ");
            }
            System.out.println();
        }


        System.out.println();
        for (int i = 0; i < vectorMayorUso.length; i++) {
            System.out.print(vectorMayorUso[i] + "\t     ");
        }

        int detergenteMayorUso = 0;
        int posiciónMayor = 0;

        int detergenteMenorUso = 0;
        int posiciónMenor = 0;

        for (int i = 1; i < vectorMayorUso.length; i++) {
            if (i == 1) {
                detergenteMenorUso = vectorMayorUso[i];
                detergenteMayorUso = vectorMayorUso[i];
            } else {
                if (vectorMayorUso[i] < detergenteMenorUso) {
                    detergenteMenorUso = vectorMayorUso[i];
                    posiciónMenor = i;
                }
                if (vectorMayorUso[i] > detergenteMayorUso) {
                    detergenteMayorUso = vectorMayorUso[i];
                    posiciónMayor = i;
                }
            }
        }

        System.out.println();
        switch (posiciónMayor) {
            case 0:
                System.out.println();
                System.out.println("El Detergente con Mayor Uso es el Ala ");
                break;
            case 2:
                System.out.println();
                System.out.println("El Detergente con Mayor Uso es el Granby ");
                break;
            case 3:
                System.out.println();
                System.out.println("El Detergente con Mayor Uso es el Drive ");
                break;
            default:
                break;
        }

        switch (posiciónMenor) {
            case 0:
                System.out.println();
                System.out.println("El Detergente con Menor Uso es el Ala ");
                break;
            case 2:
                System.out.println();
                System.out.println("El Detergente con Menor Uso es el Granby ");
                break;
            case 3:
                System.out.println();
                System.out.println("El Detergente con Menor Uso es el Drive ");
                break;
            default:
                break;
        }

        System.out.println();
        System.out.println("La Cantidad de Personas que Usan al menos 2 Detergentes son: " + contadorPersonas);


        sc.close();
    }

}

/* Para hacer un estudio de mercado sobre los detergentes Ala, Granby y Drive, una empresa encuestó a 
105 dueñas de casa, las que debían responder sobre el uso de cada producto con: 1 (en caso de usarlo), 
0 (en caso de no usarlo). Así, una dueña de casa podría usar todos los detergentes o por el contrario sólo 
dos o ninguno. Desarrolle un programa que permita:
a. Indicar el o los detergentes que tienen mayor y menor uso
b. Indicar el número de personas que usan al menos dos detergentes. */