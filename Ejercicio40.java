package miprimerproyecto;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio40 {
//Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice
//que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, pero
//cambiada de signo. Es decir, A es antisimétrica si A = -AT
//. La matriz traspuesta de una
//matriz A se denota por A
//T y se obtiene cambiando sus filas por columnas (o viceversa).

    static Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int[][] matrizT = new int[3][3];
        llenar(matriz, matrizT);
        comparar(matriz, matrizT);
    }

    static void llenar(int[][] matriz, int[][] matrizT) {
        int num;
        System.out.println("Ingrese los numeros para completar la matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                num = sc.nextInt();
                matriz[i][j] = num;
                matrizT[j][i] = num;
            }
        }
    }

    static void comparar(int[][] matriz, int[][] matrizT) {
        boolean resultado = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] == -matrizT[i][j]) {
                    resultado = true;
                } else {
                    resultado = false;
                    break;
                }
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
            System.out.println("Es ANTISIMETRICA");
            System.out.println("La matriz antisimetrica:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("[" + matrizT[i][j] + "]");
                }
                System.out.println("");
            }
        }else{
            System.out.println("La matriz:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("[" + matriz[i][j] + "]");
                }
                System.out.println("");
            }
            System.out.println("NO es antisimetrica");
        }
            
    }
}
