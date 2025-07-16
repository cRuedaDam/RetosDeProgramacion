

/*
 * Crea una única función (importante que sólo sea una) que sea capaz
 * de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */

public class Ejercicio05_PolygonArea {
    public static void main(String[] args) {
        System.out.println("El área del triángulo es: " + area("Triángulo", 10.0, 5.0));
        System.out.println("El área del rectángulo es: " + area("Rectángulo",10.0, 5.0));
        System.out.println("El área del cuadrado es: " + area("Cuadrado",5.0, 5.0));
    }

    public static Double area(String polygon, Double base, Double hight){
        Double polygonArea = 0.0;

            if (polygon.equalsIgnoreCase("Triángulo")){
                polygonArea = (base * hight)/2;
            }else if(polygon.equalsIgnoreCase("Cuadrado")){
                polygonArea = base * base;
            }else if (polygon.equalsIgnoreCase("Rectángulo")) {
                polygonArea = base * hight;
            }else{
                System.out.println("Polígono no reconocido");
            }
        return polygonArea;
    }
}
