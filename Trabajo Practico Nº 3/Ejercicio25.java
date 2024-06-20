import java.util.Random;
import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        mostrarRegistroEmpresa();
    }

    private static void mostrarRegistroEmpresa() {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Empresa Financiera");
        
        int matriz [][] = new int[101] [6];

        for (int i = 1; i < matriz.length; i++) {
            matriz [i] [0] = i ;
        }

        for (int i = 1; i < matriz.length; i++) {
            matriz[i][1] = rd.nextInt(9000) + 999;
        }

        for (int i = 1; i < matriz.length; i++) {
            matriz[i][2] = rd.nextInt(9000) + 999;
        }

        for (int i = 1; i < matriz.length; i++) {
            matriz[i][3] = rd.nextInt(3000) + 999; 
        }

        for (int i = 1; i < matriz.length; i++) {
            matriz[i][4] = rd.nextInt(5000) + 999;
        }

        for (int i = 1; i < matriz.length; i++) {
            matriz[i][5] = matriz[i][1] + matriz[i][4] - matriz[i][2] - matriz[i][3];
        }

        System.out.println();
        System.out.println("Nº Cliente   T-Depósitos    T-Extracciones   Comisiones      Intereses        Saldo");
        System.out.println();
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t      ");
            }
            System.out.println();
        }

        int registro = 1;
        int numCliente;

        while (registro == 1) {
            System.out.println("Ingrese el N° de Cliente");
            numCliente = sc.nextInt();

            System.out.println();
            System.out.println("Elija la Operacion que Desea Realizar");
            System.out.println("Ingrese 1 para hacer un Depósito");
            System.out.println("Ingrese 2 para hacer una Extracción");
            System.out.println("Ingrese 3 para hacer un Déposito");
            System.out.println("Ingrese 4 para hacer un Déposito");
            System.out.println("Ingrese 5 para Mostrar el Registro Actualizado");
            int numIngresado = sc.nextInt();
    
            switch (numIngresado) {
                case 1:
                    System.out.println("Ingrese el Monto del Deposito");
                    int deposito = sc.nextInt();
                    matriz [numCliente] [1] += deposito;
                    matriz [numCliente] [5] += deposito;
                    break;
    
                case 2:
                    System.out.println("Ingrese el Monto de la Extracción");
                    int extraccion = sc.nextInt();
                    matriz [numCliente] [2] -= extraccion;
                    matriz [numCliente] [5] -= extraccion;
                    break;
    
                case 3:
                    System.out.println("Ingrese el Monto de la Comisión");
                    int comisión = sc.nextInt();
                    matriz [numCliente] [3] -= comisión;
                    matriz [numCliente] [5] -= comisión;
                    break;
    
                case 4:
                    System.out.println("Ingrese el Monto de los Intereses");
                    int interes = sc.nextInt();
                    matriz [numCliente] [4] += interes;
                    matriz [numCliente] [5] += interes;
                    break;
    
                case 5:
                    registro = 0;
                    break;
    
                default:
                        System.out.println("Opción no válida. Inténtelo de nuevo.");
                    break;
            }
        }

        int mayorDeposito = 0;
        int clienteMayor = 0;

        for (int i = 1; i < matriz.length; i++) {
            if (matriz[i][1] > mayorDeposito) {
                mayorDeposito = matriz[i][1];
                clienteMayor = i;
            }
        }

        
        System.out.println("\n");
        System.out.println("Registro Actualizado");
        System.out.println("Nº Cliente   T-Depósitos    T-Extracciones   Comisiones      Intereses        Saldo");
        System.out.println();
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t      ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("El Cliente que tubo la Mayor Cantidad Depósitada es el: " + clienteMayor + " con una Cantidad de: $ " + mayorDeposito);

        sc.close();
    }

}


/* Una empresa financiera tiene 100 clientes numerados de 1 a 100. Por cada transacción se registra: 
a. N° de cliente
b. Código de transacción: 
1.Depósito
2.Extracción
3.Comisiones deducidas.
4. Intereses acreditados.
c. Monto de la operación
d. No se conoce la cantidad de transacciones que se realizan. 
Se desea Emitir un listado con la siguiente información:
N° De Cliente | Total Depósitos | Total Extracciones | Total Comisiones | Total Intereses | Saldo

--------------------------------------------------------------------------------------------------------------------------------
XXXXXXX | XXXXXXXX | XXXXXXXXX | XXXXXXXXX | XXXXXXX | XXX
----------------------------------------------------------------------------------------------------------------------------
Indicar (por impresora) cual fue el cliente con mayor cantidad depositada y cual fue esa cantidad. Se 
debe mostrar si hay más de un cliente con el depósito máximo */