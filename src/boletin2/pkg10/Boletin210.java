
package boletin2.pkg10;

import java.util.Scanner;

/**@author Micael*/
public class Boletin210 
{
    public static void main(String[] args) 
    {
        int cantidad;
        System.out.println("Introducir una cantidad en euros: ");
        Scanner dato = new Scanner(System.in);
        cantidad=dato.nextInt();
        System.out.println(cantidad/100+" biletes de 100€");
        System.out.println(cantidad%100/20+" billetes de 20€");
        System.out.println(((cantidad%100)%20)/5+" billetes de 5€");
        System.out.println((((cantidad%100)%20)%5)/1+" monedas de 1€");
        
    }
    
}
