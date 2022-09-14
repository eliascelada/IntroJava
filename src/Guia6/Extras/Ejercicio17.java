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
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe un número: ");
        int num = leer.nextInt();
        System.out.println("El Numro Ingresado es <<<PRIMO>>>???: " + "- " + numPrimo(num) + " -");
    }

    public static boolean numPrimo(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        if (num == 0 || num == 1) {
            return false;
        }
        return true;        
    }    
}

/*
Otra solución:
public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número para ver si primo o no.");
        int num = leer.nextInt();
        if(EsPrimo(num)){
            System.out.println("Es primo");
        }else{
            System.out.println("No es primo");
        }
    }
    public static boolean EsPrimo(int num){
        int cont = 0;
        for (int i = 1; i <= num; i++) {
            if(num%i == 0){
                cont++;
            }
        }
        System.out.println(cont);
        if(cont==2){
            return true;
        }
        return false;
    }
*/
