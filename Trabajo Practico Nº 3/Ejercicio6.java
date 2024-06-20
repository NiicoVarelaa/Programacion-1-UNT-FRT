import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        mostrarVector();
    }

    public static void mostrarVector() {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la Dimension del Vector");
        int dimensionVector = sc.nextInt();

        int vector [] = new int[dimensionVector];

        for (int i = 0; i < vector.length; i++) {
            vector [i] = rd.nextInt(100) + 1;
        }

        int maxValor = vector[0];
        int contadorValorMaximo = 1;

        System.out.println("\n");
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > maxValor) {
                maxValor = vector[i];
                contadorValorMaximo = 1;
            }
            if (maxValor > vector[i]) {
                contadorValorMaximo++;
            } else {
                contadorValorMaximo = 0;
            }
            System.out.println("Indice " + i + " - Número: " + vector[i]);
            System.out.println("EL Valor Máximo es: " + maxValor);
            System.out.println("");
        }

        System.out.println("La Cantidad de Veces que se Repite el Valor Máximo es: " + contadorValorMaximo + " veces");        

        sc.close();
    }

}

/* Dado un vector de orden N, encuentre el elemento máximo, la cantidad de veces que se repite y la/s 
posición/es que ocupa. */
