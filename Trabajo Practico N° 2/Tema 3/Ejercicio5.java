import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la Cantidad de Tanques de Nafta");
        int tanques = scanner.nextInt();
        

        for (int i = 1; i <= tanques; i++ ) {
            int kilómetrosManejados = (int) (Math.random() * 40) + 1 ;
            int litrosUtilizados = (int) (Math.random() * 30) + 1 ;
            int kilometrajePorLitro = kilómetrosManejados / litrosUtilizados;

            System.out.println("Los Kilometros Por Litros en el Tanque " + i + " Son: " + kilometrajePorLitro);
        }
        
        scanner.close();
    }
}
