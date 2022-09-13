/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extras;
import java.util.Scanner;
/**
 *
 * @author efc_1
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        int dividendo,divisor,resultado,coci=0;
        
        System.out.println("Ingrese el 1er numero");
        dividendo=entrada.nextInt();
        System.out.println("Ingrese el 2do numero");
        divisor=entrada.nextInt();
        resultado=dividendo;

        
        while(resultado>divisor){
        
        resultado=dividendo-divisor;
        dividendo=resultado;
           // System.out.println(resultado);
            coci++;
        
        }   
        
        System.out.println("el residuo es " + resultado);
        System.out.println("el cociente es " + coci);
    }
    
}
