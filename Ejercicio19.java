package miprimerproyecto;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio19 {
//Realizar un programa que pida dos números enteros positivos por teclado y
//muestre por pantalla el siguiente menú:
//MENU
//1. Sumar
//2. Restar
//3. Multiplicar
//4. Dividir
//5. Salir
//Elija opción:
//El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
//pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
//opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
//del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
//¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
//carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        int num1 = 0, num2 = 0, menu = 0, resultado = 0;
        System.out.println("Ingrese el primer numero");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = leer.nextInt();
        do {
            System.out.println("MENU");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println("Elija opción:");
            menu = leer.nextInt();
            if (menu == 1) {
                resultado = num1 + num2;
                System.out.println("SUMA = " + resultado);
            } else if (menu == 2) {
                resultado = num1 - num2;
                System.out.println("RESTA = " + resultado);
            } else if (menu == 3) {
                resultado = num1 * num2;
                System.out.println("MULTIPLICACION = " + resultado);
            } else if (menu == 4) {
                resultado = num1 / num2;
                System.out.println("DIVISION = " + resultado);
            } else if (menu == 5) {
                System.out.println("Ha salido del menu");
                break;
            } else {
                System.out.println("La opcion que ha elegido es incorrecta");
            }
        } while (menu != 5);
    }

}
