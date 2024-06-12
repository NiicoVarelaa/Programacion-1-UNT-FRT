import java.util.Scanner;

public class Ejercicio12 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        
        while (contador < 100) {
            System.out.println(" * ");
            contador++;
            if (contador % 10 == 0) {
                System.out.println(" ");
            }
        }

        scanner.close();
    }
}
