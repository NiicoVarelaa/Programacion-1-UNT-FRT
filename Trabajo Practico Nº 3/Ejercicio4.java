import java.util.Random;

public class Ejercicio4 {
    public static void main(String[] args) {

        int resultado = sumaNumerosVector();
        System.out.println("El Resultado de la suma de todos los numeros del vector es: " + resultado);

    }

    public static int sumaNumerosVector() {
        Random rd = new Random();

        int vector [] = new int[3];

        for (int i = 0; i < 3; i++) {
            vector [i] = rd.nextInt(100) + 1;
        }

        int resultadoSuma = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Estoy en el Indice " + i );
            System.out.println("Tengo Guardado un: " + vector[i]);
            resultadoSuma = resultadoSuma + vector[i];
        }

        return resultadoSuma;
    }

}

// Escribir un programa que dado un vector y su dimensión, devuelva la sumatoria de sus elementos.
