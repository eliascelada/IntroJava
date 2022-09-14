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
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
    int num, divisor;
    int contador=0;
    System.out.println("Ingrese un numero: "); 
    num=leer.nextInt();
    
    if(num/10<1){
        System.out.println("Es de un dígito.");  
    } else{
        while(num>0){
        System.out.println(num);
        num=(num/10);
        contador++;
        }
        System.out.println("La cantidad de dígitos del número ingresado es: " + contador);
    }
    }
}
