import java.util.Scanner;

public class Ejercicio7 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hola Tire los Dados 3 Veces y al finalizar obtendra una Calificacion");
        int resultadoDados = 0;

        System.out.println("El Primer Dado es:");
        int primerDado = (int)(Math.random() * 6) + 1;
        System.out.println(primerDado);

        System.out.println("El Segundo Dado es:");
        int segundoDado = (int)(Math.random() * 6) + 1;
        System.out.println(segundoDado);

        System.out.println("El Tercer Dado es:");
        int tercerDado = (int)(Math.random() * 6) + 1;
        System.out.println(tercerDado);

        if (primerDado == 6) {
            resultadoDados++;
        }

        if (segundoDado == 6) {
            resultadoDados++;
        }

        if (tercerDado == 6) {
            resultadoDados++;
        }

        if (resultadoDados >= 1) {
            if (resultadoDados == 3) {
                System.out.println("Su Calificacion es Excelente");
            } else if (resultadoDados == 2) {
                System.out.println("Su Calificacion es Muy Buena");
            } else {
                System.out.println("Su Calificacion es Regular");
            }
        } else {
            System.out.println("Su Calificacion es Pesima");
        } 

        scanner.close();
    }
}
