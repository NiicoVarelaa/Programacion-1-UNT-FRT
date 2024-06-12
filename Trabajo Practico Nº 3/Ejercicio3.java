import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args) {

        vectorMostrar();

    }

    public static void vectorMostrar() {
        Random rd = new Random();

        int dimensionVector = rd.nextInt(100) + 1;

        float vector [] = new float[dimensionVector];

        float maxValor = vector[0];

        for (int i = 0; i < vector.length; i++) {
            vector [i] = rd.nextFloat(99) + 1;
        }

        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > maxValor) {
                maxValor = vector[i];
            }

            System.out.println("Estoy en el Indice " + i );
            System.out.printf("El Valor Maximo es: %.1f%n", maxValor);
            System.out.println("----------------------------------");
        }
    }

}

/* Cargar un conjunto de números de coma flotante en un vector. No se conoce la cantidad pero se 
sabe que no superan los 100. Muestre el valor máximo, la cantidad de veces que aparece y las 
posiciones que ocupa. */
