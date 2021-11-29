package miprimerproyecto;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio33 {
//Crea una aplicación que nos pida un número por teclado y con una función se lo
//pasamos por parámetro para que nos indique si es o no un número primo, debe
//devolver true si es primo sino false.
//Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no
//es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
//Un buen truco para calcular la raíz cuadrada del numero e ir comprobando que si es
//divisible desde ese numero hasta 1.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        int num;
        System.out.println("Ingrese un numero");
        num = sc.nextInt();
        primo(num);
    }

    static void primo(int num) {
        boolean resultado = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                resultado = false;
            }
        }
        if (resultado == false) {
            System.out.println("El numero " + num + " NO es primo");
        } else {
            System.out.println("El numero " + num + " ES PRIMO");
        }
    }
}
