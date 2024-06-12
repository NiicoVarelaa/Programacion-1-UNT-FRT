import java.util.Scanner;

public class Ejercicio9 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las Notas de los Alumnos");

        System.out.println("Ingrese la Primer Nota");
        int primerNota = scanner.nextInt();

        System.out.println("Ingrese la Segunda Nota");
        int segundaNota = scanner.nextInt();

        System.out.println("Ingrese la Tercer Nota");
        int tercerNota = scanner.nextInt();

        if (primerNota>0 && primerNota<11 || segundaNota<0 && segundaNota<11 || tercerNota>0 && tercerNota<11) {
            int promedioNotas = (primerNota + segundaNota + tercerNota) / 3;
            if (promedioNotas > 7) {
                System.out.println("Aprobado");
            } else {
                System.out.println("Desaprobado");
            }
        } else {
            System.out.println("Error las Notas son del 1 al 10");
        }

        scanner.close();
    }
}