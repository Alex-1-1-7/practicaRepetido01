/*
crear la secuencia fibonacci 
*/
package fibonacci;

import javax.swing.JOptionPane;

public class Fibonacci {
    public static void main (String[] args){
        int numero,resultado,num1=1,num2=0; 
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros fibonacci \n"
                + "que quiere que se impriman"));
        System.out.println("con for");
        for (int i = 0; i<numero; i++){
            resultado = num1 + num2;
          //resultado = 1    +   0
          //resultado = 1
            num2 = num1;
            //0  = 1
           //num2= 1
            num1 = resultado;
           // num1 = 1
           //en la primera iteracion 
           
           // segunda iteracion 
         //resultado = num1 + num2;
          //resultado = 1    +   1
          //resultado = 2
        //num2 = num1;
          // 1 = 1
          //num2=1
        //num1 = resultado;
          //num1 = 2
        //en la segunda iteracion 
        
        //en la tercera iteracion 
        //resultado = num1 + num2;
          //resultado = 2    +  1
          //resultado = 3
        //num2 = num1;
          // 1 = 2
          //num2=2
        //num1 = resultado;
          //num1 = 3
          
        // en la cuarta
        //resultado = num1 + num2;
          //resultado = 3    +  2
          //resultado = 5
        //num2 = num1;
          // 2 = 3
          //num2=3
        //num1 = resultado;
          //num1 = 5
          
            System.out.println(resultado);
        }
        
        
        int hasta,num3=1,num4=0,resultado1=0;
        hasta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese hasta que numero desea que se detenga\n"
                + "a secuencia fibonacci"));
        System.out.println("con while ");
        while (resultado1<hasta){
        resultado1 = num3+num4;
            num4 = num3;
            num3 = resultado1;
            
            System.out.println(resultado1);
        }
    }
    
}
