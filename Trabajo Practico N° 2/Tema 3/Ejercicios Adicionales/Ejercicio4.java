import java.util.Scanner;

public class Ejercicio4 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Las Temperaturas en Grados Fahrenheit y Grados Centigrados es: ");

        int gradosFahrenheit = 20;
        int gradosCentigrados = 0;

        while (gradosFahrenheit < 301) {
            gradosCentigrados = 5 * (gradosFahrenheit - 32) / 9;
            System.out.println("La Temperatura en Grados Fahrenheit es: " + gradosFahrenheit + "°" + "      La Temperatura en Grados Centigrados es: " + gradosCentigrados + "°");
            gradosFahrenheit = gradosFahrenheit + 20; 
        }

        scanner.close();
    }
}
