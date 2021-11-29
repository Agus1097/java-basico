package miprimerproyecto;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio11 {
//  Una obra social tiene tres clases de socios. Los socios tipo ‘A’ abonan una cuota
//  mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos
//  odontológicos. Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
//  descuento para los mismos tratamientos que los socios del tipo A. Los socios que
//  menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
//  Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real
//  que represente el costo del tratamiento (previo al descuento) y determine el importe en
//  efectivo a pagar por dicho socio.

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        String letra;
        double descuento = 0, tratamiento, costo;

        System.out.println("Ingrese el tipo de socio");
        letra = leer.next();

        if ("A".equals(letra) || "a".equals(letra)) {
            descuento = 0.5;
        } else if ("B".equals(letra) || "b".equals(letra)) {
            descuento = 0.35;
        } else if ("C".equals(letra) || "c".equals(letra)) {
            descuento = 0;
        } else {
            System.out.println("El tipo de socio ingresado es INCORRECTO");
        }

        System.out.println("Ingrese el costo del tratamiento");
        costo = leer.nextDouble();

        tratamiento = costo - costo * descuento;
        System.out.println("El tratamiento del socio '" + letra + "' es $" + tratamiento);
    }
}
