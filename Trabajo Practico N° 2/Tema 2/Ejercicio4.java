import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese Un Número");
        int a = scanner.nextInt();

        System.out.println("Ingrese Otro Número");
        int b = scanner.nextInt();
        
        int cociente = a / b;
        int resto = a % b;

        System.out.println("El Cociente de A es: " + cociente);
        System.out.println("El Resto de A es: " + resto);

        scanner.close();
    }
}
