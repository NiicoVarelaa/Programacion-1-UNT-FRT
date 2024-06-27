import java.util.Random;
import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        mostrarRegistrosFabrica();
    }

    private static void mostrarRegistrosFabrica() {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Fabrica");
        
        int matriz [][] = new int[31] [6];
        int antiguedadMasDeCinco = 30000;
        int antiguedadMenosDeCinco = 15000;
        int jubilacion = 16000;
        int obraSocial = 4500;
        int vectorMayorBono [] = new int [31];

        for (int i = 1; i < matriz.length; i++) {
            matriz [i] [0] = i ;
        }

        for (int i = 1; i < matriz.length; i++) {
            matriz[i][1] = rd.nextInt(300000) + 100000;
        }

        for (int i = 1; i < matriz.length; i++) {
            matriz[i][2] = jubilacion;
        }

        for (int i = 1; i < matriz.length; i++) {
            matriz[i][3] = obraSocial; 
        }

        for (int i = 1; i < matriz.length; i++) {
            int antiguedad = rd.nextInt(10) + 1;
            if (antiguedad > 5) {
                matriz[i][4] = antiguedadMasDeCinco;
                vectorMayorBono[i] = i;
            } else {
                matriz[i][4] = antiguedadMenosDeCinco;
            }   
            
        }

        for (int i = 1; i < matriz.length; i++) {
            matriz[i][5] = matriz[i][1] + matriz[i][4] - matriz[i][2] - matriz[i][3];
        }

        System.out.println();
        System.out.println("Nº Legajo   Sueldo Básico    Jubilación   Obra Social      Antiguedad        Sueldo Neto");
        System.out.println();
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t      $");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Los Empleados que Obtuvieron una mayor Bonificación por sus Años de Antiguedad son: ");
        System.out.println("Segun su Número de Legajo");
        for (int i = 1; i < vectorMayorBono.length; i++) {
            if (vectorMayorBono[i] != 0 ) {
                System.out.print(vectorMayorBono[i] + "\t");
            }
            
        }

        for (int i = 1; i < matriz.length - 1; i++) {
            for (int j = 1; j < matriz.length - i; j++) {
                if (matriz[j][5] < matriz[j + 1][5]) {
                    for (int k = 0; k < matriz[0].length; k++) {
                        int aux = matriz[j][k];
                        matriz[j][k] = matriz[j + 1][k];
                        matriz[j + 1][k] = aux;
                    }
                }
            }
        }

        System.out.println("\n");
        System.out.println("Registro Ordenado Segun Sueldo Neto");
        System.out.println("Nº Legajo   Sueldo Básico    Jubilación   Obra Social      Antiguedad        Sueldo Neto");
        System.out.println();
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t      $");
            }
            System.out.println();
        }

        sc.close();
    }

}

/* Una fábrica tiene 30 obreros con legajos de 1 a 30. Por cada obrero se registran los movimientos que 
intervienen en la liquidación informando:
a. N° de legajo
b. Sueldo básico
c. Bonificación por antigüedad
Se debe calcular el sueldo neto de cada obrero considerando:
a. Un descuento por jubilación que representa el 16 % del sueldo básico
b. Un descuento por obra social que representa el 4,5 % del sueldo básico
Se pide:
Listado como el siguiente:
___________________________________________________________________________________
N de legajo Sueldo básico Jubilación Oba social Antigüedad Sueldo neto
XXXXXX XXXXXX XXXXX XXXXX XXXXXX XXXXX
Indicar cuál fue el legajo del o los obreros con mayor bonificación de antigüedad y cual fue esa cantidad 
Listado de todos los obreros ordenado por sueldo neto. */