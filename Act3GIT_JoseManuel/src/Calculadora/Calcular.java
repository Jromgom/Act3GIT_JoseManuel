package Calculadora;

import java.util.Scanner;

public class Calcular {

	public static void main(String[] args) {
		
		//1º Informamos
		System.out.println("Este programa realiza una calculadora simple");
		
		//2º Pedimos los valores
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("Introduzca el primer valor: ");
		double primerValor = Double.parseDouble(entrada.nextLine());
		// Pedir la operación a realizar. Los valores admitidos serían +, -, *, / y %
		System.out.println("Introduce la operación a realizar: ");
		char operacion = entrada.nextLine().charAt(0);		
		System.out.println("Introduzca el segundo valor: ");
		double segundoValor = entrada.nextDouble();
		
		//3º Resolvemos
		
		
		if(operacion == '+') {
			double resultado = primerValor + segundoValor;
			System.out.println("El resultado de la suma es: " + resultado);
		}else if(operacion == '-') {
			double resultado = primerValor - segundoValor;
			System.out.println("El resultado de la resta es: " + resultado);
		}else if(operacion == '*') {
			double resultado = primerValor * segundoValor;
			System.out.println("El resultado de la multiplicación es: " + resultado);
		}else if(operacion == '/') {
			if (segundoValor != 0) {
				double resultado = primerValor / segundoValor;
				System.out.println("El resultado de la división es: " + resultado);
			}else {
				System.out.println("ERROR: Introduzca un valor distinto de cero");
			}
		}else if(operacion == '%') {
			if (segundoValor != 0) {
				double resultado = primerValor % segundoValor;
				System.out.println("El resultado de la división es: " + resultado);				
			}else {
				System.out.println("ERROR: Introduzca un valor distinto de cero");
			}
		}	
	}
}
