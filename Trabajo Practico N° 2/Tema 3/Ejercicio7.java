import java.util.Scanner;

public class Ejercicio7 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la Cantidad de Pacientes");
        int pacientes = scanner.nextInt();
        int edadPacientes = 0;
        int edadPacientesInternados = 0;
        int edadPacientesOperados = 0;

        for (int i = 1; i <= pacientes; i++) {
            System.out.println("Ingrese la edad del paciente");
            int edad = scanner.nextInt();
            edadPacientes = edadPacientes + edad;
            
            double indiceMed = Math.random();

            if (indiceMed > 0.6) {
                if (indiceMed > 0.9) {
                    System.out.println("Paciente para operar");
                    edadPacientesOperados += edad;
                } else {
                    System.out.println("Paciente para internar");
                    edadPacientesInternados += edad;
                }
            } 
        }        
        
        int edadMediaPacientes = edadPacientes / pacientes; 
        int edadMediaPacientesInternados = edadPacientesInternados / pacientes; 
        int edadMediaPacientesOperados = edadPacientesOperados / pacientes; 

        System.out.println("La edad media de los pacientes es: " + edadMediaPacientes);
        System.out.println("La edad media de los pacientes internados es: " + edadMediaPacientesInternados);
        System.out.println("La edad media de los pacientes operados es: " + edadMediaPacientesOperados);

        scanner.close();
    }
}
