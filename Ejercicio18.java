package miprimerproyecto;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio18 {
//  Leer la altura de N personas y determinar el promedio de estaturas que se
//  encuentran por debajo de 1.60 mts. y el promedio de estaturas en general
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        double altura = 0, promedioMenor = 0, promedioGral = 0, sumG = 0, sumM = 0;
        int cantDePersonas, cont = 0, contM = 0;
        System.out.println("Ingrese la cantidad de personas");
        cantDePersonas = leer.nextInt();
        while (cont != cantDePersonas) {
            cont = cont + 1;
            System.out.println("Ingrese la altura de la persona " + cont);
            altura = leer.nextDouble();
            sumG = sumG + altura;
            if (altura < 1.6) {
                contM = contM + 1;
                sumM = sumM + altura;
            }
        }
        promedioMenor = sumM / contM;
        promedioGral = sumG / cont;
        System.out.println("La altura promedio de las personas menores a 1.6 m es " + promedioMenor);
        System.out.println("La altura promedio de todas las personas es " + promedioGral);
    }

}
