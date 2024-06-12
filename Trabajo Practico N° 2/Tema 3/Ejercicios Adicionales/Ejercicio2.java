import java.util.Scanner;

public class Ejercicio2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un Numero para calcular su Factorial");
        int numIngresado = scanner.nextInt();
        int factorial = 1;
        
        for (int i = 1; i <= numIngresado; i++) {
            factorial = factorial * i;
        }

        System.out.println("El Resultado es: " + factorial);

        scanner.close();
    }
}
