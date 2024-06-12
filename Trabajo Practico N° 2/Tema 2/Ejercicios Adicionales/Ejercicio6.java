import java.util.Scanner;

public class Ejercicio6 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hola Ingrese una Fecha con el formato AAAA/MM/DD para determinar si es Correcta o no");

        System.out.println("Ingrese el Año ");
        int añoIngresado = scanner.nextInt();
        boolean añoBisiesto = false;

        System.out.println("Ingrese el Mes ");
        int mesIngresado = scanner.nextInt();

        System.out.println("Ingrese el Día ");
        int diaIngresado = scanner.nextInt();

        if (añoIngresado > 0 && añoIngresado < 2100) {
            if ((añoIngresado % 4 == 0 && añoIngresado % 100 != 0) || añoIngresado % 400 == 0) {
                System.out.println("El año es Bisiesto");
                añoBisiesto = true;
            } else {
                System.out.println("El año no es Bisiesto");
            }
        } else {
            System.out.println("Error: Ingrese un año válido");
        }
        
        if (mesIngresado > 0 && mesIngresado < 13) {
            switch (mesIngresado) {
                case 1, 3, 5, 7, 8, 10, 12:
                    if (diaIngresado > 0 && diaIngresado < 32) {
                        System.out.println("La Fecha Ingresada es Correcta");
                    } else {
                        System.out.println("La Fecha Ingresada es Incorrecta");
                    }
                    break;
                case 4, 6, 9, 11:
                    if (diaIngresado > 0 && diaIngresado < 31) {
                        System.out.println("La Fecha Ingresada es Correcta");
                    } else {
                        System.out.println("La Fecha Ingresada es Incorrecta");
                    }
                    break;
                case 2:
                    if ((añoBisiesto && diaIngresado > 0 && diaIngresado < 30) || (!añoBisiesto && diaIngresado > 0 && diaIngresado < 29)) {
                        System.out.println("La Fecha Ingresada es Correcta");
                    } else {
                        System.out.println("La Fecha Ingresada es Incorrecta");
                    }
                    break;
                default:
                    System.out.println("Error: Ingreso un Mes inválido");
            }
        } else {
            System.out.println("Error: Ingresó un Mes inválido");
        }

        scanner.close();
    }
}
