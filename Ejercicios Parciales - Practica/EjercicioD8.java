import java.util.Scanner;

public class EjercicioD8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numIngresado = scanner.nextInt();
        int sumaImpares = 0;

        for (int i = 1; i <= numIngresado; i++) {
            if (i % 2 != 0) {
                sumaImpares = sumaImpares + i;
            }
        }

        System.out.println("La suma de los numeros impares es: " + sumaImpares);

        scanner.close();
    }
}


/* Ingrese un numero como limite y muestre la sumas de los numero impares hasta el num ingresado */
