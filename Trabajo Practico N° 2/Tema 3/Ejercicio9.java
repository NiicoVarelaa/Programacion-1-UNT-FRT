import java.util.Scanner;

public class Ejercicio9 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de individuos");
        int individuos = scanner.nextInt();

        System.out.println("Ingrese la cantidad de Años");
        int anios = scanner.nextInt();

        for (int i = 1; i <= anios; i++) {
            System.out.println("Al Cabo de " + i + " Año Quedaran: " + individuos + " Individuos");
            
            individuos = individuos/5;
        }
        
        scanner.close();
    }
}