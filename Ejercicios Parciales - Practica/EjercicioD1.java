import java.util.Scanner;

public class EjercicioD1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero de 4 cifras");
        int numIngresado = scanner.nextInt();
        String numIngresadoTexto = Integer.toString(numIngresado);

        if (numIngresadoTexto.length() > 3  && numIngresadoTexto.length() < 5) {
            String digito1 = numIngresadoTexto.substring(0, 1);
            int digito1Entero = Integer.parseInt(digito1);
            digito1Entero = (digito1Entero + 9)%10;

            String digito2 = numIngresadoTexto.substring(1, 2);
            int digito2Entero = Integer.parseInt(digito2);
            digito2Entero = (digito2Entero + 9)%10;

            String digito3 = numIngresadoTexto.substring(2, 3);
            int digito3Entero = Integer.parseInt(digito3);
            digito3Entero = (digito3Entero + 9)%10;

            String digito4 = numIngresadoTexto.substring(3, 4);
            int digito4Entero = Integer.parseInt(digito4);
            digito4Entero = (digito4Entero + 9)%10;

            String numConcatenado = Integer.toString(digito1Entero) + Integer.toString(digito2Entero) + Integer.toString(digito3Entero) + Integer.toString(digito4Entero); 

            int numCifrado = Integer.parseInt(numConcatenado);

            int esPrimo = 0;

            for (int i = 2; i < numCifrado; i++) {
                
                int creciente = 1;

                while (esPrimo == 0 && creciente < i) {
                    if (i % creciente == 0) {
                        esPrimo = 1;
                        break;
                    } else {
                            creciente++;
                    }
                }
            }

            if (esPrimo == 1) {
                System.out.println("El numero Cifrado es Primo");
                String numDescifradoTexto = Integer.toString(numCifrado);

                String digito1Descifrado = numDescifradoTexto.substring(0, 1);
                int digito1DescifradoEntero = Integer.parseInt(digito1Descifrado);
                digito1DescifradoEntero = ((digito1DescifradoEntero +10)-9)%10;

                String digito2Descifrado = numDescifradoTexto.substring(1, 2);
                int digito2DescifradoEntero = Integer.parseInt(digito2Descifrado);
                digito2DescifradoEntero = ((digito2DescifradoEntero + 10)-9)%10;

                String digito3Descifrado = numDescifradoTexto.substring(2, 3);
                int digito3DescifradoEntero = Integer.parseInt(digito3Descifrado);
                digito3DescifradoEntero = ((digito3DescifradoEntero + 10)-9)%10;

                String digito4Descifrado = numDescifradoTexto.substring(3, 4);
                int digito4DescifradoEntero = Integer.parseInt(digito4Descifrado);
                digito4DescifradoEntero = ((digito4DescifradoEntero + 10)-9)%10;

                String numDescifradoConcatenado = Integer.toString(digito1DescifradoEntero) + Integer.toString(digito2DescifradoEntero) + Integer.toString(digito3DescifradoEntero) + Integer.toString(digito4DescifradoEntero); 

                System.out.println(numDescifradoConcatenado);
            } else {
                System.out.println("El Numero Ingresado Cifrado No es Primo");
            }
            

        } else {
                System.out.println("Debe ingresar un numero solo de 4 cifras");
            } 
            
        scanner.close();
    }
}
