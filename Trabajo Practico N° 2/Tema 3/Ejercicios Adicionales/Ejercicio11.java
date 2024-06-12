import java.util.Scanner;

public class Ejercicio11 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Los Cuadrados de los numero del 1 al 21 son: ");
        
        int contador = 1;

        do {
            double cuadradoNumero = Math.sqrt(contador);
            String cuadradoNumFormatted = String.format("%.2f", cuadradoNumero);
            System.out.println("El Cuadrado de " + contador + " es: " + cuadradoNumFormatted);
            contador++;
        } while (contador <= 21);

        scanner.close();
    }
}