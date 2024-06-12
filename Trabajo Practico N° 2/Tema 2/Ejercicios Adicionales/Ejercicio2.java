import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hola Ingrese el Total de Ventas del mes");
        double totalVentas = scanner.nextInt();

        System.out.println("Ingrese el Gasto mensual");
        double gastoMensual = scanner.nextInt();

        if (totalVentas > 0) {
            double impuestoPagar = (totalVentas*25)/100;
            System.out.println("El Total del Impuesto a Pagar es: $ " + impuestoPagar);
            double gananciaTotal = totalVentas-impuestoPagar-gastoMensual;
            System.out.println("La Ganancia Mensual es: $ " + gananciaTotal);
        } else {
            System.out.println("Error");
        }
        
        scanner.close();
    }
}