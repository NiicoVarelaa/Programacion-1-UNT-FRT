import java.util.Scanner;

public class Ejercicio7 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Determinar si en el Colegio hay un equipo para competir en los campeonatos regionales");
        
        int carrera200Metros = 10;
        int carrera1500Metros = 15;
        int equiposParticipantes = 1;
        int tiempoMenor = 25;
        int equipoGanador = 0;

        while (equiposParticipantes <= 10) {
            System.out.println("Ingrese los Datos del Equipo " + equiposParticipantes);

            int participantesEquipo = 0;

            while (participantesEquipo < 5) {
                int tiempoTotalEquipo = 0;        
                boolean equipoDescalificado = false;
                
                System.out.println("Equipo " + equiposParticipantes);

                System.out.println("El Tiempo de la Carrera de 200 Metros es: ");
                int tiempoCarrera200 = (int) (Math.random() * 15) + 1;
                System.out.println(tiempoCarrera200);
                System.out.println("El Tiempo de la Carrera de 1500 Metros es: ");
                int tiempoCarrera1500 = (int) (Math.random() * 20) + 1;
                System.out.println(tiempoCarrera1500);
        
                if (tiempoCarrera200 < carrera200Metros) {
                    if (tiempoCarrera1500 < carrera1500Metros) {
                        tiempoTotalEquipo = tiempoTotalEquipo + tiempoCarrera200 + tiempoCarrera1500;
                    } else {
                        equipoDescalificado = true;
                        break;
                    }
                } else { 
                    equipoDescalificado = true;
                    break;
                }
                if (!equipoDescalificado && tiempoTotalEquipo < tiempoMenor) {
                    equipoGanador = equiposParticipantes;
                    tiempoMenor = tiempoTotalEquipo;
                }
                participantesEquipo++;
            }            
            equiposParticipantes++; 
        }

        if (equipoGanador != 0) {
            System.out.println("El Equipo Clasificado es el Equipo: " + equipoGanador + " con un tiempo total de " + tiempoMenor + "min");
        } else {
            System.out.println("Ningún equipo cumple con los criterios para participar en los campeonatos regionales.");
        }

        scanner.close();
    }
}
