import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un Número en Segundos");
        int segundosIngresados = scanner.nextInt();
        int minutos = 0;
        int segundos = 0;

        if (segundosIngresados > 0) {
            minutos = segundosIngresados / 60;    
            segundos = segundosIngresados % 60;
        } else {
            System.out.println("Error");
        }

        System.out.println("Los Segundos Ingresados son: " + minutos + "min " + segundos + "seg");
        
        scanner.close();
    }
}
