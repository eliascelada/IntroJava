/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia6;

import java.util.Scanner;

/**
 *
 * @author Elias Celada
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int[][] matrizMagica = new int[3][3];
        
        int diagonal = 0;
        int diagonal2=0;
        boolean magica=false;
        
        
        llenadoMatriz(matrizMagica);
        impresionMatriz(matrizMagica);

        //verificacion diagonal principal
        for (int i = 0; i < matrizMagica.length; i++) {
            for (int j = 0; j < matrizMagica.length; j++) {
                if (i == j) {
                    diagonal += matrizMagica[i][j];
                }
            }
        }
        System.out.println("La suma de la diagonal principal es: " + diagonal);
        
        
        
        //verificacion diagonal secundaria
        for (int i = 0; i < matrizMagica.length; i++) {
            for (int j = 0; j < matrizMagica.length; j++) {
                if (i+j==(matrizMagica.length-1)) {
                    diagonal2 += matrizMagica[i][j];
                }
            }
        }
        System.out.println("La suma de la diagonal secundaria es: " + diagonal2);

        
        
        //verificacion fila
        for (int i = 0; i < matrizMagica.length; i++) {
            int fila=0;
            for (int j = 0; j < matrizMagica.length; j++) {
                    fila += matrizMagica[i][j];
                
            }
            System.out.println("la suma de la fila "+(i+1)+" es: "+fila);
            
            if(diagonal==diagonal2 && diagonal==fila){
                magica=true;
            }else{
                magica=false;
                break;
            }
            //if(magica=false);
            //break;
                
            }
        
        
        
        //verificacion columna
        for (int j = 0; j < matrizMagica.length; j++) {
            int columna=0;
            for (int i = 0; i < matrizMagica.length; i++) {
                    columna += matrizMagica[i][j];
                
            }
            System.out.println("la suma de la columna "+(j+1)+" es: "+columna);
            if(diagonal==diagonal2 && diagonal==columna){
                magica=true;
            }else{
                magica=false;
               break;
            }
        }
        
        
        if(magica==true){
            System.out.println("La matriz es magica");
        }else{
            System.out.println("La matriz NO es magica");
        }
        
        
        
        
        
        
    }

    //metodo llenado matriz
    public static void llenadoMatriz(int[][] matrizMagica) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < matrizMagica.length; i++) {
            for (int j = 0; j < matrizMagica.length; j++) {
                do{
                System.out.println("Ingresa el valor de la posicion [" + i + j + "]");
     
                matrizMagica[i][j] = leer.nextInt();
                }while(matrizMagica[i][j]<0 || matrizMagica[i][j]>10);
            }
        }
    }

    //metodo impresion matriz
    public static void impresionMatriz(int[][] matrizMagica) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < matrizMagica.length; i++) {
            for (int j = 0; j < matrizMagica.length; j++) {
                System.out.print("[" + matrizMagica[i][j] + "] ");
            }
            System.out.println("");
        }
    }
}