import java.util.Scanner;

public class Ejercicio5 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hola Ingrese un Número para saber el Reciproco");
        double numIngresado = scanner.nextInt();

        double numReciproco = 1/numIngresado;

        if (numReciproco > 0) {
            System.out.println("El Reciproco del Número Ingresado es: " + numReciproco);
        } else {
            System.out.println("Error");
        }

        scanner.close();
    }
}
