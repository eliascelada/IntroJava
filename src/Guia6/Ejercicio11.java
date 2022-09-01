/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia6;

/**
 *
 * @author efc_1
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1;
        int num2;
        int menu;
        String salir;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        num1 = entrada.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = entrada.nextInt();
        
        do {
            System.out.println("--MENU--"); 
            System.out.println("-1. SUMAR");
            System.out.println("-2. RESTAR");
            System.out.println("-3. MULTIPLICAR");
            System.out.println("-4. DIVIDIR");
            System.out.println("-5. SALIR");
            System.out.println("Ingrese una opción: ");
            opcion = entrada.nextInt();
            switch(opcion) {
                case 1:
                    System.out.println("la suma es " + (num1+num2));
                    break;
                case 2:
                    System.out.println("la resta es " +(num1-num2));
                    break;
                case 3:
                    System.out.println("la multiplicación es " +(num1*num2));
                    break;
                case 4:
                    System.out.println("la división es " +(num1/num2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    salir=entrada.nextLine();
                    if(){


                    };
                    break;




            }



        } while(menu!=5);

          System.out.println("Desea salir");
    }
    
}
