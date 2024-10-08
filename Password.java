import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese Password: ");
        String Password = scanner.nextLine();

        if (isSecurePassword(Password)) {
            System.out.println("La contraseña es segura.");
        } else {
            System.out.println("La contraseña no cumple con los parámetros mínimos requeridos.");
        }

        scanner.close();
    }

    public static boolean isSecurePassword(String password) {
        if (password.length() < 10) {
            return false;
        }

        boolean hasLetter = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (char ch : password.toCharArray()) {
            if (Character.isLetter(ch)) {
                hasLetter = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else {
                hasSpecialChar = true;
            }

            // Si todos los requisitos ya se cumplen full, retornamos true para eficiencia.
            if (hasLetter && hasDigit && hasSpecialChar) {
                return true;
            }
        }

        // Retorna si todos los criterios se cumplieron después de revisar todos los caracteres de acuerdo al mensaje que le salioo al iniciio.
        return hasLetter && hasDigit && hasSpecialChar;
    }
}
