package miprimerproyecto;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio39 {
//Los profesores del curso de programación de Egg necesitan llevar un registro de las
//notas adquiridas por sus 50 alumnos para luego obtener un listado de aprobados y
//desaprobados. Durante el periodo de cursado se obtienen 4 notas, 2 por trabajos
//prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
//Primer trabajo práctico evaluativo 10%
//Segundo trabajo práctico evaluativo 15%
//Primer Integrador 25%
//Segundo integrador 50%
//Una vez cargadas las notas, los profesores necesitan obtener por pantalla una lista de
//aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos
//con promedio mayor o igual al 70% de sus notas del curso.
    
    static Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public static void main(String[] args) {
        double[] vectornotas = new double[4];
        double[] vectorpromedio = new double[5];
        String[] vectorcalificaciones = new String[5];

        notas(vectornotas, vectorpromedio);
        lista(vectorpromedio, vectorcalificaciones);
        mostrar(vectorpromedio, vectorcalificaciones);
    }

    static void notas(double[] vectnotas, double[] vectprom) {
        double nota;
        for (int i = 0; i < 5; i++) {
            System.out.println("La notas del alumno " + (i + 1) + " son:");
            for (int j = 0; j < 4; j++) {
                System.out.println("La nota " + (j+1));
                nota = sc.nextDouble();
                vectnotas[j] = nota;
            }
            vectprom[i] = vectnotas[0] * 0.1 + vectnotas[1] * 0.15 + vectnotas[2] * 0.25 + vectnotas[3] * 0.5;
        }
    }

    static void lista(double[] vectprom, String[] vectcalif) {
        for (int i = 0; i < 5; i++) {
            if (vectprom[i] >= 7) {
                vectcalif[i] = "APROBADO";
            } else {
                vectcalif[i] = "DESAPROBADO";
            }
        }
    }

    static void mostrar(double[] vectprom, String[] vectcalif) {
        for (int i = 0; i < 5; i++) {
            System.out.print("Alumno " + (i+1));
            System.out.print("Promedio: " + vectprom[i]);
            System.out.println("  " + vectcalif[i]);
            System.out.println("");
        }
    }
}
