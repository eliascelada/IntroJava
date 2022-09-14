/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package Guia6.Extras;
import java.util.Scanner;

/**
 *
 * @author efc_1
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String nom, opc;
        int edad;
        int mayores = 0, menores = 0;
        System.out.println("Ingrese la cantidad de personas: ");
        int N = leer.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.println("Nombre de la persona " + i + ": ");
            nom = leer.next();
            System.out.println("Ingrese la edad: ");
            edad = leer.nextInt();
            if (Edad(nom, edad)){
                mayores++;
            } else {
                menores++;
            }
            System.out.println("¿Desea continuar ingresando personas? Ingrese NO para salir o cualquier tecla para continuar:");
            opc = leer.next();
            if ("no".equalsIgnoreCase(opc)){
                break;
            }
        }
        System.out.println("Ingresó " + mayores + " personas mayores de edad.");
        System.out.println("Ingresó " + menores + " personas menores de edad.");

    }
    public static boolean Edad(String nom, int edad){
        if (edad >= 18){
            System.out.println(nom + " es mayor de edad.");
            return true;
        } else {
            System.out.println(nom + " es menor de edad.");
            return false;
        }
    }
    
}
