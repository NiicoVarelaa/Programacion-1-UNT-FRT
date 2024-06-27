import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        vectorOrdenadoAlfabeticamente();
    }

    private static void vectorOrdenadoAlfabeticamente() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la Dimension del Vector");
        int dimensionVector = sc.nextInt();
        sc.nextLine();
        String nombres [] = new String[dimensionVector];

        String aux;

        for (int i = 0; i < dimensionVector; i++) {
            System.out.println("Ingrese el Nombre");
            String nombreIngresado = sc.nextLine();
            if (nombreIngresado.length() <= 30) {
                nombres[i] = nombreIngresado;
            } else {
                System.out.println("Error");
                break;
            }
            
        }

        for (int i = 0; i < dimensionVector; i++) {
            for (int j = 0; j < dimensionVector-1; j++) {
                if (nombres[j].compareTo(nombres[j + 1]) > 0) {
                    aux = nombres [j];
                    nombres [j] = nombres [j + 1];
                    nombres [j + 1] = aux;
                }
            }
        }
        
        System.out.println("\n");
        System.out.println("Los Nombres Ordenados Alfabeticamente son:");
        for (int i = 0; i < dimensionVector; i++) {
            System.out.println(nombres[i]);
        }

        sc.close();
    }

}

/* Cargar un conjunto de nombres de personas (cadenas de caracteres de longitud máxima 30) en un vector. 
Mostrar un listado ordenado alfabéticamente */