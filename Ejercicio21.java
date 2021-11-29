package miprimerproyecto;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio21 {
//Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
//salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá
//calcular y mostrar el resultado de la suma de los números leídos, pero si el número es
//negativo no debe sumarse.
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        int num = 0, cant = 1, sum = 0;
        System.out.println("Ingrese el numero " + cant);
        num = leer.nextInt();
        sum = num;
        while (num != 0 && cant != 20) {
            cant = cant + 1;
            System.out.println("Ingrese el numero " + cant);
            num = leer.nextInt();
            if (num > 0) {
                sum = num + sum;
            }
        }
        if (num == 0) {
            System.out.println("Se capturo el numero cero");
        }
        System.out.println("La suma de los numeros ingresados mayores a cero son " + sum);
    }
}
