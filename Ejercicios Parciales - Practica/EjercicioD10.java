import java.util.Scanner;

public class EjercicioD10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numMinimo = 0;
        int numMaximo = 0;

        for (int i = 0; i <= 10; i++) {
            
            int numeroAleatorio = (int)(Math.random() * 100) + 1;

            if (i == 0) {
                numMinimo = numeroAleatorio;
                numMaximo = numeroAleatorio;
            } else {
                if (numMinimo < numeroAleatorio) {
                    numMinimo = numeroAleatorio;
                }
                if (numMaximo > numeroAleatorio) {
                    numMaximo = numeroAleatorio;
                }
            } 

            System.out.println(numeroAleatorio);

        }

        System.out.println("El Numero Mayor es: " + numMaximo);
        System.out.println("El Numero Mayor es: " + numMinimo);

        scanner.close();
    }
}



/* Generar y mostrar numeros aleatorios: Crea un programa que genere 10 numeros aleatorios entre 1 y 100 y los muestre en pantalla. Luego, calcula y muestra el mayor y el menor de los numeros generados. */
