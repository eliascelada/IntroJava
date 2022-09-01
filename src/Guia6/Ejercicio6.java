/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia6;

import java.util.Scanner;

/**
 *
 * @author efc_1
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un número: ");
        int num = leer.nextInt();
        if(num%2==0){
            System.out.println("EL número ingresado es par.");
        }
        else {
            System.out.println("El número ingresado es impar.");
        }
    }
    
}
