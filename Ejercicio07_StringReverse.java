/*
 * Crea un programa que invierta el orden de una cadena de texto
 * sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */

public class Ejercicio07_StringReverse {

    public static void main(String[] args) {

        // Llama al método que usa StringBuilder para invertir la frase
        System.out.println(stringBuilder("Esta frase es de pprueba"));

        // Llama al método que invierte la frase manualmente (sin StringBuilder)
        System.out.println(manualReverse("Esta es otra frase de prueba"));
    }

    // Método que invierte un String utilizando la clase StringBuilder
    public static String stringBuilder(String string) {
        // Crea un StringBuilder a partir del string original, lo invierte con .reverse(), 
        // y luego lo convierte nuevamente a String
        String reverse = new StringBuilder(string).reverse().toString();
        return reverse; // Devuelve la cadena invertida
    }

    // Método que invierte un String de forma manual (sin usar utilidades externas)
    public static String manualReverse(String string) {

        // Convierte el String original a un array de caracteres
        char[] stringToArray = string.toCharArray();

        // Define dos índices: uno al principio (i) y otro al final (j)
        int i = 0;
        int j = stringToArray.length - 1;

        // Bucle que intercambia los caracteres desde los extremos hacia el centro
        while (i < j) {
            // Intercambia los caracteres en las posiciones i y j
            char temp = stringToArray[i];
            stringToArray[i] = stringToArray[j];
            stringToArray[j] = temp;

            // Avanza hacia el centro
            i++;
            j--;
        }

        // Convierte el array invertido de nuevo a un String
        String reverse = new String(stringToArray);

        // Devuelve la cadena invertida
        return reverse;
    }
}