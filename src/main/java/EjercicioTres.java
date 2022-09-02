import java.util.Scanner;

import static java.lang.String.format;

public class EjercicioTres {
    public static void main(String[] args) throws NumeroNegativoException {
        System.out.println("Ingrese un entero");
        final Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt()) {
            System.out.println("Invalido! Ingrese solo enteros. Reinicie el programa");
            return;
        }
        final int entero = sc.nextInt();
        if(entero <= 0) {
            throw new NumeroNegativoException
                    (format("Error! El numero %d es negativo", entero));
        }
        System.out.printf("Bien, el numero %d es positivo. Programa terminado.", entero);
    }
}
