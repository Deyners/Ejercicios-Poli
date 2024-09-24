import java.util.Scanner;

public class Personaje {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Te voy a leer la mente, ");
        System.out.println("Piensa en uno de los siguientes personajes (pero no lo digas en voz alta):");
        System.out.println("");
        System.out.println("1. Radamel Falcao García");
        System.out.println("2. Goku");
        System.out.println("3. Michael Jordan");
        System.out.println("4. Eminem");
        System.out.println("5. Darth Vader");
        System.out.println("6. Adam Sandler");
        System.out.println("7. Bruce Wayne");
        System.out.println("8. Tin Tin");
        System.out.println("9. Ayudante de Santa");
        System.out.println("10. Joe Biden");
        System.out.println("11. José Saramago");
        System.out.println("12. Günter Grass");
        System.out.println("13. Kim Jong Un");
        System.out.println("");
        System.out.println("Pero antes, responde a unas preguntas en tu mente");
        
        boolean jugar = true;
        while (jugar) {
            String personaje = adivinaPersonaje(scanner);
            System.out.println("Creo que estás pensando en " + personaje);

            System.out.print("¿Quieres jugar de nuevo? (S/N): ");
            String respuesta = scanner.next();

            // Utilizamos una expresión regular para validar la entrada
            String pattern = "(?i)(s|si|sí|yes|y)(?!.*n|no)";
            jugar = respuesta.matches(pattern);
        }
    }

    private static String adivinaPersonaje(Scanner scanner) {
        boolean esReal = pregunta(scanner, "¿Es un personaje real?");
        if (esReal) {
            return preguntaReal(scanner);
        } else {
            boolean esCaricatura = pregunta(scanner, "¿Es un personaje de caricatura?");
            if (esCaricatura) {
                return preguntaCaricatura(scanner);
            } else {
                boolean esHeroe = pregunta(scanner, "¿Tu personaje es un héroe?");
                if (esHeroe) {
                    return "Bruce Wayne (Batman)";
                } else {  
                    return "Darth Vader";
                }
            }
        }
    }

    private static String preguntaCaricatura(Scanner scanner) {
        boolean esAnimal = pregunta(scanner, "¿Tu personaje es un animal?");
        if (esAnimal) {
            return "Ayudante de Santa (el perro de los Simpsons)";
        } else {
            boolean esVuela = pregunta(scanner, "¿Tu personaje puede volar?");
            if (esVuela) {
                return "Goku";
            } else {
                return "Tin-tin";
            }
        }
    }

    private static String preguntaReal(Scanner scanner) {
        boolean esNorteamericano = pregunta(scanner, "¿Tu personaje es norteamericano?");
        if (esNorteamericano) {
            boolean esPolitico = pregunta(scanner, "¿Tu personaje es político?");
            if (esPolitico) {
                return "Joe Biden";
            } else {
                boolean esActor = pregunta(scanner, "¿Tu personaje es actor?");
                if (esActor) {
                    return "Adam Sandler";
                } else {
                    boolean esCantante = pregunta(scanner, "¿Tu personaje es cantante?");
                    if (esCantante) {
                        return "Eminem";
                    } else {
                        return "Michael Jordan";
                    }
                }
            }
        } else {
            // Personajes no norteamericanos
            boolean esEscritor = pregunta(scanner, "¿Tu personaje es escritor?");
            if (esEscritor) {
                boolean esAleman = pregunta(scanner, "¿Tu personaje es alemán?");
                if (esAleman) {
                    return "Günter Grass";
                } else {
                    return "José Saramago";
                }
            } else {
                boolean esPolitico = pregunta(scanner, "¿Tu personaje es político?");
                if (esPolitico) {
                    return "Kim Jong Un";
                } else {
                    return "Radamel Falcao García";
                }
            }
        }
    }

    private static boolean pregunta(Scanner scanner, String pregunta) {
        System.out.print(pregunta + " (S/N): ");
        String respuesta = scanner.next();

        // Utilizamos una expresión regular para validar la entrada
        String pattern = "(?i)(s|si|sí|yes|y)(?!.*n|no)";
        return respuesta.matches(pattern);
    }
}