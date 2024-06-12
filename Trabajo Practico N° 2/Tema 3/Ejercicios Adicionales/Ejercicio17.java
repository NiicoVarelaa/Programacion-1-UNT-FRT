import java.util.Scanner;

public class Ejercicio17 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bienvenido Ingrese un Numero de 5 Cifras para determinar si es Palíndromo");
        int numIngresado = scanner.nextInt();
        String numString = Integer.toString(numIngresado);

        boolean esPalindromo = false;
        int a = 0;
        int b = numString.length() - 1;

        for (int i=0; i<numString.length(); i++) {
            if (numString.charAt(a) == numString.charAt(b)) {
                a++;
                b--;
                esPalindromo = true;
            }
        }

        if (esPalindromo == true) {
            System.out.println("Es Palíndromo");
        } else {
            System.out.println("No es Palíndromo");
        }

        scanner.close();
    }
}
