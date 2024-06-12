import java.util.Scanner;

public class EjercicioD4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un Numero entero para determinar la suma de sus cifras");
        String numIngresado = scanner.nextLine();

        while (numIngresado.length() > 0) {
            int sumaDigitos = 0;
            for (int i = 0; i < numIngresado.length(); i++) {
                int digito = Character.getNumericValue(numIngresado.charAt(i));
                sumaDigitos = sumaDigitos + digito;
            }
            numIngresado = String.valueOf(sumaDigitos);
        }

        System.out.println("La suma de las cifras del número ingresado es: " + numIngresado);

        scanner.close();
    }
}
