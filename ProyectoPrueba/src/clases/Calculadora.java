/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import static clases.ClasePrincipal.validar;

/**
 *
 * @author oscar
 */
public class Calculadora {

    public static void main(String[] args) {
        Integer num1 = 0, num2 = 0;
        String suma = "Suma";
        String multiplicacion = "Multiplicacion";
        String divicion = "Division";

        if (!sonValidosLosNumeros(num1, num2))
            return;

        String resultadoOperacion = realizarOPeracion(divicion, num2, num1);
        
        System.out.println(resultadoOperacion);

    }

    public static boolean sonValidosLosNumeros(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            System.out.println("Los numeros no pueden ser nulos");
            return false;
        }
        
        if (num1 == 0 || num2 == 0) {
            System.out.println("Los numeros no pueden ser cero");
            return false;
        }
        
        return true;
    }

    public static String realizarOPeracion(String tipoDeOperacion, Integer num1, Integer num2) {
        String resultado = "";

        if (tipoDeOperacion.equals("Suma"))
            resultado = "El resultado de la " + tipoDeOperacion + " es: " + (num1 + num2);
        else if (tipoDeOperacion.equals("Multiplicacion"))
            resultado = "El resultado de la " + tipoDeOperacion + " es: " + (num1 * num2);
        else if (tipoDeOperacion.equals("Division")) {
            double resultadoDivision = num1 / num2;
            resultado = "El resultado de la " + tipoDeOperacion + " es: " + resultadoDivision;
        } else
            resultado = "Operacion no encontrada";
        
        return resultado;
    }
}
