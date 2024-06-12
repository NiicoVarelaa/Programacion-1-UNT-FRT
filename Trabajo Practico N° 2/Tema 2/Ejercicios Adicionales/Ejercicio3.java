import java.util.Scanner;

public class Ejercicio3 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hola Ingrese la Fecha como un Número Entero. Ejemplo: DD/MM/AA");
        int fechaIngresada = scanner.nextInt();

        if (fechaIngresada > 99999 && fechaIngresada < 999999) {
            int mesIngresado = fechaIngresada/100;
            mesIngresado = mesIngresado % 100;
            if (mesIngresado > 0 && mesIngresado <= 12) {
                String mesMostrar = String.valueOf(mesIngresado);
                System.out.println("Los Digitos que Representan solo al mes son: " + mesMostrar);
            } else {
                System.out.println("Error: Los Meses deben ser entre 1 a 12");
            }
        } else{
            System.out.println("Error: La Fecha tiene que ser un Número Entero. Ejemplo: DD/MM/AA");
        }

        scanner.close();
    }
}