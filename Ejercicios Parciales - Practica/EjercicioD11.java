import java.util.Scanner;

public class EjercicioD11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroAleatorio = (int)(Math.random() * 20) + 1;
        System.out.println("El Numero Ganador a Adivinar es: " + numeroAleatorio);

        int numeroAleatorioComputadora = 0;
        int sumaIntetosComputadora = 0;

        int numeroAleatorioUsuario = 0;
        int sumaIntetosUsuario = 0;

        boolean encontrado = false;

        while (!encontrado) {
            
            numeroAleatorioUsuario = (int)(Math.random() * 20) + 1;
            int diferenciaUsuario = numeroAleatorio - numeroAleatorioUsuario;
            int diferenciaUsuarioAbsoluta = Math.abs(diferenciaUsuario); 

            numeroAleatorioComputadora = (int)(Math.random() * 20) + 1;
            int diferenciaComputadora = numeroAleatorio - numeroAleatorioComputadora;
            int diferenciaComputadoraAbsoluta = Math.abs(diferenciaComputadora);

            if (diferenciaUsuarioAbsoluta == 0) {
                System.out.println("Felicidades Usuario Ganaste");
                sumaIntetosUsuario++;
                encontrado = true;
                break;
            } else {
                if (diferenciaUsuarioAbsoluta > 10) {
                    System.out.println("Usuario Loser");
                } else if (diferenciaUsuarioAbsoluta >= 5 && diferenciaUsuarioAbsoluta < 9) {
                    System.out.println("Usuario Medio Loser");
                } else {
                    System.out.println("Usuario Casi Winer");
                }
                sumaIntetosUsuario++;
            }

            if (numeroAleatorioComputadora == numeroAleatorio) {
                System.out.println("Felicidades Computadora Ganaste");
                sumaIntetosComputadora++;
                encontrado = true;
            } else {
                if (diferenciaComputadoraAbsoluta > 10) {
                    System.out.println("Computadora Loser");
                } else if (diferenciaComputadoraAbsoluta >= 5 && diferenciaComputadoraAbsoluta < 9) {
                    System.out.println("Computadora Medio Loser");
                } else {
                    System.out.println("Computadora Casi Winer");
                }
                sumaIntetosComputadora++;
            }

        }

        System.out.println("Los intentos del Usuario Fueron: " + sumaIntetosUsuario);
        System.out.println("Los intentos de la Computadora Fueron: " + sumaIntetosComputadora);

        scanner.close();
    }
}


/* Juego de adivinar el numero en menos intentos: Crea un programa que permita jugar a Adivinar un Numero generado aleatoriamente por la computadora entre (1 y 20), El jugador y la computadora se turnan para adivinar el numero mostrando los siguientes mensajes:
    * Si la diferencia entre el numero ganador y el numero adivinado es mayor que 10 mostrar "Loser"
    * Si la diferencia esta entre 5 y 9 mostrar "Medio Loser"
    * Si la diferencia es menor a 5 "Casi Winer"
    * Si la diferencia es 0 Entonces mostrar un mensaje original

    * Estos mensajes deben mostrarse para los 2 jugadores.

    * Ayuda: El valor absoluto de un numero es igual al valor positivo de un numero dado, ejemplo, Math.abs(-5) = 5 y Math.abs(5) = 5

Al final el programa debe indicar quien adivino el numero con menos intentos. */

/*  */
