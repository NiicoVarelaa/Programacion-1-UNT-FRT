import java.util.Scanner;

public class Ejercicio8 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido para usar la Calculadora siga las siguientes instrucciones");

        System.out.println("Presione A si quiere realizar una Suma");
        System.out.println("Presione B si quiere realizar una Resta");
        System.out.println("Presione C si quiere realizar una Multiplicación");
        System.out.println("Presione D si quiere realizar una División");
        System.out.println("Presione E para salir");
        char letraCalculadora = scanner.next().charAt(0);

        switch (letraCalculadora) {
            case 'A':
                System.out.println("Ingrese el Primer valor a Sumar ");
                int sumaUno = scanner.nextInt();

                System.out.println("Ingrese el Segundo valor a Sumar ");
                int sumaDos = scanner.nextInt();

                int resultadoSuma = sumaUno + sumaDos;
                System.out.println("El Resultado de la Suma es: " + resultadoSuma);

                break;
            
            case 'B':
                System.out.println("Ingrese el Primer valor a Restar ");
                int restaUno = scanner.nextInt();

                System.out.println("Ingrese el Segundo valor a Restar ");
                int restaDos = scanner.nextInt();

                int resultadoResta = restaUno - restaDos;
                System.out.println("El Resultado de la Resta es: " + resultadoResta);
                break;

            case 'C':
                System.out.println("Ingrese el Primer valor a Multiplicar ");
                int multiplicacionUno = scanner.nextInt();

                System.out.println("Ingrese el Segundo valor a Multiplicar ");
                int multiplicacionDos = scanner.nextInt();

                int resultadoMultiplicacion = multiplicacionUno * multiplicacionDos;
                System.out.println("El Resultado de la Multiplicación es: " + resultadoMultiplicacion);
                break;

            case 'D':
                System.out.println("Ingrese el Primer valor a Dividir ");
                int divisionUno = scanner.nextInt();

                System.out.println("Ingrese el Segundo valor a Dividir ");
                int divisionDos = scanner.nextInt();

                int resultadoDivision = divisionUno / divisionDos;
                System.out.println("El Resultado de la División es: " + resultadoDivision); 
                break;

            case 'E':
                System.out.println("Saliendo del Programa...");
                break;

            default:
                System.out.println("Opción no válida");
                break;
        }

        scanner.close();
    }
}

