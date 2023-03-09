
package Ejercicios;

import java.util.Scanner;



public class Ejercicio3 {
    public static void main(String[] args) {
        String frase;
        Scanner entrada = new Scanner (System.in);
        System.out.print("Digite una frase: ");
        frase = entrada.nextLine();
        
   
        System.out.println("La frase en Mayusculas es: " + frase.toUpperCase());
        
   
        System.out.println("La frase en Minusculas es: " + frase.toLowerCase());
    }


}
