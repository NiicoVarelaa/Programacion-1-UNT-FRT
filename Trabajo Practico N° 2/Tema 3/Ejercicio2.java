import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 11; i++) {
            int potencia1 = (int) (Math.pow(i, 1));
            int potencia2 = (int) (Math.pow(i, 2));
            int potencia3 = (int) (Math.pow(i, 3));
            int potencia4 = (int) (Math.pow(i, 4));
            System.out.println("La Potencia del Número: " + i + " es: " + potencia1);
            System.out.println("La Potencia del Número: " + i + " es: " + potencia2);
            System.out.println("La Potencia del Número: " + i + " es: " + potencia3);
            System.out.println("La Potencia del Número: " + i + " es: " + potencia4);
        }
        
        scanner.close();
    }
}