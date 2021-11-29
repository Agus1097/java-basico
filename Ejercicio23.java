package miprimerproyecto;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio23 {
//Simular la división usando solamente restas. Dados dos números enteros mayores
//que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas.
//Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor,
//este resultado es el residuo, y el número de restas realizadas es el cociente. Por
//ejemplo: 50 / 13
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        int num1 = 0, num2 = 0, residuo = 0, cociente = 0;
        System.out.println("Ingrese el numerador, el numero tiene que ser mayor a uno:");
        num1 = sc.nextInt();
        System.out.println("Ingrese el denominador, el numero tiene que mayor a uno y menor que el numerador:");
        num2 = sc.nextInt();
        
        while (num1 > num2) {
            cociente++;
            residuo = num1 - num2;
            num1 = residuo;
        }
        System.out.println("El cociente de la division es: " + cociente + " y el residuo es: " + residuo);
    }
}
