import java.util.Scanner;

public class Ejercicio11 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0, aux, n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, valorEncontrar;

        System.out.println("Ingrese 10 Números");
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        n3 = scanner.nextInt();
        n4 = scanner.nextInt();
        n5 = scanner.nextInt();
        n6 = scanner.nextInt();
        n7 = scanner.nextInt();
        n8 = scanner.nextInt();
        n9 = scanner.nextInt();
        n10 = scanner.nextInt();

        while (contador < 10) {
            if (n1 > n2) {
                aux = n1;
                n1 = n2;
                n2 = aux;
            }
            if (n2 > n3) {
                aux = n2;
                n2 = n3;
                n3 = aux;
            }
            if (n3 > n4) {
                aux = n3;
                n3 = n4;
                n4 = aux;
            }
            if (n4 > n5) {
                aux = n4;
                n4 = n5;
                n5 = aux;
            }
            if (n5 > n6) {
                aux = n5;
                n5 = n6;
                n6 = aux;
            }
            if (n6 > n7) {
                aux = n6;
                n6 = n7;
                n7 = aux;
            }
            if (n7 > n8) {
                aux = n7;
                n7 = n8;
                n8 = aux;
            }
            if (n8 > n9) {
                aux = n8;
                n8 = n9;
                n9 = aux;
            }
            if (n9 > n10) {
                aux = n9;
                n9 = n10;
                n10 = aux;
            }
            contador++;
        }

        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6 + " " + n7 + " " + n8 + " " + n9 + " " + n10);

        System.out.println("Ingrese el valor que desea encontrar");
        valorEncontrar = scanner.nextInt();

        if (n1 == valorEncontrar || n2 == valorEncontrar || n3 == valorEncontrar || n4 == valorEncontrar || n5 == valorEncontrar ||
                n6 == valorEncontrar || n7 == valorEncontrar || n8 == valorEncontrar || n9 == valorEncontrar || n10 == valorEncontrar) {
            System.out.println("Valor Encontrado");
        } else {
            System.out.println("Valor No Encontrado");
        }
        
        scanner.close();
    }
}