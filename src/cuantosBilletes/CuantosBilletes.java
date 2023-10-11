/*
cuantos billetes de cada valor debo dar dependiendo de la cantidad ingresada
*/
package cuantosBilletes;

import javax.swing.JOptionPane;


public class CuantosBilletes {
    public static void main(String [] args){
        int cantidad,cien,cincuenta,veinte,diez,cinco,uno;
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desea retirar"));
        System.out.println("La cantidad es: "+cantidad);
        System.out.println("");
        /*cien = cantidad / 100;
        cincuenta = cantidad % 100 /50;
        veinte = (cantidad % 100 % 50) / 20;
        diez = (cantidad % 100 % 50 % 20) / 10;
        cinco = (cantidad % 100 % 50 % 20 % 10) / 5;
        uno = (cantidad % 100 % 50 % 20 % 10 % 5) / 1;
        System.out.println("Cantidad billetes de 100: "+cien);
        System.out.println("Cantidad billetes de 50: "+cincuenta);
        System.out.println("Cantidad de billestes de 20: "+veinte);
        System.out.println("Cantidad de billestes de 10: "+diez);
        System.out.println("Cantidad de billestes de 5: "+cinco);
        System.out.println("Cantidad de billestes de 1: "+uno);
        System.out.println("");*/
        System.out.println("Segunda forma ");
        cien = cantidad / 100;
        cantidad %= 100;
        cincuenta = cantidad / 50;
        cantidad %= 50;
        veinte = cantidad / 20;
        cantidad %= 20;
        diez = cantidad / 10;
        cantidad %= 10;
        cinco = cantidad / 5;
        cantidad %= 5;
        uno = cantidad / 1;
        
        System.out.println("Cantidad billetes de 100: "+cien);
        System.out.println("Cantidad billetes de 50: "+cincuenta);
        System.out.println("Cantidad de billestes de 20: "+veinte);
        System.out.println("Cantidad de billestes de 10: "+diez);
        System.out.println("Cantidad de billestes de 5: "+cinco);
        System.out.println("Cantidad de billestes de 1: "+uno);
        
    }
    
    
    
}
