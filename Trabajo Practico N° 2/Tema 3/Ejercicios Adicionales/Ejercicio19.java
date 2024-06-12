import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un Número para ver los Números Primos entre el 2 y el Número Ingresado");
        int numIngresado = scanner.nextInt();

        for (int i = 2; i < numIngresado; i++) {             
            int creciente = 2;
            int esPrimo = 1;

            while (esPrimo == 1 && creciente < i) {
                if (i % creciente == 0) {
                    esPrimo = 0;
                } else {
                    creciente++;
                }
            }

            if (esPrimo == 1) {
                System.out.println("El Número " + i + " Es un Número Primo");
            } 

            }

        scanner.close();
    }
}
