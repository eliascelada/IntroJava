/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
12. Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
*/
package Guia6;

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
        Scanner leer=new Scanner(System.in);
        String frase;
        int correcto=0,incorrecto=0;
     
        do{
         
        System.out.println("ingrese una frase");
        frase=leer.next();
         
        if(frase.length()!= 5){
        incorrecto ++;
            System.out.println("la frase debe se de 5 caracteres");
        continue;
        }
         
        if(frase.substring(0, 1).equalsIgnoreCase("x") && frase.substring(4,5).equalsIgnoreCase("o")){
        correcto ++;
        }else{ 
            incorrecto++;
            System.out.println("el formato de la frase es incorrecta ");
            }
         
         
    }while(!"&&&&&".equals(frase));
    System.out.println("correcto: "+correcto+"\n incorrecto: "+incorrecto);

    }
    
}
