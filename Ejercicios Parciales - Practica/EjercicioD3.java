import java.util.Scanner;

public class EjercicioD3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double competidor1 = Math.random() * 30;
        double competidor2 = Math.random() * 30;
        double competidor3 = Math.random() * 30;

        int tiempo = 0;

        int distanciaCompetidor1 = 0;
        int distanciaCompetidor2 = 0;
        int distanciaCompetidor3 = 0;
        
        while (distanciaCompetidor1 < 1000 || distanciaCompetidor2 < 1000 || distanciaCompetidor3 < 1000) {

            distanciaCompetidor1 = (int) (competidor1 * tiempo);
            distanciaCompetidor2 = (int) (competidor2 * tiempo);
            distanciaCompetidor3 = (int) (competidor3 * tiempo);

            if (distanciaCompetidor1 > distanciaCompetidor2 && distanciaCompetidor1 > distanciaCompetidor3) {
                System.out.println("El Competidor 1 va ganando!");
            } else if (distanciaCompetidor2 > distanciaCompetidor1 && distanciaCompetidor2 > distanciaCompetidor3) {
                System.out.println("El Competidor 2 va ganando!");
            } else if (distanciaCompetidor3 > distanciaCompetidor1 && distanciaCompetidor3 > distanciaCompetidor2) {
                System.out.println("El Competidor 3 va ganando!");
            } 

            tiempo++;
        }
        
        if (distanciaCompetidor1 > distanciaCompetidor2 && distanciaCompetidor1 > distanciaCompetidor3) {
            System.out.println("El Ganador es el Competidor Numero 1");
        }

        if (distanciaCompetidor2 > distanciaCompetidor1 && distanciaCompetidor2 > distanciaCompetidor3) {
            System.out.println("El Ganador es el Competidor Numero 2");
        }

        if (distanciaCompetidor3 > distanciaCompetidor1 && distanciaCompetidor3 > distanciaCompetidor2) {
            System.out.println("El Ganador es el Competidor Numero 3");
        }

        scanner.close();
    }
}

/* Diseñe un programa que simule una carrera de autos entre 3 competidores. Cada competidor tiene una velocidad aleatoria
y debe recorrer una distancia de 1000 metros. El programa debe mostrar la posicion de cada competidor cada 1 segundo de tiempo y finalizar cuando un competidor alcanza la meta. Y mostrar que competidor gano.

velocidad = distancia/tiempo
distancia = velocidad * tiempo */
