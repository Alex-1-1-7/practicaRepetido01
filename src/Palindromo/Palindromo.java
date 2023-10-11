/*
verificar si un numero es palindromo 
*/
package Palindromo;

import javax.swing.JOptionPane;


public class Palindromo {
    public static void main(String [] args){
        int palindromo;
        String numero;
        boolean siEs = true;
        palindromo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para saber si es palindromo."));
        
        numero = String.valueOf(palindromo);
        
        for (int i=0;i<numero.length();i++){
            if (numero.charAt(i)!=numero.charAt(numero.length()-1-i)){
                siEs = false;
            
            }
        
        }
        if (siEs){
        System.out.println(palindromo+" Es palindromo");
        }
        else if (!siEs){
            System.out.println(palindromo+" No es palindromo");
        }
        
    }
        

    
}
