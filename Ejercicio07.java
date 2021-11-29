package miprimerproyecto;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio07 {
//    Implementar un programa que dado dos números enteros determine cuál es el
//    mayor y lo muestre por pantalla.

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        int num1, num2;
        System.out.println("Ingrese el primer numero");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = leer.nextInt();
        if (num1 < num2) {
            System.out.println(num2 + " es mayor que " + num1);
        } else {
            System.out.println(num1 + " es mayor que " + num2);
        }
    }
}
