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
public class Ejercicio9 {
/*Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java.
*/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        if ("A".equals(frase.substring(0,1)) || "a".equals(frase.substring(0,1))) {
            /*Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        frase = toUpperCase(frase);
        if ("A".equals(frase.substring(0, 1)) ) {
            System.out.println("Correcto");
        }
        else {
            System.out.println("Incorrecto");
        }
        */
            System.out.println("La frase es correcta.");
        }
        else {
            System.out.println("La frase es incorrecta.");
        }
    }
    
}
