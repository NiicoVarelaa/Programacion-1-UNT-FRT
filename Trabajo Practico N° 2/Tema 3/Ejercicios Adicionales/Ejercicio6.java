import java.util.Scanner;

public class Ejercicio6 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calcular Velocidad de la PC");

        int contador = 1;

        while (contador > 0 && contador <= 3000000 ) {
            if (contador % 1000000 == 0) {
                System.out.println("El contador es divisible por 1,000,000: " + contador);
            }
            contador++;
        }

        scanner.close();
    }
}
