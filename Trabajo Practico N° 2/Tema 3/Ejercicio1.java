import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suma = 0;
        double numMinimo = 0;
        double numMaximo = 0;
        double promedio = 0;
        int contador = 0;

        while (contador < 10) {
            System.out.println("Ingrese un Número");
            int numIngresado = scanner.nextInt();
            suma = suma + numIngresado;
            

            if (contador == 0) {
                numMinimo = numIngresado;
                numMaximo = numIngresado;
            } else {
                if (numMinimo < numIngresado) {
                    numMinimo = numIngresado;
                }
                if (numMaximo > numIngresado) {
                    numMaximo = numIngresado;
                }
            }
            contador++;
        }

        promedio = suma / 10;

        System.out.println("La suma de los números es: " + suma);
        System.out.println("El promedio de los números es: " + promedio);
        System.out.println("El número menor es: " + numMinimo);
        System.out.println("El número mayor es: " + numMaximo);
        
        scanner.close();
    }
}

