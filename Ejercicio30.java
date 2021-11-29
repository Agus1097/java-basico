package miprimerproyecto;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio30 {
//Realizar un programa que lea 5 números (comprendidos entre 1 y 20) e imprima el
//número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
//5 *****
//3 ***
//11 ***********
//2 **
//9 *********

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        int num = 0, cant = 0;
        System.out.println("Ingrese 5 numeros");
        for (int i = 0; i < 5; i++) {
            System.out.print(num = sc.nextInt());
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
