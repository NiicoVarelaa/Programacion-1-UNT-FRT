import java.util.Random;
import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {

        mostrarMatrizTranspuesta();

    }

    private static void mostrarMatrizTranspuesta() {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el Orden de la Matriz");
        int ordenMatriz = sc.nextInt();

        int matriz [] [] = new int[ordenMatriz] [ordenMatriz];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz [i] [j] = rd.nextInt(100) + 1;
            }
            System.out.println("");
        }

        System.out.println("La Matriz es: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i] [j] + " ");
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("La Matriz Transpuesta es: ");

        int aux;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                aux = matriz[i] [j];
                matriz[i] [j] = matriz[j] [i];
                matriz[j] [i] = aux;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i] [j] + " ");
            }
            System.out.println("");
        }

        sc.close();
    }

}

/* Realice un programa en el cual a partir de una matriz rectangular calcule su matriz transpuesta. */