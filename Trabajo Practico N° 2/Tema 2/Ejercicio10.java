import java.util.Scanner;

public class Ejercicio10 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hola ingrese su temperatura en grados centígrados, para determinar el deporte adecuado");
        int gradosCentigrados = scanner.nextInt();

        int gradosFahrenheit = (gradosCentigrados*9/5)+32;

        if (gradosFahrenheit > 85) {
            System.out.println("Usted puede hacer Natación");
        } else if (gradosFahrenheit > 35 && gradosFahrenheit <= 70) {
            System.out.println("Usted puede hacer Golf");
        } else if (gradosFahrenheit > 32 && gradosFahrenheit <= 35) {
            System.out.println("Usted puede hacer Esquí");
        } else {
            System.out.println("Usted puede hacer otro Deporte");
        }
        
        scanner.close();
    }
}

