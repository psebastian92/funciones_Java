package retornoDeValor;

public class B_FuncionesConRetorno {

	public static void main(String[] args) {
		// 1er paso: invocar a la función "sumar", pasándole dos datos para que los sume
		int suma = sumar(2, 4);

		// 2do paso: a la función "mostrarEnPantalla" se le pasa como argumento "suma".
		mostrarEnPantalla(suma);
	}

	public static void mostrarEnPantalla(int suma) {

		System.out.println("Resultado de la suma: " + suma);
		
		boolean esPositivo = analizarPositividad(suma);
		
		if (esPositivo) {
			System.out.println("Es un número positivo");
		} else {
			System.out.println("Es un número negativo");
		}

	}

	public static int sumar(int a, int b) {
		int resultadoSuma = a + b;

		return a + b;
		// return resultadoSuma;
	}

	public static boolean analizarPositividad(int resultadoSuma) {

		if (resultadoSuma >= 0) {

			return true;
		} else {

			return false;
		}

	}

}
