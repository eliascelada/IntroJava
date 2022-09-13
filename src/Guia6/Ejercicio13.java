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
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese tamaño del cuadrado");
        int tamaño =leer.nextInt();
        for(int j=0;j<tamaño;j++){
          for(int i=0;i<tamaño;i++){
            if(j==0 || j==tamaño-1){
                System.out.print("*");
            }else if(i==0 || i==tamaño-1){
                System.out.print("*");
            }else System.out.print(" ");
                
        }
            System.out.println("");
       }
    }
    
}
