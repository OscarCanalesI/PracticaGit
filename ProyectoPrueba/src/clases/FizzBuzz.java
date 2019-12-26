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
public class FizzBuzz {

    public static void main(String[] args) {    
        int num1 = 1, num2 = 100;
        metodoFizzBuzz(num1, num2);
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
    
    public static void metodoFizzBuzz(int num1, int num2){
        if(!sonValidosLosNumeros(num1, num2))
            return;
        
        for (int i = num1; i <= num2; i++) {
            System.out.println(i);
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println(" Fizz");
                }
            } else if (i % 5 == 0) {
                System.out.println(" Buzz");
            }
        }
    }
}