package miprimerproyecto;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio10 {
//    Ingresar un número entero cuyo dominio pertenezca al intervalo [0, 9999]. El
//    programa debe primero validar que el número pertenezca al dominio, y luego, indicar si
//    el número ingresado es múltiplo de 2, 3 o 5; o en su defecto, si no es múltiplo de
//    ninguno de ellos.
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        int num;
        System.out.println("Ingrese un numero entre 0 y 9999");
        num = leer.nextInt();
        if (num >= 0 && num <= 9999) {
            System.out.println("El numero " + num + " pertenece al dominio");
        } else {
            while (num <= 0 && num >= 9999) {
                System.out.println("El numero " + num + " no pertenece al dominio");
                System.out.println("Ingrese un numero entre 0 y 9999");
                num = leer.nextInt();
            }
        }
        if (num % 2 == 0) {
            System.out.println("El numero " + num + " es multiplo de 2");
        } else {
            System.out.println("El numero " + num + " NO es multiplo de 2");
        }
        
        if (num % 3 == 0) {
            System.out.println("El numero " + num + " es multiplo de 3");
        } else {
            System.out.println("El numero " + num + " NO es multiplo de 3");
        }
        
        if (num % 5 == 0) {
            System.out.println("El numero " + num + " es multiplo de 5");
        } else {
            System.out.println("El numero " + num + " NO es multiplo de 5");
        }
    }
}
