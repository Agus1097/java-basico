package miprimerproyecto;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio20 {
//Desde un dispositivo RS232 un programa lee caracteres enviados por un sensor.
//Las lecturas se realizan de a 5 caracteres (buffer) por vez, los cuales deben llegar con
//un formato fijo: el primer carácter tiene que ser X y el último tiene que ser 0. Las
//secuencias leídas que respeten el formato se consideran correctas, la secuencia
//especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
//distinta de FDE que no sea correcta se considera inválida. Al finalizar el proceso, se
//imprime un informe indicando los porcentajes de lecturas correctas e inválidas
//recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes
//funciones de Java substring() y Length().
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        String codigo, subcodigo, primera, quinta;
        int contV = 0, contF = 0, porcentajeC, porcentajeI;
        System.out.println("Para que el codigo sea correcto debe comenzar con X y terminar con O cada 5 caracteres");
        System.out.println("Para finalizar el codigo debe ingresar &&&&&");
        System.out.println("Ingrese el codigo");
        codigo = leer.next();
        subcodigo = codigo.substring(0, 5);
        while (true) {
            subcodigo = codigo.substring(0, subcodigo.length());
            codigo = codigo.substring(5, codigo.length());
            primera = subcodigo.substring(0, 1);
            quinta = subcodigo.substring(4, 5);
            System.out.println(subcodigo);
            if (primera.equals("X") & quinta.equals("O")) {
                contV = contV + 1;
            } else {
                contF = contF + 1;
            }
            if (codigo.equals("&&&&&")) {
                System.out.println(codigo);
                break;
            }
        }
        System.out.println(contV);
        System.out.println(contF);
        porcentajeC = contV * 100 / (contV + contF);
        porcentajeI = contF * 100 / (contV + contF);
        System.out.println("El porcentaje de lectura correcta es " + porcentajeC);
        System.out.println("El porcentaje de lectura incorrecta es " + porcentajeI);
    }

}
