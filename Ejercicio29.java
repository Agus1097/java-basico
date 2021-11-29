package miprimerproyecto;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio29 {
//Se dispone de un conjunto de N familias, cada una de las cuales tiene un M número
//de hijos. Escriba un programa para averiguar la media de edad de los hijos de todas las
//familias.
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        int N = 2, M = 2, edad = 0;
        double sum = 0, media = 0;
        System.out.println("Ingrese el numero de familias");
        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese el numero de hijos de la familia " + (i + 1));
            M = sc.nextInt();
            for (int j = 0; j < M; j++) {
                System.out.println("Ingrese las edades de los hijos de la familia " + (i + 1));
                edad = sc.nextInt();
                sum = sum + edad;
            }
        }
        System.out.println(sum);
        media = sum / (N*M);
        System.out.println("La media de edad de los hijos de todas las familias es: " + media);
    }
}
