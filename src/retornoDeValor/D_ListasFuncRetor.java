package retornoDeValor;

import java.util.ArrayList;

public class D_ListasFuncRetor {

    public static void main(String[] args) {
        // FUNCIÓN que devuelve una lista de animales
        ArrayList<String> listaAnimales = obtenerListaAnimales();

        // Mostrar el contenido de la lista recibida
        mostrarLista(listaAnimales);
    }

    // FUNCIÓN: crea una lista con nombres de animales y la devuelve
    public static ArrayList<String> obtenerListaAnimales() {
        ArrayList<String> animales = new ArrayList<>();

        animales.add("Perro");
        animales.add("Gato");
        animales.add("Loro");
        animales.add("Conejo");

        return animales;  // Devuelve la lista completa al main
    }

    // PROCEDIMIENTO: recibe una lista y la muestra
    public static void mostrarLista(ArrayList<String> lista) {
        System.out.println("Lista de animales:");
        for (String animal : lista) {
            System.out.println("- " + animal);
        }
    }
}
