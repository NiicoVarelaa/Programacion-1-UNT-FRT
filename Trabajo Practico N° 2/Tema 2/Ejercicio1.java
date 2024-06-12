import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int alpha = 357;
        int beta = 59;
        int aux;

        aux = alpha;
        alpha = beta;
        beta = aux;

        System.out.println(alpha);
        System.out.println(beta);
        
        scanner.close();
    }
}