import java.util.Scanner;

public class Ejercicio6 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese Tres Números para determinar si estan en Orden númerico o no");

        System.out.println("Ingrese el Primer Número");
        int numeroUno = scanner.nextInt();
        System.out.println("Ingrese el Segundo Número");
        int numeroDos = scanner.nextInt();
        System.out.println("Ingrese el Tercer Número");
        int numeroTres = scanner.nextInt();

        if (numeroDos > numeroUno && numeroDos < numeroTres) {
            System.out.println("Los Números ingresados Están en Orden númerico");
        } else {
            System.out.println("Los Números ingresados No Están en Orden númerico");
        }    
        
        scanner.close();
    }
}

