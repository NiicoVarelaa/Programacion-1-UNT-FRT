import java.util.Random;

public class Ejercicio1 {
    public static void main(String[] args) {

        vectorMostrar();

    }

    public static void vectorMostrar() {
        Random rd = new Random();
        int vector [] = new int[10];

        for (int i = 0; i < vector.length; i++) {
            vector [i] = rd.nextInt(100)+1;
        }

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Estoy en el Indice " + i );
            System.out.println("Tengo Guardado un: " + vector[i]);
            System.out.println("----------------------------------");
        }
    }

}

// Leer 10 elementos de un vector de enteros y mostrar su contenido.