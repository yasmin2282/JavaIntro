
package Ejercicios;

import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        String nombre;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite su nombre: ");
        nombre = entrada.next();
        
        System.out.println("Hola " + nombre + "!!");
    }
}
