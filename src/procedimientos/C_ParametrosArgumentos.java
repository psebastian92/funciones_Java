package procedimientos;

import java.util.Scanner;

public class C_ParametrosArgumentos {


    public static void main(String[] args) {
        pedirDatosYSaludar();
        pedirSimboloYRepetirLinea();
    }

    public static void pedirDatosYSaludar() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Cómo te llamás? ");
        String nombre = entrada.nextLine();

        saludar(nombre);  
        // Acá PASAMOS el argumento 'nombre' a la función 'saludar'
    }

    public static void pedirSimboloYRepetirLinea() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Elegí un carácter para decorar (ej: *, -, #): ");
        String simbolo = entrada.nextLine();

        System.out.print("¿Cuántas veces querés repetirlo? ");
      

     // Verifico antes de leer
        if (!entrada.hasNextInt()) {
            System.out.println("⚠️ Error: No ingresaste un número entero. Saliendo...");
            entrada.nextLine(); // descarto lo que escribió el usuario
            return; // corto la función si no es válido
        }
        int cantidad = entrada.nextInt();
        
        repetirLinea(simbolo, cantidad);  
        // Acá PASAMOS los argumentos 'simbolo' y 'cantidad' a la función 'repetirLinea'

        entrada.close();
    }

    // 'nombre' es el PARÁMETRO que recibe la función 'saludar'
    public static void saludar(String nombre) {  
        System.out.println("\n¡Hola, " + nombre + "! Bienvenido/a al programa.");
    }

    // 'caracter' y 'cantidad' son los PARÁMETROS que recibe la función 'repetirLinea'
    public static void repetirLinea(String caracter, int cantidad) {  
        for (int i = 0; i < cantidad; i++) {
            System.out.print(caracter);
        }
        System.out.println(); // salto de línea
    }
}
