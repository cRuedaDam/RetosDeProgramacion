
import java.util.Arrays;

/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */

public class Ejercicio02_Anagrama{
    public static void main(String[] args) {

        System.out.println(isAnagram("Roma", "Amor"));
        System.out.println(isAnagram("Caso", "Saco"));
        System.out.println(isAnagram("Mono", "Mona"));
        System.out.println(isAnagram("Hola", "Halo"));

    }
        public static boolean isAnagram(String first, String second) {

            if(first.equalsIgnoreCase(second)){             // Si las palabras son iguales ignorando el Case. Se retorna falso
                return false;
            }

            if(first.length() != second.length()){          // Si las palabras no tienen la misma longitud no pueden ser anagramas -> False
                return false;
            }

            first = first.toLowerCase();                    // Convertimos las palabras a lowerCase
            second = second.toLowerCase();

            char[] arrayFirst = first.toCharArray();        // Convertimos las palabras a un Array de Caracteres
            char[] arraySecond = second.toCharArray();

            Arrays.sort(arrayFirst);                        // Se ordenan por orden alfabético
            Arrays.sort(arraySecond);

            return Arrays.equals(arrayFirst, arraySecond);  // Si las palabras ordenadas son iguales, son anagrama.
        }
}
