import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;

        do {
            System.out.print("Ingrese Password que tenga minimo 1 Letra Mayuscula, 1 caracter Especial, 1 Numero, no debe ser de menos de 10 digitos: ");
            password = scanner.nextLine();

            if (!isSecurePassword(password)) {
                System.out.println("La contraseña no cumple con los parámetros mínimos requeridos.");
                System.out.println("Intente nuevamente.");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("Por favor ingrese una contrseña con los parametros requeridos");
                System.out.println("Como Minimo 1 Letra Mayuscula, 1 caracter Especial, 1 Numero, no debe ser de menos de 10 digitos.");
            }
            
          //le agregafmos un while que nos funcione commo bucle y que no permita que se contnue hasta que los parametros rewuridos no esten completos con lo indicado
        } while (!isSecurePassword(password));

        System.out.println("");
        System.out.println("La contraseña es segura.");
        scanner.close();
    }

    public static boolean isSecurePassword(String password) {
        if (password.length() < 10) {
            return false;
        }

        boolean hasLetterUppercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasLetterUppercase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else {
                hasSpecialChar = true;
            }

            // Si todos los requisitos ya se cumplen full, deberia regresar true para eficienciaz<.
            if (hasLetterUppercase && hasDigit && hasSpecialChar) {
                return true;
            }
        }

        // Retorna si todos los criterios se cumplieron después de revisar todos los caracteres con los requisitos de la primera pantallaas.
        return hasLetterUppercase && hasDigit && hasSpecialChar;
    }
}