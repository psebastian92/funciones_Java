package retornoDeValor;

import java.util.Scanner;

public class A_FuncionesConRetorno {
	static Scanner entrada = new Scanner(System.in);

	// FUNCIÓN PRINCIPAL
	public static void main(String[] args) {

		String nombreIngresado = gestionarNombre();
		
		// Dentro de la función println del "SYSO", se pasa como ARGUMENTO
		// la propia funcion saludar(), que es del tripo String
		String saludoEfectuado = saludar("Pedro");
		System.out.println( saludar( nombreIngresado ) );
		
		System.out.println("--------");
		
		// Le pasamos como ARGUMENTO "Pedro" a la función saludar
		System.out.println( saludar("Pedro") );
		
	}

	// Funcion del tipo String. Es decir, se obligara a 
	// colocar la palabra "RETURN" para que la funcion
	// se iguale a "nombre".
	
	public static String gestionarNombre() {
		String nombre;

		System.out.println("Ingrese su nombre: ");
		nombre = entrada.next();

		return nombre;
	}

	// Función "saludar()", que espera como parámetro un String
	// y retorna otro String. 
	public static String saludar( String nombreEsperado ) {
		
		return "Hola " + nombreEsperado;
	}
}
