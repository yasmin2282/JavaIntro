
package Ejercicios;

import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) {
        int numero1,numero2;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite el primer numero: ");
        numero1 = entrada.nextInt();
        System.out.print("Digite el segundo numero: ");
        numero2 = entrada.nextInt();
        
        
        System.out.println("La suma de " + numero1 + " + " + numero2 + " es: " + (numero1+numero2));
        
    }
}
