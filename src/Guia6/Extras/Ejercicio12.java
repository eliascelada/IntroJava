/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia6.Extras;
import java.util.Scanner;

/**
 *
 * @author efc_1
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (i == 3) {
                        System.out.print("E");
                    } else {
                        System.out.print(i);
                    }
                    if (j == 3) {
                        System.out.print("-E");
                    } else {
                        System.out.print("-" + j);                        
                    }
                    if (k == 3) {
                        System.out.print("-E");
                    }else {
                        System.out.print("-" + k);
                    }
                    System.out.println("");
                }

            }

        }
    }
}