package retornoDeValor;

import java.util.ArrayList;
import java.util.Scanner;

public class E_ListasSegundoEjemplo {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// FUNCIÓN que devuelve una lista con nombres predefinidos
		ArrayList<String> ingresoNombres = cargarNombres();

		// FUNCIÓN que pide al usuario el nombre a buscar y lo devuelve
		String nombreBuscado = pedirNombreABuscar();

		// FUNCIÓN que busca el nombre en la lista y devuelve true o false
		boolean esEncontrado = buscarNombre(ingresoNombres, nombreBuscado);

		// PROCEDIMIENTO que muestra el resultado según el valor booleano recibido
		mostrarResultado(nombreBuscado, esEncontrado);
	}

	// FUNCIÓN que CREA y DEVUELVE una lista de nombres predefinidos (simula carga)
	public static ArrayList<String> cargarNombres() {
		ArrayList<String> nombres = new ArrayList<>();

		// Agregamos nombres directamente a la lista (no por teclado)
		nombres.add("Daniel");
		nombres.add("Rosalia");
		nombres.add("Maite");
		nombres.add("Alfredo");
		nombres.add("Ruben");

		return nombres; // La lista completa se devuelve al main
	}

	// FUNCIÓN que pide al usuario un nombre y lo devuelve como resultado
	public static String pedirNombreABuscar() {
		System.out.print("Ingresá un nombre para buscar: ");
		String nombreParaBuscar = entrada.nextLine();
		
		  if (nombreParaBuscar.isEmpty()) {
		        System.out.println("No ingresaste ningún nombre. Saliendo...");
		        return ""; // retorna vacío y termina la función acá
		    }
		  
		return nombreParaBuscar; // Devuelve lo que el usuario escribió
		
	}

	// FUNCIÓN que busca un nombre en la lista y devuelve true si lo encuentra
	public static boolean buscarNombre(ArrayList<String> listaDeNombres, String buscado) {
		// Recorremos la lista elemento por elemento
		for (int i = 0; i < listaDeNombres.size(); i++) {
			String actual = listaDeNombres.get(i);

			// Comparamos el nombre actual con el buscado (ignorando mayúsculas/minúsculas)
			if (actual.equalsIgnoreCase(buscado)) {
				return true; // Si lo encontramos, devolvemos true
			}
		}

		return false; // Si no lo encontramos, devolvemos false
	}

	// PROCEDIMIENTO que muestra un mensaje según si se encontró o no el nombre
	public static void mostrarResultado(String nombre, boolean fueEncontrado) {
		if (fueEncontrado) {
			System.out.println("✅ " + nombre + " está en la lista.");
		} else {
			System.out.println("❌ " + nombre + " no fue encontrado.");
		}
	}
}
