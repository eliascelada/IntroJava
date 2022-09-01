/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia6;

import static java.time.temporal.TemporalAdjusters.next;
import java.util.Scanner;

/**
 *
 * @author efc_1
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un número");
        int num = leer.nextInt();
        System.out.println("El doble de su número es " + num*2);
        System.out.println("El triple de su número es " + num*3);
        System.out.println("La raíz cuadrada de su número es " + Math.sqrt(num));
    }
    
}
