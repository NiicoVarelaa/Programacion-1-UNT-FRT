import java.util.Random;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la Dimension del Vector A");
        int dimensionA = sc.nextInt();
        int vectorA [] = new int[dimensionA];

        System.out.println("Ingrese la Dimension del Vector B");
        int dimensionB = sc.nextInt();
        int vectorB [] = new int[dimensionB];

        int vectorC [] = new int[dimensionA + dimensionB];
        
        for (int i = 0; i < vectorA.length; i++) {
            vectorA [i] = rd.nextInt(100) + 1;
        }

        System.out.println("");
        System.out.println("Vector A");
        for (int i = 0; i < vectorA.length; i++) {
            System.out.print(vectorA[i] + " ");
        }

        for (int i = 0; i < vectorB.length; i++) {
            vectorB [i] = rd.nextInt(100) + 1;
        }

        System.out.println("\n");
        System.out.println("Vector B");
        for (int i = 0; i < vectorB.length; i++) {
            System.out.print(vectorB[i] + " ");
        }

        int auxA;
        int auxB;

        for (int i = 0; i < vectorA.length-1; i++) {
            for (int j = 0; j < vectorA.length-1; j++) {
                if (vectorA[j] > vectorA[j + 1]) {
                    auxA = vectorA[j];
                    vectorA [j] = vectorA[j + 1];
                    vectorA[j + 1] = auxA;
                }
            }
        }

        System.out.println("\n");
        System.out.println("Vector A ordenado Ascendentemente:");
        System.out.println("");
        for (int i = 0; i < vectorA.length; i++) {
            System.out.print(vectorA[i] + " ");
        }

        for (int i = 0; i < vectorB.length-1; i++) {
            for (int j = 0; j < vectorB.length-1; j++) {
                if (vectorB[j] < vectorB[j + 1]) {
                    auxB = vectorB[j];
                    vectorB [j] = vectorB[j + 1];
                    vectorB[j + 1] = auxB;
                }
            }
        }

        System.out.println("\n");
        System.out.println("Vector B ordenado Decrecientemente:");
        System.out.println("");
        for (int i = 0; i < vectorB.length; i++) {
            System.out.print(vectorB[i] + " ");
        }

        for (int i = 0; i < vectorB.length-1; i++) {
            for (int j = 0; j < vectorB.length-1; j++) {
                if (vectorB[j] > vectorB[j + 1]) {
                    auxB = vectorB[j];
                    vectorB [j] = vectorB[j + 1];
                    vectorB[j + 1] = auxB;
                }
            }
        }

        System.out.println("\n");
        System.out.println("Vector B ordenado Ascendentemente:");
        System.out.println("");
        for (int i = 0; i < vectorB.length; i++) {
            System.out.print(vectorB[i] + " ");
        }
        
        sc.close();
    }

}

/* Dados 2 vectores A y B de orden N y M, el primero ordenado ascendente y el segundo ordenado 
descendente, crear un nuevo vector C de orden N+M elementos intercalando los elementos de A Y 
B de modo que C quede ordenado ascendente. Es decir que hay que primero ordenar B de modo 
ascendente para luego intercalar los valores de A y B de modo que C quede ordenado 
ascendentemente sin utilizar ningún método de ordenamiento. */