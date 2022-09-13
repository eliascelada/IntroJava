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
public class MatrizVectorPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner leer  = new Scanner(System.in);
        
        String[] vector=new String[10];
       int [][] faf=new int[2][3];
      /* 
       for(int i=0;i<10;i++){
            System.out.println("ingrese nombres ");
            vector[i]=leer.next();
        }
        
        for (int i=0;i<10;i++){
            System.out.print(" ,"+vector[i]);
        }
        System.out.println("");
        
      */
        for(int t=0;t<2;t++){
         for(int j=0;j<3;j++){
         
            faf[t][j] = (int) (Math.random()*100);
             System.out.print(" "+faf[t][j]);
         }
            System.out.println("");
        }

    }
    
}
