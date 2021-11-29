package miprimerproyecto;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio41 {
//Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
//donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un
//programa que permita introducir un cuadrado por teclado y determine si este cuadrado
//es mágico o no. El programa deberá comprobar que los números introducidos son
//correctos, es decir, están entre el 1 y el 9.
    static Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        //int[][] matriz = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
        llenar(matriz);
        magica(matriz);
    }
        static void llenar(int[][] matriz) {
        int num;
        System.out.println("Ingrese los numeros para completar la matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                num = sc.nextInt();
                matriz[i][j] = num;
            }
        }
    }

    static void magica(int[][] matriz) {
        boolean resultado = true;
        int sum = 0, sumD = 0;
        int[] sumF = new int[3];
        int[] sumC = new int[3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum = sum + matriz[i][j];
            }
            sumF[i] = sum;
            sum = 0;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum = sum + matriz[j][i];
            }
            sumC[i] = sum;
            sum = 0;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    sum = sum + matriz[j][i];
                }
            }
        }
        sumD = sum;

        for (int i = 0; i < 3; i++) {
            if (sumF[i] == sumC[i] && sumF[i] == sumD && sumC[i] == sumD) {
                resultado = true;
            } else {
                resultado = false;
                break;
            }
        }
        if (resultado == true) {
            System.out.println("La matriz:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("[" + matriz[i][j] + "]");
                }
                System.out.println("");
            }
            System.out.println("ES MAGICA");
        } else {
            System.out.println("La matriz:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("[" + matriz[i][j] + "]");
                }
                System.out.println("");
            }
            System.out.println("NO es magica");
        }
    }
}
