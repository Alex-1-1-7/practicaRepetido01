/*
Ingresar un N numero y decir si es primo o no 
*/
package numeroPrimo;

import javax.swing.JOptionPane;

public class NumeroPrimo {
    public static void main(String[] args){
        int numero,contador=0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para saber si es primo "));
        boolean esPrimo = false;
        for (int i = 1; i<=numero; i++){
            if (numero % i == 0){
                contador++;
            }
        }
        if (contador == 2){
                esPrimo = true; 
                }
        if (esPrimo){
        System.out.println(numero+" Es primo ");
        }
        if (!esPrimo){
            System.out.println(numero+" No es primo ");
        }
        
    }
}
