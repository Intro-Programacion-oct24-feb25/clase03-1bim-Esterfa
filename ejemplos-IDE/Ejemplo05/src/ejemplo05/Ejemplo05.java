/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo05;

/**
 *
 * @author reroes
 */
public class Ejemplo05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("----------------");
        System.out.println(10 / 3);
        
        System.out.println("----------------");
        System.out.println(10 / 3.0);
        
        System.out.println("----------------");
        System.out.println(10 / 3.0 + 1);
        System.out.println(10 / (3.0 + 1));
        
        System.out.println("----------------");
        // esta operacion es para hacer el calculo del residuo
        System.out.println(10 % 3 );
        // esta operacion es para sacar el residuo de la division
        System.out.println("----------------");
        System.out.println(Math.pow(10, 2));
        // esta operacion es para sacar el valor elevado al cuadrado
        System.out.println("----------------");
        System.out.println(Math.sqrt(16));
        // esta operacion es para sacar la raiz cuadrada 
        double m = Math.sqrt(16);
        System.out.println(m);
        // esta operacion es para imprimir el resultado
    }

}
