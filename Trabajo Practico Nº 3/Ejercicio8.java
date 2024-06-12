import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean pararPrograma = true; 

        while (pararPrograma) { 
            System.out.println("\n");
            System.out.println("Ingrese la Operacion que Desea Realizar");
            System.out.println("----------------------------------");
            System.out.println("1) De Menor a Mayor, en valor absoluto.");
            System.out.println("2) De Menor a Mayor, algebraicamente (con signo)");
            System.out.println("3) De Mayor a Menor, en valor absoluto");
            System.out.println("4) De Mayor a Menor, algebraicamente (con signo)");
            System.out.println("5) Para Salir");
            int opcionIngresada = sc.nextInt(); 

            switch (opcionIngresada) {
                case 1:
                    vectorMenorMayor(sc);
                    break;

                case 2:
                    vectorMenorMayorAlgebraicamente(sc);
                    break;

                case 3:
                    vectorMayorMenor(sc);
                    break;

                case 4:
                    vectorMayorMenorAlgebraicamente(sc);
                    break;

                case 5:
                    pararPrograma = false;
                    break;

                default:
                    System.out.println("Opción no Válida");
                    break;
            }
        }

        sc.close(); 
        System.out.println("Programa finalizado");

    }

    public static void vectorMenorMayor(Scanner sc) {
        Random rd = new Random();
        System.out.println("Ingrese la Longitud del Vector");
        int longitud = sc.nextInt();

        int vector [] = new int[longitud];

        for (int i = 0; i < vector.length; i++) {
            vector [i] = rd.nextInt(100) + 1;
        }

        int aux;

        for (int i = 0; i < vector.length-1; i++) {
            for (int j = 0; j < vector.length-1; j++) {
                if (vector[j] > vector[j + 1]) {
                    aux = vector[j];
                    vector [j] = vector[j + 1];
                    vector[j + 1] = aux;
                }
            }
        }

        System.out.println("Vector ordenado de Menor a Mayor:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }

    }

    public static void vectorMenorMayorAlgebraicamente(Scanner sc) {
        Random rd = new Random();
        System.out.println("Ingrese la Longitud del Vector");
        int longitud = sc.nextInt();
        

        int vector [] = new int[longitud];

        for (int i = 0; i < vector.length; i++) {
            vector [i] = rd.nextInt(100) - 50;
        }

        int aux;

        for (int i = 0; i < vector.length-1; i++) {
            for (int j = 0; j < vector.length-1; j++) {
                if (vector[j] > vector[j + 1]) {
                    aux = vector[j];
                    vector [j] = vector[j + 1];
                    vector[j + 1] = aux;
                }
            }
        }

        System.out.println("Vector ordenado de Menor a Mayor:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }

    }

    public static void vectorMayorMenor(Scanner sc) {
        Random rd = new Random();
        System.out.println("Ingrese la Longitud del Vector");
        int longitud = sc.nextInt();

        int vector [] = new int[longitud];

        for (int i = 0; i < vector.length; i++) {
            vector [i] = rd.nextInt(100) + 1;
        }

        int aux;

        for (int i = 0; i < vector.length-1; i++) {
            for (int j = 0; j < vector.length-1; j++) {
                if (vector[j] < vector[j + 1]) {
                    aux = vector[j];
                    vector [j] = vector[j + 1];
                    vector[j + 1] = aux;
                }
            }
        }

        System.out.println("Vector ordenado de Mayor a Menor:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }

    }

    public static void vectorMayorMenorAlgebraicamente(Scanner sc) {
        Random rd = new Random();
        System.out.println("Ingrese la Longitud del Vector");
        int longitud = sc.nextInt();

        int vector [] = new int[longitud];

        for (int i = 0; i < vector.length; i++) {
            vector [i] = rd.nextInt(100) - 50;
        }

        int aux;

        for (int i = 0; i < vector.length-1; i++) {
            for (int j = 0; j < vector.length-1; j++) {
                if (vector[j] < vector[j + 1]) {
                    aux = vector[j];
                    vector [j] = vector[j + 1];
                    vector[j + 1] = aux;
                }
            }
        }

        System.out.println("Vector ordenado de Mayor a Menor:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }

    }

}

/*  Modifique el programa anterior de manera que pueda realizar cualquiera de las siguientes operaciones:
    a) de menor a mayor, en valor absoluto.
    b) de menor a mayor, algebraicamente (con signo)
    c) de mayor a menor, en valor absoluto
    d) de mayor a menor, algebraicamente (con signo)
    Incluir un menú que permita al usuario seleccionar qué ordenación será usada cada vez que se ejecute 
    el programa. 
*/