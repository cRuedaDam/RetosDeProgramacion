/*
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */

public class Ejercicio04_EsPrimo{

    public static void main(String[] args) {
        for(int i = 1; i<=100; i++){
            if(isPrime(i)){
                System.out.println(i + " - Es primo");                          
            }else{
                System.out.println(i + " - No es primo");     
            }
        }
    }

    private static boolean isPrime(int number){        
        if (number < 2){                          // 1 y 0 No se consideran números primos
        return false;
       }

       for(int i = 2; i<=Math.sqrt(number); i++){ // Busco si el número tiene algún divisor entre 2 y su raíz cuadrada
            if(number % i == 0){                  // i en esta caso divide a number, por lo que no es primo
                return false;
            }
        }
        return true;                              //No se encuentra ningún divisor, Es primo.      
    }
}