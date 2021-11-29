package miprimerproyecto;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio24 {
//Realice un programa para que el usuario adivine el resultado de una multiplicación
//entre dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al
//usuario si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se
//debe permitir al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio
//investigue como utilizar la función Math.random() de Java.
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        int num1 = (int) (Math.random() * 11);
        int num2 = (int) (Math.random() * 11);
        int mult = 0, adivinar = 0, cant = 0;
        mult = num1 * num2;
        while (cant != 2) {
            cant++;
            System.out.println("ADIVINE LA MULTIPLICACION ENTRE DOS NUMEROS");
            adivinar = sc.nextInt();
            if (mult == adivinar) {
                System.out.println("Ha adivinado la mult entre los dos numeros! La cual es " + adivinar);
            } else if (cant == 1) {
                System.out.println("Tiene una chance mas");
            }
        }
        if (mult != adivinar) {
            System.out.println("No ha adivinado. La respuesta correcta es " + mult);
        }
    }
}
