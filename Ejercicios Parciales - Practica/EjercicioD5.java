import java.util.Scanner;

public class EjercicioD5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numIngresado = scanner.nextInt();

        for (int i = 1; i < numIngresado; i++) {
            
            int sumadivisores = 0;
            int contador = 1;

            while (contador < i) {
                if (i % contador == 0) {
                    sumadivisores = sumadivisores + contador;
                }
                contador++;
            }
            
            if (sumadivisores == i) {
                System.out.println("El Número: " + i + " Es PERFECTOOOOOOOOOOOO");
            }
        }

        scanner.close();
    }
}


/* Ingrese un numero como limite para mostrar los Numeros perfectos que hay desde el 1 hasta el numero ingresado */
// Un numero perfecto es aquel, que es igual a la suma de todos sus divisores excepto el mismo. 
// El primer numero perfecto es el 6 ya que 1 + 2 + 3 = 6
