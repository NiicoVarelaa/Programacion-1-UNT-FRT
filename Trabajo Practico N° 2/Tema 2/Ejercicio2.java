import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un Número en Pulgadas para Transformarlo a Centimetros");
        int pulgadas = scanner.nextInt();
        
        double centimetros = pulgadas * 2.54;

        System.out.println(centimetros);

        scanner.close();
    }
}
