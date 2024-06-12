import java.util.Scanner;

public class Ejercicio8 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la Fecha Actual");
        
        System.out.println("Ingrese el Año Actual");
        int añoActual = scanner.nextInt();

        System.out.println("Ingrese el Mes Actual");
        int mesActual = scanner.nextInt();

        System.out.println("Ingrese el Día Actual");
        int diaActual = scanner.nextInt();

        System.out.println("Ingrese la Fecha a Consultar");
        
        System.out.println("Ingrese el Año a Consultar");
        int añoConsultar = scanner.nextInt();

        System.out.println("Ingrese el Mes a Consultar");
        int mesConsultar = scanner.nextInt();

        System.out.println("Ingrese el Día a Consultar");
        int diaConsultar = scanner.nextInt();

        if (añoConsultar < añoActual) {
            System.out.println("Fecha Correcta");
        } else if (añoConsultar == añoActual) {
            if (mesConsultar < mesActual) {
                System.out.println("Fecha Correcta");
            } else if (mesConsultar == mesActual) {
                if (diaConsultar < diaActual) {
                    System.out.println("Fecha Correcta");
                } else {
                    System.out.println("Fecha Incorrecta");
                }
            } else {
                System.out.println("Fecha Incorrecta");
            }
        } else {
            System.out.println("Fecha Incorrecta");
        }

        scanner.close();
    }
}