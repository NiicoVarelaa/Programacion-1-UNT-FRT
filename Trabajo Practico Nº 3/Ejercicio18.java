import java.util.Random;
import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        mostrarMatriz();
    }

    private static void mostrarMatriz() {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Empleados");
        int matriz [][] = new int[101] [4];

        int edades = 0;
        int edadesSuperiores = 0;

        int vectorIndiceEdades [] = new int [101];

        for (int i = 1; i < matriz.length; i++) {
            matriz [i] [1] = i;
        }

        for (int i = 1; i < matriz.length; i++) {
            matriz [i] [2] = rd.nextInt(60) + 18;
            edades += matriz [i] [2];
        }

        for (int i = 1; i < matriz.length; i++) {
            matriz [i] [3] = rd.nextInt(250000) + 100000;
        }

        System.out.println();
        System.out.println("Legajo   ||   Edad    ||    Salario");
        System.out.println();
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "             ");
            }
            System.out.println();
        }

        int promedioEdades = edades/100;

        System.out.println();
        System.out.println("El Promedio de Edad es: " + promedioEdades);
        System.out.println();

        int contadorEdadesSuperiores = 0;

        for (int i = 1; i < matriz.length; i++) {
            if (matriz [i] [2] > promedioEdades) {
                vectorIndiceEdades [i] = i;
                edadesSuperiores += matriz [i] [2];
                contadorEdadesSuperiores ++;
            }
        }

        int promedioEdadesSuperiores = edadesSuperiores / contadorEdadesSuperiores;

        System.out.println("La Edad Promedio de los Empleados que Superan la Edad Promedio es: " + promedioEdadesSuperiores);

        System.out.println();
        System.out.println("Los Empleados que Superan esa Edad son: ");
        System.out.println();
        System.out.println("Legajo");
        System.out.println();

        for (int i = 0; i < vectorIndiceEdades.length; i++) {
            if (vectorIndiceEdades[i] != 0) {
                System.out.println(vectorIndiceEdades[i]);
            }
        }

        sc.close();
    }

}

/* De los 100 empleados de una fábrica se registra: número de legajo (coincide con el número de indice), 
edad y salario. Se pide:
 Ingresar los datos correlativamente
 Calcular la edad promedio informando número de legajo de los empleados cuya edad supere el 
promedio. */