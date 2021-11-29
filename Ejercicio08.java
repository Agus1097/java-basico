package miprimerproyecto;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio08 {
//    Implementar un programa que lea los coeficientes de una ecuación de 2º grado
//    (ax²+bx+c=0), y muestre sus soluciones reales. Si no existen, se debe mostrar un
//    mensaje por pantalla. Para resolver la ecuación se debe calcular el discriminante:

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        double a, b, c, disc, x1, x2;
        System.out.println("Sea la ecuacion de segundo grado ax^2+bx+c");
        System.out.println("Ingrese el coeficiente 'a'");
        a = leer.nextDouble();
        System.out.println("Ingrese el coeficiente 'b'");
        b = leer.nextDouble();
        System.out.println("Ingrese el coeficiente 'c'");
        c = leer.nextDouble();

        disc = Math.pow(b, 2) - 4 * a * c;

        if (disc >= 0) {
            x1 = (-b + Math.sqrt(disc)) / (2 * a);
            x2 = (-b - Math.sqrt(disc)) / (2 * a);
            System.out.println("Las raices son: X1=" + x1 + " y X2=" + x2);
        } else {
            System.out.println("Las raices no son reales");
        }
    }

}
