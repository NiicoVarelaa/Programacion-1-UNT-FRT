import java.util.Scanner;

public class Ejercicio1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la Cantidad de Triangulos para Calcular el Area");
        int triangulosIngresados = scanner.nextInt();
        
        int contador = 0;

        while (contador < triangulosIngresados) {
            System.out.println("Ingrese la Base del Triangulo");
            int base = scanner.nextInt();

            System.out.println("Ingrese la Altura del Triangulo");
            int altura = scanner.nextInt();

            int area = (base * altura)/2;

            System.out.println("El Area de este Triangulo es: " + area);

            contador++;
        }
        
        scanner.close();
    }
}
