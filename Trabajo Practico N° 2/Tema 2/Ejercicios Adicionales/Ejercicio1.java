import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hola Ingrese los Segundos, Minutos y la Hora");

        System.out.println("Ingrese la Hora");
        int horaIngresada = scanner.nextInt();

        System.out.println("Ingrese los Minutos");
        int minutosIngresados = scanner.nextInt();

        System.out.println("Ingrese los Segundos");
        int segundosIngresados = scanner.nextInt();
        
        if (horaIngresada < 24 && horaIngresada >= 0) {

            if (minutosIngresados < 60 && minutosIngresados >= 0) {

                if (segundosIngresados < 60 && segundosIngresados >= 0) {
                    
                    if (segundosIngresados == 59) {
                        segundosIngresados = 0; 
                        
                        if (minutosIngresados == 59) {
                            minutosIngresados = 0; 
                            
                            if (horaIngresada == 23) {
                                horaIngresada = 0; 
                            } else {
                                horaIngresada++; 
                            }
                        } else {
                            minutosIngresados++; 
                        }
                    } else {
                        segundosIngresados++; 
                    }
                    System.out.println("La Hora Ingresada es: " + horaIngresada + "hs " + minutosIngresados + "min " + segundosIngresados + "seg");
                } else {
                    System.out.println("Error: Los Segundos deben estar entre 0 y 59");
                }
            } else {
                System.out.println("Error: Los Minutos deben estar entre 0 y 59");
            }
        } else {
            System.out.println("Error: La Hora debe estar entre 0 y 23");
        }
        
        scanner.close();
    }
}