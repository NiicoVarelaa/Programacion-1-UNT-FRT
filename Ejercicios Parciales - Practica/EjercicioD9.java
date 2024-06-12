import java.util.Scanner;

public class EjercicioD9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un Numero Binario de 8 Digitos");
        String numIngresado = scanner.nextLine();

        int resultadoDigitos = 0;

        if (numIngresado.length() > 7 && numIngresado.length() < 9) {            

            String digito1 = numIngresado.substring(0, 1);
            int digito1Entero = Integer.parseInt(digito1);

            String digito2 = numIngresado.substring(1, 2);
            int digito2Entero = Integer.parseInt(digito2);

            String digito3 = numIngresado.substring(2, 3);
            int digito3Entero = Integer.parseInt(digito3);

            String digito4 = numIngresado.substring(3, 4);
            int digito4Entero = Integer.parseInt(digito4);

            String digito5 = numIngresado.substring(4, 5);
            int digito5Entero = Integer.parseInt(digito5);

            String digito6 = numIngresado.substring(5, 6);
            int digito6Entero = Integer.parseInt(digito6);

            String digito7 = numIngresado.substring(6, 7);
            int digito7Entero = Integer.parseInt(digito7);

            String digito8 = numIngresado.substring(7, 8);
            int digito8Entero = Integer.parseInt(digito8);

            if (digito1Entero == 1) {
                resultadoDigitos = resultadoDigitos + 128;
            }

            if (digito2Entero == 1) {
                resultadoDigitos = resultadoDigitos + 64;
            }

            if (digito3Entero == 1) {
                resultadoDigitos = resultadoDigitos + 32;
            }

            if (digito4Entero == 1) {
                resultadoDigitos = resultadoDigitos + 16;
            }

            if (digito5Entero == 1) {
                resultadoDigitos = resultadoDigitos + 8;
            }

            if (digito6Entero == 1) {
                resultadoDigitos = resultadoDigitos + 4;
            }

            if (digito7Entero == 1) {
                resultadoDigitos = resultadoDigitos + 2;
            }

            if (digito8Entero == 1) {
                resultadoDigitos = resultadoDigitos + 1;
            }

            System.out.println("El valor del numero ingresado es: " + resultadoDigitos);

            String resultadoDigitosPalindromo = Integer.toString(resultadoDigitos);
            int indice = 0;
            int indiceFinal = resultadoDigitosPalindromo.length() - 1 ;
            boolean esPalindromo = false;

            for (int i = 0; i < resultadoDigitosPalindromo.length(); i++) {
                if (resultadoDigitosPalindromo.charAt(indice) == resultadoDigitosPalindromo.charAt(indiceFinal)) {
                    indice++;
                    indiceFinal--;
                    esPalindromo = true;
                }
            }

            if (esPalindromo == true) {
                System.out.println("Es Palíndromo");
            } else {
                System.out.println("No es Palíndromo");
            }

        } else {
            System.out.println("Error: El Numero tiene que ser solo de 8 digitos");
        }

        scanner.close();
    }
}


/* Ingrese un numero binario de 8 digitos 
Verifique si el num ingresado solo tiene 0 y 1 
mostrar la suma de los 1
y despues verificar si es palindromo o no */
