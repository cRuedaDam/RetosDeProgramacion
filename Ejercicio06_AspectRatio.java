import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

/*
 * Crea un programa que se encargue de calcular el aspect ratio de una
 * imagen a partir de una URL.
 * - Por ejemplo: 1920x1080 -> 16:9
 */

public class Ejercicio06_AspectRatio {

    // Método principal del programa
    public static void main(String[] args) throws IOException {

        // URL de la imagen desde la que se quiere obtener el ratio
        String imaUrl = "https://raw.githubusercontent.com/mouredev/mouredev/master/mouredev_github_profile.png";
        
        // Llama al método para obtener el aspecto de la imagen y lo imprime por consola
        System.out.println(getImageDimensions(imaUrl));
    }

    /**
     * Obtiene las dimensiones de la imagen en la URL dada, calcula el aspect ratio y lo devuelve como String.
     *
     * @param imageUrl URL de la imagen
     * @return String con el aspect ratio en formato X:Y o null si hay error
     */

    public static String getImageDimensions(String imageUrl) {
        try {
            // Crea un objeto URL a partir del string
            URL imaUrl = new URL(imageUrl);

            // Lee la imagen desde la URL usando ImageIO
            BufferedImage bufferedImage = ImageIO.read(imaUrl);

            // Obtiene el ancho y alto de la imagen en píxeles
            int imageWidht = bufferedImage.getWidth();
            int imageHeight = bufferedImage.getHeight();

            // Calcula el máximo común divisor (MCD) entre ancho y alto
            int mcd = gcd(imageWidht, imageHeight);

            // Divide las dimensiones entre el MCD para obtener el aspect ratio reducido
            int widhtRatio = imageWidht / mcd;
            int heightRatio = imageHeight / mcd;

            // Devuelve el resultado formateado como texto
            return "El ratio de la imagen es: " + widhtRatio + ":" + heightRatio;

        } catch (IOException e) {
            // Si ocurre un error al leer la imagen, se muestra un mensaje
            System.out.println("Error al descargar o leer la imagen: " + e.getMessage());
            return null;
        }
    }

    /**
     * Calcula el máximo común divisor (MCD) de dos enteros usando el algoritmo de Euclides.
     *
     * @param a Primer número
     * @param b Segundo número
     * @return MCD de a y b
     */
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b; // Reemplaza b por el resto de a entre b
            a = temp;
        }
        return a; // Cuando b es 0, a contiene el MCD
    }
}
