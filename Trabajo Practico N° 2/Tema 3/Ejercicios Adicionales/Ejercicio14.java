import java.util.Scanner;

public class Ejercicio14 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido para usar la Calculadora Presione 1");
        int calculadora = scanner.nextInt();

        boolean pararCalculadora = false;

        if (calculadora == 1) {
            do {
                System.out.println("Presione 1 si quiere realizar una Suma");
                System.out.println("Presione 2 si quiere realizar una Resta");
                System.out.println("Presione 3 si quiere realizar una Multiplicación");
                System.out.println("Presione 4 si quiere realizar una División");
                System.out.println("Presione 5 para salir");
                int opcionIngresada = scanner.nextInt();
                
                switch (opcionIngresada) {
                    case 1:
                        System.out.println("Ingrese el Primer valor a Sumar ");
                        int sumaUno = scanner.nextInt();
        
                        System.out.println("Ingrese el Segundo valor a Sumar ");
                        int sumaDos = scanner.nextInt();
        
                        int resultadoSuma = sumaUno + sumaDos;
                        System.out.println("El Resultado de la Suma es: " + resultadoSuma);
        
                        break;
                    
                    case 2:
                        System.out.println("Ingrese el Primer valor a Restar ");
                        int restaUno = scanner.nextInt();
        
                        System.out.println("Ingrese el Segundo valor a Restar ");
                        int restaDos = scanner.nextInt();
        
                        int resultadoResta = restaUno - restaDos;
                        System.out.println("El Resultado de la Resta es: " + resultadoResta);
                        break;
        
                    case 3:
                        System.out.println("Ingrese el Primer valor a Multiplicar ");
                        int multiplicacionUno = scanner.nextInt();
        
                        System.out.println("Ingrese el Segundo valor a Multiplicar ");
                        int multiplicacionDos = scanner.nextInt();
        
                        int resultadoMultiplicacion = multiplicacionUno * multiplicacionDos;
                        System.out.println("El Resultado de la Multiplicación es: " + resultadoMultiplicacion);
                        break;
        
                    case 4:
                        System.out.println("Ingrese el Primer valor a Dividir ");
                        int divisionUno = scanner.nextInt();
        
                        System.out.println("Ingrese el Segundo valor a Dividir ");
                        int divisionDos = scanner.nextInt();
        
                        int resultadoDivision = divisionUno / divisionDos;
                        System.out.println("El Resultado de la División es: " + resultadoDivision); 
                        break;
        
                    case 5:
                        pararCalculadora = true;
                        calculadora = 0;
                        break;
        
                    default:
                        System.out.println("Opción no Válida");
                        break;
                }
            } while (!pararCalculadora);
        } else {
            System.out.println("Error: Presione 1 para Usar la calculadora");
        }
        
        scanner.close();
    }
}
