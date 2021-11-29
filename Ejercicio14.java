package miprimerproyecto;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio14 {
//  Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una
//  vocal. Caso contrario mostrar un mensaje.  
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        String letra;
        System.out.println("Ingrese una letra y le diremos si es una vocal");
        letra = leer.next();
        switch (letra) {
            case "A":
            case "a":
                System.out.println("La letra " + letra + " es una vocal");
                break;
            case "E":
            case "e":
                System.out.println("La letra " + letra + " es una vocal");
                break;
            case "I":
            case "i":
                System.out.println("La letra " + letra + " es una vocal");
                break;
            case "O":
            case "o":
                System.out.println("La letra " + letra + " es una vocal");
                break;
            case "U":
            case "u":
                System.out.println("La letra " + letra + " es una vocal");
                break;
            default:
                System.out.println("La letra " + letra + " NO es una vocal");
        }
    }
}
