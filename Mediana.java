import java.util.Arrays;
import java.util.Scanner;

public class Mediana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        // Solicitar el tamaño del arreglo
        System.out.print("Ingrese el número de elementos del arreglo: ");
        int n = scanner.nextInt();

        // Declarar y llenar el arreglo con números reales
        double[] x = new double[n];
        System.out.println("Su arreglo se compone de : " + n + " elementos");
        System.out.println("Por favor ingrese la cantidad presionando ENTER despues de cada valor");
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextDouble();
        }

        // Ordenar el arreglo
        Arrays.sort(x);

        // Encontrar y mostrar la mediana
        double mediana;
        if (n % 2 == 1) {
            // Si el número de elementos es impar, la mediana es el valor central
            mediana = x[n / 2];
        } else {
            // Si el número de elementos es par, la mediana es el promedio de los dos valores centrales
            mediana = (x[(n / 2) - 1] + x[n / 2]) / 2;
        }

        System.out.println("La mediana es: " + mediana);
        scanner.close();
    }
}
