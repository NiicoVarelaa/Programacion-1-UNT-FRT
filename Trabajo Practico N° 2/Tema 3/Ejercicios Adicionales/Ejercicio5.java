import java.util.Scanner;

public class Ejercicio5 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Los Logaritmos Decimal y Neperiano de los Números comprendidos entre 1 y 100 son:");

        int numDecimales = 0;

        while (numDecimales < 101) {
            double logDecimal = Math.log(numDecimales)/Math.log(10);
            double logNeperiano = Math.log(numDecimales);

            String logDecimalFormatted = String.format("%.4f", logDecimal);
            String logNeperianoFormatted = String.format("%.4f", logNeperiano);
            System.out.println(numDecimales + " Los Logaritmos Decimales son: " + logDecimalFormatted + "        Los Logaritmos Neperianos son: " + logNeperianoFormatted);
            numDecimales = numDecimales + 5; 
        }

        scanner.close();
    }
}
