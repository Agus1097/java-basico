package miprimerproyecto;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio22 {
//Escriba un programa que lea números enteros. Si el número es múltiplo de cinco
//debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de
//números pares y la cantidad de números impares. Al igual que en el ejercicio anterior
//los números negativos no deben sumarse
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        int num = 1, par = 0, impar = 0, cant = 0, sum = 0;
        System.out.println("Al poner un multiplo de 5 se dejaran de ingresar numeros");
        while (num % 5 != 0) {
            System.out.println("Ingrese un numero:");
            num = leer.nextInt();
            cant = cant + 1;
            if (num % 2 == 0) {
                par = par + 1;
            } else {
                impar = impar + 1;
            }
            if (num > 0) {
                sum = num + sum;
            }
            if (num == 0) {
                num = 1;
            }
        }
        if (num % 5 == 0) {
            System.out.println("Ha ingresado un multiplo de 5");
        }
        System.out.println("La cantidad de numeros leidos son " + cant);
        System.out.println("La cantidad de numeros pares leidos son " + par);
        System.out.println("La cantidad de numeros impares leidos son " + impar);
        System.out.println("La suma de los numeros ingresados mayores a cero son " + sum);
    }
}
