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
public class ClasePrincipal {

    public static void main(String[] args) {
        int res = operaciones(5, 5, 3);
        Integer num1 = 2, num2 = 4;
        int res2 = operacionesDos("Suma", null, num2);
        System.out.println(res2);
        System.out.println("");
    }

    public static int operaciones(int num1, int num2, int i) {
        int resultado = 0;
        switch (i) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 * num2;
                break;
            case 3:
                resultado = num1 / num2;
                break;
            default:
        }
        return resultado;
    }

    public static int operacionesDos(String i, Integer num1, Integer num2) {
        Integer resultado = 0;
        //validar(num1, num2);
        if (validar(num1, num2) == 1) {
            //try {
                if (i.equals("Suma")) {
                    resultado = num1 + num2;
                } else if (i.equals("Multiplicacion")) {
                    resultado = num1 * num2;
                } else if (i.equals("Division")) {
                    if (num1 == 0 || num2 == 0) {
                        System.out.println("Los numeros no se pueden dividir entre 0");
                    } else {
                        resultado = num1 / num2;
                    }
                } else {
                    System.out.println("Operacion no encontrada");
                }
            //} catch (NullPointerException e) {
                //System.out.println("¡Error!, No se admiten valores nulos: " + e.getMessage());
            //}
        } else if(validar(num1, num2) == 0){
            System.out.println("No se admiten valores nulos");
        }
        return resultado;
    }

    public static int validar(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            //System.out.println("No se admiten valores nulos");
            return 0;
        }
        return 1;
    }

    public static int suma(int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }

    public static int multiplicacion(int num1, int num2) {
        int resultado = num1 * num2;
        return resultado;
    }

    public static double division(double num1, double num2) {
        double resultado = num1 / num2;
        return resultado;
    }
//    public static double residuo(double num1, double num2){
//        double re
//    }

}
