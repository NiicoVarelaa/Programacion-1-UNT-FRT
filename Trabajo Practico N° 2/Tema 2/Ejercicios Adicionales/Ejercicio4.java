import java.util.Scanner;

public class Ejercicio4 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hola Ingrese El Precio y la Cantidad de los 4 Consumos");

        System.out.println("Ingrese El Precio del Primer consumo");
        int consumo1 = scanner.nextInt();
        System.out.println("Ingrese La Cantidad del Primer consumo");
        int cantidadConsumo1 = scanner.nextInt();

        if (cantidadConsumo1 > 0) {
            System.out.println("Ingrese El Precio del Segundo consumo");
            int consumo2 = scanner.nextInt();
            System.out.println("Ingrese La Cantidad del Segundo consumo");
            int cantidadConsumo2 = scanner.nextInt();

            System.out.println("Ingrese El Precio del Tercer consumo");
            int consumo3 = scanner.nextInt();
            System.out.println("Ingrese La Cantidad del Tercer consumo");
            int cantidadConsumo3 = scanner.nextInt();

            System.out.println("Ingrese El Precio del Cuarto consumo");
            int consumo4 = scanner.nextInt();
            System.out.println("Ingrese La Cantidad del Cuarto consumo");
            int cantidadConsumo4 = scanner.nextInt();

            int consumoTotal = consumo1*cantidadConsumo1*+consumo2*cantidadConsumo2+consumo3*cantidadConsumo3+consumo4*cantidadConsumo4;

            System.out.println("El Total del Consumo del Cliente en el Restaurante es de: $ " + consumoTotal);
        } else {
            System.out.println("Error Debe Consumir al menos 1 Producto");
        }

        scanner.close();
    }
}
