import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;

        do {
            System.out.print("Ingrese Password que tenga minimo 1 Letra , 1 caracter Especial, 1 Numero, no debe ser de menos de 10 digitos: ");
            password = scanner.nextLine();

            if (!isSecurePassword(password)) {
                System.out.println("La contraseña no cumple con los parámetros mínimos requeridos. Intente nuevamente.");
            }
        } while (!isSecurePassword(password));

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