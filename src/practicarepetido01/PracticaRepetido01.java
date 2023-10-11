/*
numero multiplo
*/
package practicarepetido01;

import java.util.Scanner;
public class PracticaRepetido01 {


    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
       int numero,multiplo;
       
        System.out.println("Ingrese un numero.");
        numero = entrada.nextInt();
        while (numero<=0){
            System.out.println("Debe ingresar un numero mayor que cero. ");
            numero = entrada.nextInt();
        }
        System.out.println("Ingrese un numero para saber si el multiplo del primer numero.");
        multiplo = entrada.nextInt();
        while(multiplo<=0){
            System.out.println("Debe ingresar un numeromayor que cero.");
            multiplo = entrada.nextInt();
        }
        if (numero % multiplo == 0){
            System.out.println("El numero: "+numero+" es multiplo de: "+multiplo);
        }else {
            System.out.println("El numero: "+numero+" no es multiplo de: "+multiplo);
        }
    }
    
}
