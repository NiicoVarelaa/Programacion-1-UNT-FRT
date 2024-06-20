import java.util.Random;
import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        mostrarNotasComision2();
    }

    private static void mostrarNotasComision2() {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Alumnos Comisión 2");
        
        double matriz [][] = new double[101] [5];

        for (int i = 1; i < matriz.length; i++) {
            matriz [i] [0] = i ;
        }

        for (int i = 1; i < matriz.length; i++) {
            matriz[i][1] = rd.nextInt(10) + 1;
        }

        for (int i = 1; i < matriz.length; i++) {
            matriz[i][2] = rd.nextInt(10) + 1;
        }

        for (int i = 1; i < matriz.length; i++) {
            matriz[i][3] = rd.nextInt(10) + 1; 
        }

        for (int i = 1; i < matriz.length; i++) {
            matriz[i][4] = (matriz[i][1] + matriz[i][2] + matriz[i][3]) / 3;
        }

        System.out.println();
        System.out.println("Legajo     1T     2T       3T    Promedio");
        System.out.println();
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf("%.1f\t  ", matriz[i][j]); 
            }
            System.out.println();
        }

        int registro = 1;
        int numLegajo;

        while (registro == 1) {
            System.out.println("Ingrese el Legajo del Alumno");
            numLegajo = sc.nextInt();

            System.out.println();
            System.out.println("Ingrese el Número del Trimestre que Desea Corregir: 1 - 2 - 3 o Ingrese 4 para Mostrar el Registro Actualizado");
            int numIngresado = sc.nextInt();
            sc.nextLine();

            int notaIngresada;

            switch (numIngresado) {
                case 1:
                    System.out.println("La Nota Acutal es: " + matriz [numLegajo] [1]);
                    System.out.println();
                    System.out.println("Ingrese la Nueva Nota del 1er Trimestre");
                    notaIngresada = sc.nextInt();

                    sc.nextLine();

                    System.out.println();
                    System.out.println("¿Desea Confirmar la Nueva Nota? Ingrese: Si caso Contrario Ingrese: No");
                    String confirmarNota1 = sc.nextLine();
                    if (confirmarNota1.equalsIgnoreCase("Si")) {
                        matriz[numLegajo][1] = notaIngresada;
                        matriz[numLegajo][4] = (matriz[numLegajo][1] + matriz[numLegajo][2] + matriz[numLegajo][3]) / 3;
                    }

                    break;
    
                case 2:
                    System.out.println("La Nota Acutal es: " + matriz [numLegajo] [2]);
                    System.out.println();
                    System.out.println("Ingrese la Nueva Nota del 1er Trimestre");
                    notaIngresada = sc.nextInt();

                    sc.nextLine();

                    System.out.println();
                    System.out.println("¿Desea Confirmar la Nueva Nota? Ingrese: Si caso Contrario Ingrese: No");
                    String confirmarNota2 = sc.nextLine();
                    if (confirmarNota2.equalsIgnoreCase("Si")) {
                        matriz[numLegajo][2] = notaIngresada;
                        matriz[numLegajo][4] = (matriz[numLegajo][1] + matriz[numLegajo][2] + matriz[numLegajo][3]) / 3;
                    }

                    break;
    
                case 3:
                    System.out.println("La Nota Acutal es: " + matriz [numLegajo] [3]);
                    System.out.println();
                    System.out.println("Ingrese la Nueva Nota del 1er Trimestre");
                    notaIngresada = sc.nextInt();

                    sc.nextLine();

                    System.out.println();
                    System.out.println("¿Desea Confirmar la Nueva Nota? Ingrese: Si caso Contrario Ingrese: No");
                    String confirmarNota3 = sc.nextLine();
                    if (confirmarNota3.equalsIgnoreCase("Si")) {
                        matriz[numLegajo][3] = notaIngresada;
                        matriz[numLegajo][4] = (matriz[numLegajo][1] + matriz[numLegajo][2] + matriz[numLegajo][3]) / 3;
                    }

                    break;
    
                case 4:
                    registro = 0;
                    break;
    
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                    break;
            }
        }

        System.out.println();
        System.out.println("Legajo     1T     2T       3T    Promedio");
        System.out.println();
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf("%.1f\t  ", matriz[i][j]); 
            }
            System.out.println();
        }

        sc.close();
    }

}


/* De los 100 alumnos de una escuela se ingresa:
a. nota del 1° trimestre, nota del 2o trimestre, nota del 3o trimestre
b. El orden de ingreso coincide con su número de legajo que es de 1 a 100
c. Luego del registro el programa debe preguntar al usuario si desea corregir alguna nota, para lo cual 
se debe ingresar:
1.N° de legajo
2.Trimestre a corregir (1,2 o 3)
3.Nueva nota
d. El programa debe mostrar la nota anterior correspondiente al trimestre indicado y preguntar si 
confirma la modificación. Si contesta "SI" se registra la nueva nota, caso contrario pregunta si desea 
continuar. Cuando no se registren más modificaciones se deberá listar:
e. N° DE LEGAJO 1° TRIMESTRE 2° TRIMESTRE 3 TRIMESTRE PROMEDIO
 XXXXXX XX XX. XX XX.XX */