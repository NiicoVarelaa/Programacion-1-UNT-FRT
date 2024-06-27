import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class Prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        UUID.randomUUID();

        System.out.println("Ingrese los Datos");

        Empleado empleados [] = new Empleado [10];

        for (int i = 0; i < empleados.length; i++) {

            String nombre = UUID.randomUUID().toString().substring(0,10);            
            int sueldo = rd.nextInt(5000) + 1;

            Empleado empleado = new Empleado(nombre, sueldo);
            empleados[i] = empleado;
        }

        for (int i = 0; i < empleados.length; i++) {
            System.out.println(empleados[i].toString());
        }


        sc.close();
    }
}
