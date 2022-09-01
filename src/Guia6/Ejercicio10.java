package Guia6;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        int numLimite;
        int num;
        int suma=0;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese numero limite");
        numLimite = entrada.nextInt();
        while(suma<=numLimite){
            System.out.println("Ingrese numero a sumar");
            num = entrada.nextInt();
            suma=suma+num;  
        }
        System.out.println("la suma es " + suma);
    }
}
