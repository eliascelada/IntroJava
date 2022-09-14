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
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias.");
        int N = leer.nextInt();
        int M, E;
        int sumaM = 0;
        int sumaE = 0;
        for (int i = 1; i <= N; i++) {
            System.out.println("Familia "+i);
            System.out.println("Ingrese la cantidad de hijos.");
            M = leer.nextInt();
            sumaM += M;
            for (int j = 1; j <= M; j++) {
                System.out.println("Hijo "+j);
                System.out.println("Ingrese la edad.");
                E = leer.nextInt();
                sumaE+= E; // sumaE = sumaE + E
            }
        }
        System.out.println("La media de edad de los hijos es "+(sumaE/sumaM));

    }
    
}
