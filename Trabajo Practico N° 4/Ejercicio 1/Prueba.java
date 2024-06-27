import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los Datos");

        Contacto persona1 = new Contacto("Nico", "Varela");
        Contacto persona2 = new Contacto("Juan", "Lescano", 153456675);

        System.out.println("El Aprellido de la Persona 1 es:");
        System.out.println(persona1.getApellido());
        persona2.setApellido("Martinez");
        System.out.println();
        System.out.println("El Aprellido de la Persona 2 Ahora es: " + persona2.getApellido());


        sc.close();
    }
}
