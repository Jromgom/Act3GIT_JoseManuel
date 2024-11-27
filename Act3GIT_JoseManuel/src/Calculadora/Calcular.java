package Calculadora;

import java.util.*;

public class Calcular {

	public static void main(String[] args) {
        generarNumerosAleatorios();
    }

    public static void generarNumerosAleatorios() {
        Random random = new Random(); 
        System.out.println("30 números aleatorios entre 1 y 10:");
        for (int i = 0; i < 30; i++) { 
            int numeroAleatorio = random.nextInt(10) + 1; 
            System.out.print(numeroAleatorio + " ");
        }
    }
}
