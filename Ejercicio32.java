package miprimerproyecto;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio32 {
//Crea un aplicación que nos convierta una cantidad de euros introducida por
//teclado a otra moneda, estas pueden ser a dolares, yenes o libras. El procedimiento
//tendrá como parámetros, la cantidad de euros y la moneda a pasar que sera una
//cadena, este no devolverá ningún valor, mostrara un mensaje indicando el cambio
//(void).
//El cambio de divisas son:
//* 0.86 libras es un 1 €
//* 1.28611 $ es un 1 €
//* 129.852 yenes es un 1 €
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        double euro;
        int menu;
        System.out.println("Ingrese la cantidad de euros:");
        euro = sc.nextDouble();
        System.out.println("Ingrese la moneda a la que quiere convertir:");
        System.out.println("1. Libra");
        System.out.println("2. Dolar");
        System.out.println("3. Yen");
        menu = sc.nextInt();
        switch (menu) {
            case 1:
                libra(euro);
                break;
            case 2:
                dolar(euro);
                break;
            case 3:
                yen(euro);
                break;
        }
    }
        static void libra(double euro){
            System.out.println(euro + " euros = " + (euro*0.86) + "libras" );
        }
        static void dolar(double euro){
            System.out.println(euro + " euros = " + (euro*1.28611) + "dolares" );
        }
        static void yen(double euro){
            System.out.println(euro + " euros = " + (euro*129.852) + "yenes" );
        }
    }
