import java.util.Scanner;

public class Ejercicio6 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la Cantidad de Vendedores a Consultar su Ganancia");
        int vendedores = scanner.nextInt();

        for (int i = 1; i <= vendedores; i++) { 
            System.out.println("Ingrese la cantidad de ventas realizadas en la semana");
            int ventasRealizadas = scanner.nextInt();
            int porcentajeVentas = (ventasRealizadas*9)/100;
            int gananciasTotales = 200 + ventasRealizadas + porcentajeVentas;

            System.out.println("Las Ganancias de la Semana del vendedor " + i + " son: " + gananciasTotales);
        }
        
        scanner.close();
    }
}
