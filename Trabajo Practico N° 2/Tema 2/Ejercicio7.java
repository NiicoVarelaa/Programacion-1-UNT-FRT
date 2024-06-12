import java.util.Scanner;

public class Ejercicio7 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hombres = 0;
        int mujeres = 0;
        int contador = 0;

        while (contador < 3) {
            System.out.println("Ingrese la Edad");
            int edad = scanner.nextInt();

            System.out.println("Ingrese el Sexo");
            String sexo = scanner.next();

            if (sexo.equals("Mujer")) {
                if (edad >= 20 && edad <= 30) {
                    mujeres = mujeres + 1;
                }
            } else if (sexo.equals("Hombre")) {
                if (edad <= 37 && edad >= 0) {
                    hombres = hombres + 1;
                } else {
                    System.out.println("Error");
                }
            }
            contador++;
        }

        System.out.println("La cantidad de Hombres de edad entre 20 y 30 es: " + hombres);
        System.out.println("'La cantidad de Mujeres de edad menor o igual a 37 es: " + mujeres);

        scanner.close();
    }
}