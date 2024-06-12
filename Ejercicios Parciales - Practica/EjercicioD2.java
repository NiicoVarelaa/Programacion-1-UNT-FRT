import java.util.Scanner;

public class EjercicioD2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una Contraseña");
        String contraseña = scanner.next();
        
        if (contraseña.length() > 7) {
            boolean mayuscula = false;
            boolean minuscula = false;
            boolean numero = false;
            char c;

            for (int i=0; i < contraseña.length(); i++) {
                c = contraseña.charAt(i);

                if (Character.isDigit(c)) {
                    numero = true;
                }

                if (Character.isUpperCase(c)) {
                    mayuscula = true;
                }

                if (Character.isLowerCase(c)) {
                    minuscula = true;
                }

                if (numero && mayuscula && minuscula) {  
                    System.out.println("Contraseña Validada");
                } 
            }
        } else {
            System.out.println("Ingrese una contraseña con 8 o mas caracteres");
        }

        scanner.close();
    }
}
