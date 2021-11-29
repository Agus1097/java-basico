package miprimerproyecto;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio25 {
//Escribir un programa que lea un número entero y devuelva el número de dígitos que
//componen ese número. Por ejemplo, si introducimos el número 12345, el programa
//deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el
//operador de división.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        int num = 0, digitos = 0, aux = 1;
        System.out.println("Ingrese un numero y le diremos la cantidad de digitos");
        num = sc.nextInt();
        while (aux > 0) {
            digitos++;
            aux = (int) (num / (Math.pow(10, digitos)));
        }
        System.out.println("Los digitos del numero " + num + " son " + digitos);
    }
}
