import java.util.Scanner;

public class Ejercicio10 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero: ");
        String numeroIngresado = scanner.next();

        while (numeroIngresado.length() > 1) {
            int sumaCifras = 0;
            for (int i = 0; i < numeroIngresado.length(); i++) {
                int cifra = Character.getNumericValue(numeroIngresado.charAt(i));
                sumaCifras = sumaCifras + cifra;
            }
            numeroIngresado = String.valueOf(sumaCifras);
        }

        System.out.println("La suma de las cifras del número ingresado es: " + numeroIngresado);

        scanner.close();
    }
}