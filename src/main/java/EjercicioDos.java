import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int indice = 7;
        char caracterObtenido;
        String entrada = null;
        System.out.println("Ingrese una cadena");
        try {
            entrada = sc.nextLine();
            caracterObtenido = EjercicioUno.caracterEn(entrada, indice);
            System.out.printf
                    ("El caracter en el indice %d de la cadena %s es '%s'", indice, entrada, caracterObtenido);
        } catch (Exception exception) {
            System.out.printf
                    ("Has intentado recuperar una posición de la cadena de caracteres que no existe");
        }
    }
}
