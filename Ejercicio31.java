package miprimerproyecto;

import java.util.Locale;
import java.util.Scanner;
import static miprimerproyecto.Ejercicio31.sumar;

public class Ejercicio31 {
//Crea una aplicación que le pida dos numeros al usuario y este pueda elegir entre
//sumar, restar, multiplicar y dividir. La aplicación debe tener una función para cada
//operación matemática y deben devolver sus resultados para imprimirlos en el main
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        int num1, num2, menu;
        System.out.println("Ingrese el primer numero");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = sc.nextInt();
        System.out.println("Ingrese el numero correspodiente para la operacion:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        menu = sc.nextInt();
        switch (menu) {
            case 1:
                System.out.println("La suma es: " + sumar(num1, num2));
                break;
            case 2:
                System.out.println("La resta es: " + restar(num1, num2));
                break;
            case 3:
                System.out.println("La multiplicacion es: " + multiplicar(num1, num2));
                break;
            case 4:
                System.out.println("La division es: " + dividir(num1, num2));
                break;
        }
    }

    static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    static int restar(int num1, int num2) {
        return num1 - num2;
    }

    static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    static int dividir(int num1, int num2) {
        return num1 / num2;
    }
}
