import java.util.Scanner;

public class Ejercicio4 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un Número Positivo:");
        int numIngresado = scanner.nextInt();
        int aux = 1;

        while (numIngresado > 0 && aux == 1 ) {
            int a = numIngresado % 10;
            numIngresado = numIngresado / 10;
            if (a == 3) {
                aux = 3;
            } 
        }        
        
        if (aux == 3) {
            System.out.println("Encontrado");
        } else {
            System.out.println("No Encontrado");
        }
        
        scanner.close();
    }
}
