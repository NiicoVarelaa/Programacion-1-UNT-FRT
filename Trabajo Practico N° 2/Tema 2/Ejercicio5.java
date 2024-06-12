import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el Radio, para ver Perimetro, Area, Volumen");
        int radio = scanner.nextInt();

        double perimetro = 0;
        double area = 0;
        double volumen = 0;

        if (radio > 0) {
            perimetro = 2*3.14*radio;
            area = 3.14*(Math.pow(radio, 2));
            volumen = 4/3*3.14*(Math.pow(radio, 3));
        } else {
            System.out.println("Error");
        }

        System.out.println("El Perimetro es: " + perimetro + " El Area es: " + area + " El Volumen es: " + volumen);

        scanner.close();
    }
}
