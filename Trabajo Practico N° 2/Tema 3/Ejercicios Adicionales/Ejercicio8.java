import java.util.Scanner;

public class Ejercicio8 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Determinar el Total de lotes Buenos");
        
        final int lotesTotales = 50;
        final int planchasPorLote = 10;
        final double minSuperficie = 4.4;

        int lotesBuenos = 0;
        double superficieTotalBuenos = 0;

        for (int lote = 1; lote <= lotesTotales; lote++) {
            boolean loteBueno = true; 

            System.out.println("Lote " + lote + " :");

            for (int plancha = 1; plancha <= planchasPorLote; plancha++) {
                System.out.println("El Ancho de la Plancha " + plancha + " del Lote " + lote + ":");
                double ancho = Math.random() * 10;
                System.out.println(ancho);
                System.out.println("El Largo de la Plancha " + plancha + " del Lote " + lote + ":");
                double largo = Math.random() * 10; 
                System.out.println(largo);

                double superficie = ancho * largo;

                if (superficie < minSuperficie) {
                    loteBueno = false;
                    break; 
                }
                if (loteBueno) {
                    superficieTotalBuenos = superficieTotalBuenos + superficie; 
                }
            }
            if (loteBueno) {
                lotesBuenos++; 
            }
        }
        System.out.println("Número de Lotes Buenos: " + lotesBuenos);
        if (lotesBuenos > 0) {
            double superficieMedia = superficieTotalBuenos / lotesBuenos / planchasPorLote;
            String superficieMedFormatted = String.format("%.2f", superficieMedia);
            System.out.println("La Superficie Media de las Planchas de Lotes Buenos: " + superficieMedFormatted);
        } else {
            System.out.println("No hay lotes buenos.");
        }
        
        scanner.close();
    }
}
