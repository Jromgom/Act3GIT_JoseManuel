package Calculadora;


import java.util.*;

import java.util.Scanner;
import java.util.Random;


public class Calcular {
        
        public static void main(String[] args) {
        	  	
    		// TODO Auto-generated method stub
    		
    		//Crear el tablero
    		char[][] tablero = new char[5][5];
    		
    		for (int i=0; i<5; i++) {
    			for (int j=0; j<5; j++) {
    				tablero[i][j] ='-';
    		}
    		}
    		
    		//Introducimos el lugar del barco
    		Scanner sc = new Scanner(System.in); 
    		Random aleatorio = new Random();
    		
    		int valorX = aleatorio.nextInt(5);
    		int valorY = aleatorio.nextInt(5);
    		
    		
    		// El codigo comentado siguiente pedía el valor del barco a buscar:
    		//Se ha mejorado creando número aleatorios
    		
//    		System.out.println("Introduzca el valor de x: ");
//    		int valorX = Integer.parseInt(sc.nextLine());
//    		System.out.println("Introduzca el valor de y: ");
//    		int valorY = Integer.parseInt(sc.nextLine());
    		
    		tablero[valorX][valorY]= 'O';
    		
    		//Visualizamos por pantalla en tablero
    		for (int i=0; i<5; i++) {
    			for (int j=0; j<5; j++) {
    				System.out.print(tablero[i][j]);
    			}
    			System.out.println("\n       ");
    		}
    		
    		//10 intentos para acertar
    		
    		System.out.println("Intenta acertar donde está mi barco");
    		
    		for (int i=0; i<10; i++) {
    			System.out.println("introduzca el valor de X: ");
    			int valor1 = Integer.parseInt(sc.nextLine());
    			System.out.println("introduzca el valor de Y: ");
    			int valor2 = Integer.parseInt(sc.nextLine());
    			
    			if (tablero[valor1][valor2] == 'O') {
    				System.out.println("Acertaste. Has hundido mi barco");
    				break;
    			}else {
    				System.out.println("Fallaste. Sigo vivo");
    			}
    			
    			System.out.println("Te quedan " + (9 - i) + " intentos" );
    			
    			if (i==9) {
    				System.out.println("HAS FALLADO");
    			}
    		}	
	    }
	}

