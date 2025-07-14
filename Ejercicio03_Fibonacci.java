/*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */

public class Ejercicio03_Fibonacci{
    public static void main(String[] args) {
        Fibonacci();
    }
        public static void Fibonacci() {            
            long first = 0;                         // La serie empieza en 0
            long second = 1;                    

            for(int i = 0; i<25; i++){              // Al imprimir dos numeros, hago 25 iteracciones
                System.out.println(first);          // Imprimo el primer número
                first = first + second;             // Asigno el nuevo valor al primer número
                System.out.println(second);         // Imprimo el segundo   
                second = second + first;            // Asigno su nuevo valor al segundo
            }
        }
}
