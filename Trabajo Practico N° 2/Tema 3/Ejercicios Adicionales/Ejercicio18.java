import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número de 4 cifras para cifrarlo");
        int numIngresado = scanner.nextInt();
        String cifrado = ""; 

        for (int i = 0; i < 4; i++) {             
            char digito = Integer.toString(numIngresado).charAt(i);
            int digitoSumado = Character.getNumericValue(digito) + 7;
            cifrado += digitoSumado % 10;     
            }
        String numCifrado = cifrado.charAt(2) + "" + cifrado.charAt(3) + "" + cifrado.charAt(0) + "" + cifrado.charAt(1);
        int numFinal = Integer.parseInt(numCifrado);
        System.out.println("Número cifrado: " + numFinal);

        scanner.close();
    }
}
