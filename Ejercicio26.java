package miprimerproyecto;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio26 {
//Crear un programa que dibuje una escalera de números, donde cada línea de
//números comience en uno y termine en el número de la línea. Solicitar la altura de la
//escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:
//1
//12
//123
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        int altura = 0, num = 0;
        System.out.println("Ingrese altura de la escalera:");
        altura = sc.nextInt();
        num = altura;
        System.out.println("La escalera es:");
//        while (num != 0) {
//        for (i = 0; i < (altura - num + 1); i++) {
//        System.out.print(i + 1);
//        }
//        System.out.println("");
//        num--;
//        }
        for (int j = 0; j <= altura - 1; j++) {
            for (int k = 0; k <= altura - num; k++) {
                System.out.print(k + 1);
            }
            num--;
            System.out.println("");
        }
    }
}
