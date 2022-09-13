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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num, contN = 0, contP = 0, contI = 0;
        do {
            System.out.println("Ingrese un número.");
            num = leer.nextInt();
            if (num % 5 == 0 && num != 0) {
                if (num % 2 == 0 && num>0) {
                    contP++;
                } else if(num>0) {
                    contI++;
                }

                break;
            }
            if (num < 0) {
                continue;
            }
            contN++;
            if (num % 2 == 0) {
                contP++;
            } else {
                contI++;
            }

        } while (num <= 0 || num > 0);
        System.out.println("Has ingresado " + contN + " números.");
        System.out.println("La cantidad de números pares es: " + contP);
        System.out.println("La cantidad de números impares es: " + contI);
    }
    
}
