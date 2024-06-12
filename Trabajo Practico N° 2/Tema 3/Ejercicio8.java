import java.util.Scanner;

public class Ejercicio8 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numFamilias, hijosPorFamilia, numMaxHijosPorFamilia = 0, numMinHijosPorFamilia = 0;
        int edad, ci, ciMaxHijos = 0, ciMinHijos = 0;
        int contadorFamilias = 0, contadorHijosFamilia = 0;
        int totalHijos = 0, ciTotal = 0, ciTotalMenores6 = 0, ciTotalMayores6 = 0;
        int totalHijosMenores6 = 0, totalHijosMayores6 = 0;
        double promHijosPorFamilia, ciPromHijos, ciPromHijosMenores6, ciPromHijosMayores6;

        System.out.println("Ingrese El Numero de Familias");
        numFamilias = scanner.nextInt();

        while (contadorFamilias < numFamilias) {
            contadorHijosFamilia = 0;
            System.out.println("Ingrese la cantidad de hijos por familia");
            hijosPorFamilia = scanner.nextInt();
            totalHijos += hijosPorFamilia;

            if (contadorFamilias == 0) {
                numMinHijosPorFamilia = hijosPorFamilia;
                numMaxHijosPorFamilia = hijosPorFamilia;
            } else {
                if (hijosPorFamilia > numMaxHijosPorFamilia) {
                    numMaxHijosPorFamilia = hijosPorFamilia;
                }
                if (hijosPorFamilia < numMinHijosPorFamilia) {
                    numMinHijosPorFamilia = hijosPorFamilia;
                }
            }

            while (contadorHijosFamilia < hijosPorFamilia) {
                System.out.println("Ingrese la Edad");
                edad = scanner.nextInt();
                System.out.println("Ingrese el CI");
                ci = scanner.nextInt();

                if (edad < 6) {
                    ciTotalMenores6 += ci;
                    totalHijosMenores6++;
                } else {
                    ciTotalMayores6 += ci;
                    totalHijosMayores6++;
                }

                ciTotal += ci;

                if (contadorHijosFamilia == 0) {
                    ciMaxHijos = ci;
                    ciMinHijos = ci;
                } else {
                    if (ci > ciMaxHijos) {
                        ciMaxHijos = ci;
                    }
                    if (ci < ciMinHijos) {
                        ciMinHijos = ci;
                    }
                }

                contadorHijosFamilia++;
            }

            contadorFamilias++;
        }

        promHijosPorFamilia = (double) totalHijos / numFamilias;
        ciPromHijos = (double) ciTotal / totalHijos;
        ciPromHijosMenores6 = (double) ciTotalMenores6 / totalHijosMenores6;
        ciPromHijosMayores6 = (double) ciTotalMayores6 / totalHijosMayores6;

        System.out.println("El número máximo de hijos por familia es: " + numMaxHijosPorFamilia);
        System.out.println("El número mínimo de hijos por familia es: " + numMinHijosPorFamilia);
        System.out.println("El promedio de hijos por familia es: " + promHijosPorFamilia);
        System.out.println("El CI Maximo de los hijos es: " + ciMaxHijos);
        System.out.println("El CI Minimo de los hijos es: " + ciMinHijos);
        System.out.println("El promedio del CI de todos los hijos de todas las familias es: " + ciPromHijos);
        System.out.println("El promedio del CI de los hijos mayores de 6 años es: " + ciPromHijosMayores6);
        System.out.println("El promedio del CI de los hijos menores de 6 años es: " + ciPromHijosMenores6);
        
        scanner.close();
    }
}