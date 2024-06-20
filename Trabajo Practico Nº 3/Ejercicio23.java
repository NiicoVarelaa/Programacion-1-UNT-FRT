import java.util.Random;

public class Ejercicio23 {
    public static void main(String[] args) {
        mostrarRegistroLluvia();
    }

    private static void mostrarRegistroLluvia() {
        Random rd = new Random();

        System.out.println("Cantidad de Lluvia en la Ciudad");
        System.out.println();
        int matriz [][] = new int[24] [8];
        int sumaAgua = 0;
        int vectorDiaAgua [] = new int [8];
        int vectorHoraAgua [] = new int [8];

        for (int i = 0; i < matriz.length; i++) {
            matriz [i] [0] = i;
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 1; j < matriz[0].length; j++) { 
                matriz[i][j] = rd.nextInt(100) + 1;
                sumaAgua += matriz [i] [j];
                vectorDiaAgua[j] += matriz [i] [j];
            }
        }        

        System.out.println();
        System.out.println("Hora     L      M       M       J       V       S       D");
        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < vectorDiaAgua.length; i++) {
            System.out.print(vectorDiaAgua[i] + "\t");
        }


        int diaMaximo = 0;
        int posiciónMaximo = 0;

        int diaMinimo = 0;
        int posiciónMenor = 0;

        for (int i = 1; i < vectorDiaAgua.length; i++) {
            if (i == 1) {
                diaMinimo = vectorDiaAgua[i];
                diaMaximo = vectorDiaAgua[i];
            } else {
                if (vectorDiaAgua[i] < diaMinimo) {
                    diaMinimo = vectorDiaAgua[i];
                    posiciónMenor = i;
                }
                if (vectorDiaAgua[i] > diaMaximo) {
                    diaMaximo = vectorDiaAgua[i];
                    posiciónMaximo = i;
                }
            }
        }

        for (int j = 1; j < matriz[0].length; j++) {
            int horaMenorAgua = Integer.MAX_VALUE; 
            int horaMenor = -1; 

            for (int i = 0; i < matriz.length; i++) {
                if (matriz[i][j] < horaMenorAgua) {
                    horaMenorAgua = matriz[i][j];
                    horaMenor = matriz[i][0]; 
                }
            }

            vectorHoraAgua[j] = horaMenor; 
        }

        switch (posiciónMaximo) {
            case 0:
                System.out.println("\n");
                System.out.println("El Lunes es el Día con Mayor Agua con una Cantidad de: " + diaMaximo + "milimetros");
                break;
            case 2 :
                System.out.println("\n");
                System.out.println("El Martes es el Día con Mayor Agua con una Cantidad de: " + diaMaximo + "milimetros");
                break;
            case 3 :
                System.out.println("\n");
                System.out.println("El Miercoles es el Día con Mayor Agua con una Cantidad de: " + diaMaximo + "milimetros");
                break;
            case 4 :
                System.out.println("\n");
                System.out.println("El Jueves es el Día con Mayor Agua con una Cantidad de: " + diaMaximo + "milimetros");
                break;
            case 5 :
                System.out.println("\n");
                System.out.println("El Viernes es el Día con Mayor Agua con una Cantidad de: " + diaMaximo + "milimetros");
                break;
            case 6 :
                System.out.println("\n");
                System.out.println("El Sabado es el Día con Mayor Agua con una Cantidad de: " + diaMaximo + "milimetros");
                break;
            case 7 :
                System.out.println("\n");
                System.out.println("El Domingo es el Día con Mayor Agua con una Cantidad de: " + diaMaximo + "milimetros");
                break;
            default:
                break;
        }

        switch (posiciónMenor) {
            case 0:
                System.out.println("\n");
                System.out.println("El Lunes es el Día con Menor Agua con una Cantidad de: " + diaMinimo + "milimetros");
                System.out.println("La Hora en que Menos Agua cayó ese Día fue a las: " + vectorHoraAgua[1] + "hs");
                break;
            case 2 :
                System.out.println("\n");
                System.out.println("El Martes es el Día con Menor Agua con una Cantidad de: " + diaMinimo + "milimetros");
                System.out.println("La Hora en que Menos Agua cayó ese Día fue a las: " + vectorHoraAgua[2] + "hs");
                break;
            case 3 :
                System.out.println("\n");
                System.out.println("El Miercoles es el Día con Menor Agua con una Cantidad de: " + diaMinimo + "milimetros");
                System.out.println("La Hora en que Menos Agua cayó ese Día fue a las: " + vectorHoraAgua[3] + "hs");
                break;
            case 4 :
                System.out.println("\n");
                System.out.println("El Jueves es el Día con Menor Agua con una Cantidad de: " + diaMinimo + "milimetros");
                System.out.println("La Hora en que Menos Agua cayó ese Día fue a las: " + vectorHoraAgua[4] + "hs");
                break;
            case 5 :
                System.out.println("\n");
                System.out.println("El Viernes es el Día con Menor Agua con una Cantidad de: " + diaMinimo + "milimetros");
                System.out.println("La Hora en que Menos Agua cayó ese Día fue a las: " + vectorHoraAgua[5] + "hs");
                break;
            case 6 :
                System.out.println("\n");
                System.out.println("El Sabado es el Día con Menor Agua con una Cantidad de: " + diaMinimo + "milimetros");
                System.out.println("La Hora en que Menos Agua cayó ese Día fue a las: " + vectorHoraAgua[6] + "hs");
                break;
            case 7 :
                System.out.println("\n");
                System.out.println("El Domingo es el Día con Menor Agua con una Cantidad de: " + diaMinimo + "milimetros");
                System.out.println("La Hora en que Menos Agua cayó ese Día fue a las: " + vectorHoraAgua[7] + "hs");
                break;
            default:
                break;
        }
    }

}

/* La semana pasada llovió en la ciudad y se registraron los datos de los milímetros de agua caída en cada 
hora en cada día de la semana. Desarrolle un programa para:
a. Leer la matriz con los datos de agua caída
b. Determinar el día con mayor agua caída
c. Determinar el día y la hora con menor agua caída. */