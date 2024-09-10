
import java.util.Scanner;
public class Siglo {
	public static int siglo(int anho) {
        if (anho % 100 == 0) {
            return anho / 100;
            } else {
            return (anho / 100) + 1;
        }
    }
	public static int primer_anho(int siglo) {
		return (siglo - 1) * 100 + 1;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("INDIQUE EL AÑO EN NUMEROS: ");
		int anho = scanner.nextInt();
		int siglo = siglo(anho);
		int primer_anho = primer_anho(siglo);
		
		 System.out.println("USTED A INGRESADO EL AÑO " + anho + " QUE PERTENECE AL SIGLO " + siglo);
		 System.out.println("EL PRIMER AÑO DEL SIGLO " + siglo + " ES EL AÑO " + primer_anho);
		 
	}
	}
