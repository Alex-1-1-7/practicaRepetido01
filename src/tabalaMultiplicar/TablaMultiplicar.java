/*
generar la tabla de multiplicar n 
*/
package tabalaMultiplicar;

import javax.swing.JOptionPane;


public class TablaMultiplicar {
    public static void main(String [] args){
    int numero,resultado;
    
    numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la tabla de multiplicar que desea."));
    while (numero<=0){
    JOptionPane.showMessageDialog(null, "ERROR. Debe ingresar un numero mayor que cero.");
    numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la tabla de multiplicar que desea."));
    }
    
    for (int i=1;i<=10;i++){
        resultado = i * numero;
        System.out.println(i+" x "+numero+" = "+resultado);
    }
    
    
    
    }
    
}
