/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia6;

import java.util.Scanner;

/**
 *
 * @author Elias Celada 21. Dadas dos matrices cuadradas de números enteros, la
 * matriz M de 10x10 y la matriz P de 3x3, se solicita escribir un programa en
 * el cual se compruebe si la matriz P está contenida dentro de la matriz M.
 * Para ello se debe verificar si entre todas las submatrices de 3x3 que se
 * pueden formar en la matriz M, desplazándose por filas o columnas, existe al
 * menos una que coincida con la matriz P. En ese caso, el programa debe indicar
 * la fila y la columna de la matriz M en la cual empieza el primer elemento de
 * la submatriz P.
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int[][] matrizChica = new int[3][3];
        int[][] matrizGrande = new int[10][10];
        rellenarMatriz(matrizGrande);
        
        impresionMatriz(matrizGrande);
        //rellenarMatriz(matrizChica);
        for (int i = 0; i < matrizChica.length; i++) {
            for (int j = 0; j < matrizChica.length; j++) {
                System.out.println("Ingresa los valores de la matriz chica ");
                matrizChica[i][j]=leer.nextInt();
            }
        }
        System.out.println("");
        impresionMatriz(matrizChica);
        System.out.println("");
        for (int i = 0; i < matrizGrande.length; i++) {
            for (int j = 0; j < matrizGrande.length; j++) {
                if((matrizGrande[i][j] == matrizChica[0][0])&&(matrizGrande[i][j+1]==matrizChica[0][1])&&(matrizGrande[i][j+2]== matrizChica[0][2])){
                    System.out.println("["+ i +"]" + "["+ j +"]");
                    
 
                }else{
                    System.out.println("No se encuentra la matriz");
                    break;
                }
            }
    }
}
    public static void rellenarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }
    public static void impresionMatriz(int[][] matriz) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }
    }
}
