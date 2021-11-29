package miprimerproyecto;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio12 {
//  La política de la compañía telefónica “chimefón” es: “Chismea + x -”. Cuando se
//    realiza una llamada, el cobro es por el tiempo que ésta dura, de tal forma que los
//    primeros cinco minutos cuestan $ 1.00 c/u, los siguientes tres, $ 0.80 c/u, los siguientes
//    dos minutos, 0.70 c/u, y a partir del décimo minuto, 0.50 c/u. Además, se carga un
//    impuesto de 3 % cuando es domingo, y si es día hábil, en turno matutino, 15 %, y en
//    turno vespertino, 10 %. Realice un algoritmo para determinar cuánto debe pagar por
//    cada concepto una persona que realiza una llamada (tiempo de la llamada, impuestos
//    y total a pagar). Al analizar el problema se puede identificar que será necesario conocer
//    como datos la duración de la llamada, así como el día y turno en que se realiza. Con
//    base en esto se podrá determinar cuál será el pago que se efectuará por el tiempo que
//    dura la llamada y el impuesto que deberá pagar en función del día y del turno en que se
//    realiza.
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        String dia, turno;
        int duracion;
        double llamada = 0, total;
        
        System.out.println("Ingrese la duracion de la llamada (min)");
        duracion = leer.nextInt();

        if (duracion <= 5) {
            llamada = duracion;
        } else if (duracion > 5 && duracion <= 8) {
            llamada = 5 + (duracion - 5) * 0.8;
        } else if (duracion > 8 && duracion <= 10) {
            llamada = 5 + 3 * 0.8 + (duracion - 8) * 0.7;
        } else if (duracion > 10) {
            llamada = 5 + 3 * 0.8 + 2 * 0.7 + (duracion - 10) * 0.5;
        } else {
            System.out.println("No se puede calcular el costo de llamada por error en los datos ingresados");
        }
        System.out.println(llamada);

        System.out.println("Ingrese el dia de la llamada");
        dia = leer.next();
        System.out.println("Ingrese el turno de la llamada (matutino o vespertino)");
        turno = leer.next();
        
        if ("domingo".equalsIgnoreCase(dia)) {
            total = llamada * 1.03;
        } else {
             total = llamada;
            if ("matutino".equalsIgnoreCase(turno)) {
                total = llamada * 1.10;
            } else if ("vespertino".equalsIgnoreCase(turno)) {
                total = llamada * 1.15;
            } else {
                System.out.println("No se puede calcular el costo de llamada por error en los datos ingresados");
            }
        }
        
        System.out.println("El costo de la llamada es: $" + total);
    }
}
