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
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números.");
        int numero1 = leer.nextInt();
        int numero2 = leer.nextInt();
        int opc;
        do {
            System.out.println("¿Qué operación desea realizar?");
            System.out.println("1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("La suma es " + Sumar(numero1, numero2));
                    break;
                case 2:
                    System.out.println("La resta es " + Restar(numero1, numero2));
                    break;
                case 3:
                    System.out.println("La multiplicación es " + Multiplicar(numero1, numero2));
                    break;
                case 4:
                    System.out.println("La división es " + Dividir(numero1, numero2));
                    break;
                default:
                    System.out.println("Error, opción no valida. Finalizando....");
            }
        } while (opc>0&&opc<5);

    }

    public static int Sumar(int num1, int num2) {
        return num1 + num2;
    }

    public static int Restar(int num1, int num2) {
        return num1 - num2;
    }

    public static int Multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public static int Dividir(int num1, int num2) {
        return num1 / num2;
    }
    
}
