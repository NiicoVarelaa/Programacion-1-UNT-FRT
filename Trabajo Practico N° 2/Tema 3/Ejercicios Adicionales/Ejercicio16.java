import java.util.Scanner;

public class Ejercicio16 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bienvenido para Generar un Numero Aleatorio Presione 1 e Ingrese desde (N) hasta donde (N)");
        int aleatorio = scanner.nextInt();

        boolean pararGenerador = false;

        if (aleatorio == 1) {
            do {
                System.out.println("Numero desde");
                int numeroDesde = scanner.nextInt();
        
                System.out.println("Numero hasta");
                int numeroHasta = scanner.nextInt();
        
                int rango = numeroHasta - numeroDesde + 1;
                int numeroAleatorio = (int) (Math.random() * rango) + numeroDesde;
        
                System.out.println("Número aleatorio: " + numeroAleatorio);

                System.out.println("Ingrese ¨Parar¨ para dejar de generar otro numero");
                String opcionGenerar = scanner.nextLine();

                if (opcionGenerar.equals("Parar")) {
                    pararGenerador = true;
                }
            } while (!pararGenerador);
        } else {
            System.out.println("Error: Presione 1 para Generar un Numero Aleatorio");
        }

        scanner.close();
    }
}
