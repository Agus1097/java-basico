package miprimerproyecto;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio17bis {
//  Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
//  promedio de n números (n>0). El valor de n se solicitará al principio del programa y los
//  números serán introducidos por el usuario. Realice dos versiones del programa, una
//  usando el bucle “do - while”

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        int num, sum = 0, min = 9999999, max = 0, cantDeNumeros, cont = 0;
        double promedio = 0;

        System.out.println("Escriba la cantidad numero que quiere ingresar");
        cantDeNumeros = leer.nextInt();

        while (cont != cantDeNumeros) {
            System.out.println("Ingrese un numero");
            cont = cont + 1;
            num = leer.nextInt();
            sum = sum + num;
            promedio = sum / cantDeNumeros;
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("El numero maximo ingresado es " + max);
        System.out.println("El numero minimo ingresado es " + min);
        System.out.println("El promedio ingresado es " + promedio);
    }
}
