import java.util.Scanner;

public class Ejercicio9 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de P:");
        int p = scanner.nextInt();
        
        System.out.println("Ingrese el valor de Q:");
        int q = scanner.nextInt();

        int expresion = (int) (Math.pow(p,3) + q - 2 * Math.pow(p, 2));

        if (expresion < 680) {
            System.out.println("Los valores de P y Q satisfacen la expresión:");
            System.out.println("P = " + p);
            System.out.println("Q = " + q);
        } else {
            System.out.println("Los valores de P y Q no satisfacen la expresión.");
        }

        scanner.close();
    }
}
