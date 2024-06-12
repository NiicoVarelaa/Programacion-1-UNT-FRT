import java.util.Scanner;

public class EjercicioD7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero para saber la suma de los numeros primos hasta el numero ingresado");
        int numIngresado = scanner.nextInt();
        int sumaPrimos = 0;

        for (int i = 2; i <= numIngresado; i++) {
            boolean esPrimo = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                sumaPrimos = sumaPrimos + i;
            }
        }

        System.out.println("La Suma de los Numeros Primos es: " + sumaPrimos);

        scanner.close();
    }
}
