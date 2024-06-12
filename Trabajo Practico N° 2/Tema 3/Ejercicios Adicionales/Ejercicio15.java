import java.util.Scanner;

public class Ejercicio15 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 32; i < 127; i++) {
            System.out.println("Carácter: " + (char) i + "       Valor numérico: " + i);
        }

        scanner.close();
    }
}
