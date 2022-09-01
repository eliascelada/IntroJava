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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una frase: ");
        String frase = leer.nextLine();
        if ("eureka".equals(frase)){
            System.out.println("La frase ingresada es correcta.");
        }
        else {
            System.out.println("La frase ingresada es incorrecta.");
        }
    }

    private static void equal(String eureka) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
