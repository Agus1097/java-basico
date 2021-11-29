package miprimerproyecto;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio28 {
//Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
//si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
//****
//****
//****
//****

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        int N=0;
        System.out.println("Ingrese el tamaño del cuadrado");
        N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
