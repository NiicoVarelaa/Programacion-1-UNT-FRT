import java.util.Scanner;

public class Ejercicio9 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido Ingrese la Cantidad de Pasajeros que inician el viaje y la Cantidad de paradas hasta el final");

        System.out.println("Ingrese la Cantidad de Pasajeros");
        int pasajerosIngresados = scanner.nextInt();

        System.out.println("Ingrese la Cantidad de Paradas");
        int paradas = scanner.nextInt();

        int contador = 0;
        int pasajerosTotales = pasajerosIngresados;

        while (contador < paradas) {
            int pasajerosBajan = pasajerosIngresados / 2;
            int pasajerosSuben = pasajerosIngresados + 3;
            pasajerosTotales = pasajerosTotales + pasajerosSuben - pasajerosBajan;
            contador++;
        }

        System.out.println("Los Pasajeros que llegaron al final del trayecto son: " + pasajerosTotales);

        scanner.close();
    }
}