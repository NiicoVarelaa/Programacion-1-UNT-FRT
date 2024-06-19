import java.util.Random;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        nombreCompletoConLegajo();
    }

    private static void nombreCompletoConLegajo() {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la Dimension del Vector");
        int dimensionVector = sc.nextInt();
        sc.nextLine();

        int vectorLegajo [] = new int [dimensionVector];
        String vectorApellidoNombre [] = new String [dimensionVector];

        String auxNombre;
        int auxLegajo;

        System.out.println("");
        for (int i = 0; i < dimensionVector; i++) {
            System.out.println("");
            System.out.println("Ingrese el Apellido y el Nombre");
            String nombreCompleto = sc.nextLine();
            if (nombreCompleto.length() <= 30) {
                vectorApellidoNombre[i] = nombreCompleto;
                vectorLegajo [i] = rd.nextInt(9999999) + 9999999;
                System.out.println("El Numero de Legajo para " + nombreCompleto + " es: " + vectorLegajo[i]);
            } else {
                System.out.println("Error");
                break;
            }
            
        }

        for (int i = 0; i < vectorApellidoNombre.length; i++) {
            for (int j = 0; j < vectorApellidoNombre.length-1; j++) {
                if (vectorApellidoNombre[j].compareToIgnoreCase(vectorApellidoNombre[j + 1]) > 0) {
                    auxNombre = vectorApellidoNombre [j];
                    auxLegajo = vectorLegajo[j];
                    vectorApellidoNombre [j] = vectorApellidoNombre [j + 1];
                    vectorLegajo [j] = vectorLegajo [j + 1];
                    vectorApellidoNombre [j + 1] = auxNombre;
                    vectorLegajo [j + 1] = auxLegajo;
                }
            }
        }

        System.out.println("\n");
        System.out.println("Los Nombres Ordenados Alfabeticamente son:");
        for (int i = 0; i < dimensionVector; i++) {
            System.out.println(vectorApellidoNombre[i] + " Numero de Legajo: " + vectorLegajo[i]);
        }

        sc.close();
    }

}

/* Se tiene un listado consistente en los siguientes ítems almacenados en 2 vectores (A y B)de orden N:
A ->Número de Legajo (8 dígitos)
B ->Apellido-Nombre (30 caracteres)
Se quiere obtener un listado ordenado alfabéticamente por apellido-nombre, con el número de legajo 
correspondiente. */
