package miprimerproyecto;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio27 {
//Necesitamos mostrar un contador con 5 dígitos (X-X-X-X-X), que muestre los
//números del 0-0-0-0-0 al 9-9-9-9-9, con la particularidad que cada vez que aparezca un
//3 lo sustituya por una E. Ejemplo:

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    for (int l = 0; l <= 9; l++) {
                        for (int m = 0; m <= 9; m++) {
                            System.out.print(i != 3 ? i : "E");
                            System.out.print(j != 3 ? j : "E");
                            System.out.print(k != 3 ? k : "E");
                            System.out.print(l != 3 ? l : "E");
                            System.out.println(m != 3 ? m : "E");
                        }
                    }
                }
            }
        }
    }
}
