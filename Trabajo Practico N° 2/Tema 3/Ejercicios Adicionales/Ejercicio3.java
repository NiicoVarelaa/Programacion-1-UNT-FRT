import java.util.Scanner;

public class Ejercicio3 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean numSiete = false;
        int sietesEncontrados = 0;

        System.out.println("Ingrese un Número Positivo:");
        int numIngresado = scanner.nextInt();

        while (numIngresado > 0  ) {
            int a = numIngresado % 10;
            numIngresado = numIngresado / 10;
            if (a == 7) {
                numSiete = true;
                sietesEncontrados++;
            }
        }

        if (numSiete) {
            System.out.println("La cantidad de números 7 encontrados es: " + sietesEncontrados);
        } else {
            System.out.println("No se encontraron números 7 en el número ingresado.");
        }
        
        scanner.close();
    }
}