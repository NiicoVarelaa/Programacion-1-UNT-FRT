import java.util.Scanner;

public class EjercicioF1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los Minutos para Saber su equivalente en Días o Horas");
        int minutosIngresados = scanner.nextInt();

        if (minutosIngresados > 0) {
            int dias = minutosIngresados / 1440; 
            int horas = (minutosIngresados % 1440) / 60; 
            int minutosRestantes = minutosIngresados % 60;

            if (dias > 0) {
                System.out.println("El Tiempo es: " + dias + " días y " + horas + " horas y " + minutosRestantes + " minutos");
            } else if (horas > 0) {
                System.out.println("El Tiempo es: " + horas + " horas y " + minutosRestantes + " minutos");
            } else {
                System.out.println("El Tiempo es: " + minutosIngresados + " minutos");
            }
        } else {
            System.out.println("Error");
        }

        scanner.close();
    }
}
