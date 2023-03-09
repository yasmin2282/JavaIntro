
package Ejercicios;

import java.util.Scanner;


public class Ejercicio5 {
    public static void main(String[] args) {
        int entero;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite un numero entero: ");
        
        entero = entrada.nextInt();
        
        System.out.println("El doble: " + entero*2);
        System.out.println("El triple: " + entero*3);
        System.out.println("La raiz cuadrada: " + Math.sqrt(entero));
        
    }
}
