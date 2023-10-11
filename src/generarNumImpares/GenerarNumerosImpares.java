/*
generar N numeros impares
*/
package generarNumImpares;

import javax.swing.JOptionPane;


public class GenerarNumerosImpares {
    public static void main(String [] args){
        int numero;
         numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para ver sus numeros impares"));
        while (numero<=0){
        JOptionPane.showMessageDialog(null,"ERROR. Debe ingresar un numero mayor que cero");
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para genenrar sus numeros impares "));
        }
        
        for (int i = 1; i<numero;i+=2){
            System.out.println("Los numeros impares de "+numero+" son: "+i);
        }
    }
    
}
