package Calculadora;

import java.util.Scanner;
import java.util.Random;

public class Calcular {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num1, num2;
        do {
            System.out.print("Introduce el primer número: ");
            num1 = scanner.nextInt();
            
            System.out.print("Introduce el segundo número (debe ser distinto al primero): ");
            num2 = scanner.nextInt();
            
            if (num1 == num2) {
                System.out.println("Los números no pueden ser iguales. Intenta de nuevo.");
            }
        } while (num1 == num2);

        int menor = Math.min(num1, num2);
        int mayor = Math.max(num1, num2);

        System.out.println("Números entre " + menor + " y " + mayor + " incrementando de 7 en 7:");
        for (int i = menor; i <= mayor; i += 7) {
            System.out.println(i);
        }

        scanner.close();
    }
}