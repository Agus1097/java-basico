package miprimerproyecto;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio16 {
//  Pedir que se ingrese el día, mes y año de una fecha e indicar si la fecha ingresada
//  es correcta. Se debe tener en cuenta que hay meses con 28, 30 y 31 días.
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        int dia, mes, anio;
        System.out.println("Ingrese el dia");
        dia = leer.nextInt();
        System.out.println("Ingrese el mes");
        mes = leer.nextInt();
        System.out.println("Ingrese el año");
        anio = leer.nextInt();
        
        switch (mes) {
            case 1:
                if (dia <= 31) {
                    System.out.println("La fecha ingresada es: " + dia + "/" + mes + "/" + anio);
                }
                break;
            case 2:
                if (anio % 4 == 0) {
                    if (anio % 100 != 0) {
                        if (dia <= 29) {
                            System.out.println("La fecha ingresada es: " + dia + "/" + mes + "/" + anio);
                        }
                    }
                } else if (dia <= 28) {
                    System.out.println("La fecha ingresada es: " + dia + "/" + mes + "/" + anio);
                }
                break;
            case 3:
                if (dia <= 31) {
                    System.out.println("La fecha ingresada es: " + dia + "/" + mes + "/" + anio);
                }
                break;
            case 4:
                if (dia <= 30) {
                    System.out.println("La fecha ingresada es: " + dia + "/" + mes + "/" + anio);
                }
                break;
            case 5:
                if (dia <= 31) {
                    System.out.println("La fecha ingresada es: " + dia + "/" + mes + "/" + anio);
                }
                break;
            case 6:
                if (dia <= 30) {
                    System.out.println("La fecha ingresada es: " + dia + "/" + mes + "/" + anio);
                }
                break;
            case 7:
                if (dia <= 31) {
                    System.out.println("La fecha ingresada es: " + dia + "/" + mes + "/" + anio);
                }
                break;
            case 8:
                if (dia <= 31) {
                    System.out.println("La fecha ingresada es: " + dia + "/" + mes + "/" + anio);
                }
                break;
            case 9:
                if (dia <= 30) {
                    System.out.println("La fecha ingresada es: " + dia + "/" + mes + "/" + anio);
                }
                break;
            case 10:
                if (dia <= 31) {
                    System.out.println("La fecha ingresada es: " + dia + "/" + mes + "/" + anio);
                }
                break;
            case 11:
                if (dia <= 30) {
                    System.out.println("La fecha ingresada es: " + dia + "/" + mes + "/" + anio);
                }
                break;
            case 12:
                if (dia <= 31) {
                    System.out.println("La fecha ingresada es: " + dia + "/" + mes + "/" + anio);
                }
                break;
            default:
                System.out.println("Ha ingresado una fecha no valida");
        }
    }
}
