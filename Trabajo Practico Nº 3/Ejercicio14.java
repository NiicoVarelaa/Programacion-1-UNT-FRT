import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        if (!encontrado()) {
            System.out.println("Error: El País o la Capital están incorrectos o no se encuentran.");
        }

    }

    private static boolean encontrado() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el País o la Capital que desea Buscar");
        String datoIngresado = sc.nextLine();

        String países [] = {"Canadá", "Inglaterra" , "Francia", "Alemania", "India", "Israel", "Italia", "Japón", "Mexico", "China", "Rusia", "Estados Unidos"};

        String capitales [] = {"Ottawa", "Londres" , "París", "Berlin", "Nueva Delhi", "Jerusalén", "Roma", "Tokio", "Ciudad de Mexico", "Pekín", "Moscú", "Washington"};

        boolean encontrado = false;

        for (int i = 0; i < países.length; i++) {
            if (datoIngresado.equals(países[i])) {
                System.out.println("La Capital de " + países[i] + " es " + capitales[i]);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            for (int i = 0; i < capitales.length; i++) {
                if (datoIngresado.equals(capitales[i])) {
                    System.out.println("El País de " + capitales[i] + " es " + países[i]);
                    encontrado = true;
                    break;
                }
            }
        } 

        sc.close();
        return encontrado;
    }

}