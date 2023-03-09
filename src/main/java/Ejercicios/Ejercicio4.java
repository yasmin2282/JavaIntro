
package Ejercicios;

import java.util.Scanner;


public class Ejercicio4 {
    public static void main(String[] args) {
        double fahrenheit;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese los grados centigrados: ");
        fahrenheit = entrada.nextDouble();
        
        fahrenheit = 32+(9*fahrenheit/5);
        
        System.out.println("Su equivalente en Fahrenheit es: " + fahrenheit );
        
    }
}
