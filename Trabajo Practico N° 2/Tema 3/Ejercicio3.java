import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un Número");
        int numIngresado = scanner.nextInt();

        int num1 = 0;
        int num2 = numIngresado - num1;

        System.out.println("Las Parejas de numeros cuya suma es: " + numIngresado + " son: ");

        while (num1 <= numIngresado/2) {
            System.out.println("(" + num1 + " y " + num2 + ")");
            num1++;
            num2--;
        }


        scanner.close();
    }
}