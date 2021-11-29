package miprimerproyecto;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio09 {
//    Escribir un programa que permita ingresar dos valores reales de las coordenadas X
//    e Y de un punto del plano cartesiano. Luego, el programa debe mostrar una leyenda
//    que indique a qué cuadrante pertenece el punto, o en su defecto, si el punto se
//    encuentra sobre alguna de las cuatro ramas de los ejes cartesianos: 

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        double x, y;
        System.out.println("Ingrese la coordenada 'x'");
        x = leer.nextDouble();
        System.out.println("Ingrese la coordenada 'y'");
        y = leer.nextDouble();
        if (x > 0 && y > 0) {
            System.out.println("La coordenada (" + x + "," + y + ") esta en el primer cuadrante");
        } else if (x < 0 && y > 0) {
            System.out.println("La coordenada (" + x + "," + y + ") esta en el segundo cuadrante");
        } else if (x < 0 && y < 0) {
            System.out.println("La coordenada (" + x + "," + y + ") esta en el tercer cuadrante");
        } else if (x > 0 && y < 0) {
            System.out.println("La coordenada (" + x + "," + y + ") esta en el cuarto cuadrante");
        } else if (x == 0 && y > 0) {
            System.out.println("La coordenada (" + x + "," + y + ") esta en el eje 'y' positivo");
        } else if (x == 0 && y < 0) {
            System.out.println("La coordenada (" + x + "," + y + ") esta en el eje 'y' negativo");
        } else if (x > 0 && y == 0) {
            System.out.println("La coordenada (" + x + "," + y + ") esta en el eje 'x' positivo");
        } else if (x < 0 && y == 0) {
            System.out.println("La coordenada (" + x + "," + y + ") esta en el eje 'x' negativo");
        } else {
            System.out.println("La coordenada (" + x + "," + y + ") esta en el origen");
        }
    }
}
