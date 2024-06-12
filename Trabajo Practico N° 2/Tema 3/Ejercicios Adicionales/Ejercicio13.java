import java.util.Scanner;

public class Ejercicio13 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un Caracter");
        String caracterIngresado = scanner.next();

        if (caracterIngresado.length() != 1) {
            System.out.println("No Puede Ingresar mas de un Caracter");
        } else {
            System.out.println("Ingrese un numero de Repeticiones");
            int numRepeticiones = scanner.nextInt();
        
            int contador = 0;
        
            while (contador < numRepeticiones) {
                System.out.println(caracterIngresado);
                contador++;
            }
        }
        
        scanner.close();
    }
}