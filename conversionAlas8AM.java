import java.util.Scanner;
public class conversionAlas8AM {
	public static double conversionA_las8AM(double P) { //calculo para apertura de la banca (apertura del mercado)
	return P;
}
			
public static double conversionAl_Mediodia(double P) { //calculo para reducir el 10 %
    double disminucion = P * 0.10;
    double cantidadAlMediodia = P - disminucion;
    return cantidadAlMediodia;
}
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("DIGITE LA CANTIDAD DE DINERO EN SU MONEDA LOCAL: "); //cuadro que requiere la informacion de entrada
    double cantidadEnMonedaLocal = scanner.nextDouble();
    
    double cantidadALas8AM = conversionA_las8AM(cantidadEnMonedaLocal);
    double cantidadAlMediodia = conversionAl_Mediodia(cantidadEnMonedaLocal);
    
    System.out.println("CANTIDAD DE DINERO A LAS 08:00 HORAS DEL DIA DE HOY: " + cantidadALas8AM);
    System.out.println("CANTIDAD A MEDIO DIA: " + cantidadAlMediodia);
    
    scanner.close();
}
}