package procedimientos;

import java.util.Scanner;

public class D_ParamArgumenSegundoEjemplo {
	
	static int num1, num2;
	static Scanner entrada = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		// Acá se llaman los procedimientos PASANDO ARGUMENTOS concretos:
		ingresarNumeros();
		sumar(num1, num2); // argumentos: num1 y num1
		
		restar(10, 4); // argumentos: 10 y 4
		
		multiplicar(7, 6); // argumentos: 7 y 6
		
		dividir(20, 5); // argumentos: 20 y 5
	}
	
	public static void ingresarNumeros() {
		System.out.println("Ingrese el primer numero: ");
		num1 = entrada.nextInt();
		
		System.out.println("Ingrese el segundo numero: ");
		num2 = entrada.nextInt();
	}

	// PARÁMETROS: variables que la función recibe para usar dentro de su código
	public static void sumar(int a, int b) {
		int resultado = a + b;
		System.out.println(a + " + " + b + " = " + resultado);
	}

	public static void restar(int a, int b) {
		int resultado = a - b;
		System.out.println(a + " - " + b + " = " + resultado);
	}

	public static void multiplicar(int a, int b) {
		int resultado = a * b;
		System.out.println(a + " * " + b + " = " + resultado);
	}

	public static void dividir(int a, int b) {
		if (b != 0) { // Validación para evitar división por cero
			double resultado = (double) a / b; // Convertimos para obtener resultado decimal
			System.out.println(a + " / " + b + " = " + resultado);
		} else {
			System.out.println("Error: No se puede dividir por cero.");
		}
	}
}
