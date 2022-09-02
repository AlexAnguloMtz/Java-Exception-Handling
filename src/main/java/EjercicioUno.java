public class EjercicioUno {
    static char caracterEn(String cadena, int indice) throws Exception {
        if(cadena == null || indice > cadena.length()) {
            throw new Exception();
        }
        return cadena.charAt(indice);
    }
}
