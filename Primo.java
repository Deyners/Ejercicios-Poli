import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			// Solicita un número entero positivo
			System.out.print("Ingrese un número entero POSITIVO :D : ");
			int n = scanner.nextInt();
			
			// Validar que n sea positivo
			if (n < 1) {
			    System.out.println("ingrese un número entero positivo -_- POSITIVOOO ¡¡ .");
			    return;
			}
			
			// Calcular la suma de números primos menores o iguales a n
			int suma = 0;
			for (int i = 2; i <= n; i++) {
			    if (esPrimo(i)) {
			        suma += i;
			    }
			}
			
			// Imprimir el resultado
			System.out.println("La suma de los números primos menores o iguales que " + n + " es: " + suma);
		}
    }
    
    // verifica si un número es primo
    public static boolean esPrimo(int num) {
        if (num < 2) {
            return false; // 0 y 1 no son primos
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // si es divisible por i, no es primo
            }
        }
        return true; // es primo
    }
}