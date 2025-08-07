package retornoDeValor;

import java.util.Arrays;
import java.util.Scanner;

public class C_ArraysFuncRetor {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        // PASO 1: Ingreso de números
        float[] misNumeros = ingresarNumeros();

        // Mostrar los números antes de ordenar
        System.out.println("\nNúmeros ingresados:");
        mostrarNumeros(misNumeros);

        // PASO 2: Ordenar sin modificar el original
        float[] numerosOrdenados = ordenarNumeros(misNumeros);

        // Mostrar los números ordenados
        System.out.println("\nNúmeros ordenados (original no se modifica):");
        mostrarNumeros(numerosOrdenados);

        // Mostrar nuevamente el original para comprobar que no cambió
        System.out.println("\nNúmeros originales después del ordenamiento:");
        mostrarNumeros(misNumeros);
    }

    // Función que pide números y devuelve un array
    public static float[] ingresarNumeros() {
        System.out.print("¿Cuántos números desea guardar? ");
        int cantidadNumeros = entrada.nextInt();

        float[] guardarNumeros = new float[cantidadNumeros];

        for (int i = 0; i < guardarNumeros.length; i++) {
            System.out.print("Ingrese un número: ");
            guardarNumeros[i] = entrada.nextFloat();
        }

        // Devuelve el array completo
        return guardarNumeros;
    }

    // Función que ordena SIN modificar el array original (clona)
    public static float[] ordenarNumeros(float[] numerosParaOrdenar) {
        // Clonamos el array para no modificar el original
        float[] copia = Arrays.copyOf(numerosParaOrdenar, numerosParaOrdenar.length);

        Arrays.sort(copia); // Ordena la copia

        return copia; // Devuelve el array ordenado
    }

    // Procedimiento que muestra los números
    public static void mostrarNumeros(float[] arrayParaMostrar) {
        for (int i = 0; i < arrayParaMostrar.length; i++) {
            System.out.println(arrayParaMostrar[i]);
        }
    }
}
