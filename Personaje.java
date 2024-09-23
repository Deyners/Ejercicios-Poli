import java.util.Scanner;
public class Personaje {
	public static void main(String args []) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Piensa en uno de los siguientes personajes (pero no lo digas en voz alta):");
        System.out.println("Radamel Falcao García, Goku, Michael Jordan, Eminem, Darth Vader, Adam Sandler,");
        System.out.println("Bruce Wayne, Tin Tin, Ayudante de Santa, Joe Biden, José Saramago, Günter Grass, Kim Jong Un.");
		
     // Primera pregunta
        System.out.println("¿Es tu personaje una persona real? (Sí/No)");
        String respuesta = scanner.nextLine().toLowerCase();
        
        if (respuesta.equals("sí") ) {
            // Segunda pregunta para personajes reales
            System.out.println("¿Es tu personaje un deportista? (Sí/No)");
            respuesta = scanner.nextLine().toLowerCase();

            if (respuesta.equals("sí") || respuesta.equals("si")) {
                System.out.println("¿Es tu personaje futbolista? (Sí/No)");
                respuesta = scanner.nextLine().toLowerCase();
                if (respuesta.equals("sí") || respuesta.equals("si")) {
                    System.out.println("Tu personaje es Radamel Falcao García.");
                } else {
                    System.out.println("Tu personaje es Michael Jordan.");
                }
            } else {
                System.out.println("¿Es tu personaje un político? (Sí/No)");
                respuesta = scanner.nextLine().toLowerCase();
                if (respuesta.equals("sí") || respuesta.equals("si")) {
                    System.out.println("¿Es tu personaje el presidente de Estados Unidos? (Sí/No)");
                    respuesta = scanner.nextLine().toLowerCase();
                    if (respuesta.equals("sí") || respuesta.equals("si")) {
                        System.out.println("Tu personaje es Joe Biden.");
                    } else {
                        System.out.println("Tu personaje es Kim Jong Un.");
                    }
                } else {
                    System.out.println("¿Es tu personaje un artista? (Sí/No)");
                    respuesta = scanner.nextLine().toLowerCase();
                    if (respuesta.equals("sí") || respuesta.equals("si")) {
                        System.out.println("¿Es tu personaje un rapero? (Sí/No)");
                        respuesta = scanner.nextLine().toLowerCase();
                        if (respuesta.equals("sí") || respuesta.equals("si")) {
                            System.out.println("Tu personaje es Eminem.");
                        } else {
                            System.out.println("Tu personaje es Adam Sandler.");
                        }
                    } else {
                        System.out.println("¿Es tu personaje un escritor? (Sí/No)");
                        respuesta = scanner.nextLine().toLowerCase();
                        if (respuesta.equals("sí") || respuesta.equals("si")) {
                            System.out.println("¿Es tu personaje de origen portugués? (Sí/No)");
                            respuesta = scanner.nextLine().toLowerCase();
                            if (respuesta.equals("sí") || respuesta.equals("si")) {
                                System.out.println("Tu personaje es José Saramago.");
                            } else {
                                System.out.println("Tu personaje es Günter Grass.");
                            }
                        }
                    }
                }
            }
        } else {
            // Tercera pregunta para personajes ficticios
            System.out.println("¿Es tu personaje de una serie de televisión o película? (Sí/No)");
            respuesta = scanner.nextLine().toLowerCase();

            if (respuesta.equals("sí") || respuesta.equals("si")) {
                System.out.println("¿Es un superhéroe? (Sí/No)");
                respuesta = scanner.nextLine().toLowerCase();
                if (respuesta.equals("sí") || respuesta.equals("si")) {
                    System.out.println("¿Es un villano? (Sí/No)");
                    respuesta = scanner.nextLine().toLowerCase();
                    if (respuesta.equals("sí") || respuesta.equals("si")) {
                        System.out.println("Tu personaje es Darth Vader.");
                    } else {
                        System.out.println("Tu personaje es Bruce Wayne.");
                    }
                }
            } else {
                System.out.println("¿Es tu personaje un cómic? (Sí/No)");
                respuesta = scanner.nextLine().toLowerCase();
                if (respuesta.equals("sí") || respuesta.equals("si")) {
                    System.out.println("Tu personaje es Tin Tin.");
                } else {
                    System.out.println("¿Trabaja para Santa Claus? (Sí/No)");
                    respuesta = scanner.nextLine().toLowerCase();
                    if (respuesta.equals("sí") || respuesta.equals("si")) {
                        System.out.println("Tu personaje es el Ayudante de Santa.");
                    } else {
                        System.out.println("Tu personaje es Goku.");
                    }
                }
            }
        }

        scanner.close();
        
		
	}
	
	
}
