/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author oscar
 */
public class Listas {

    public static void main(String[] args) {
        String numeros = "1,2,3,4,50,6,30";
        agregar(numeros);
    }

//    public static boolean validarCadena(String cadena) {
//        if (cadena.matches("^([0-9]+[,])*([0-9])$")) {
//            return true;
//        }
//
//        if (!cadena.matches("^([0-9]+[,])*([0-9])$")) {
//            System.out.println("La cadena solo recibe numeros positivos");
//            return false;
//        }
//        return true;
//    }

    public static void agregar(String numeros) {
        if (!sonValidosLosNumeros(numeros)) {
            return;
        }

        String[] arregloNumeros = quitarEspacios(numeros);
        double sumaNumeros = 0;

        for (String numero : arregloNumeros) {
            sumaNumeros += Integer.parseInt(numero);
        }

        System.out.println("La suma de los numeros es: " + sumaNumeros);
    }

    public static String[] quitarEspacios(String numeros) {
        numeros = numeros.replaceAll("\n","");
        return numeros.trim().split(",");
    }

    public static boolean sonValidosLosNumeros(String numeros) {
        if (numeros.startsWith(",")
                || numeros.endsWith(",")
                || numeros.trim().equals("")
                || numeros.trim().contains(",,")
                || numeros.matches(".*[a-zA-Z].*")) {
            System.out.println("Los numeros no son validos");
            return false;
        }
        return true;
    }
}
