package procedimientos;

public class A_Procedimientos {

    public static void main(String[] args) {
        mostrarSaludo();
        mostrarMenu();
        mostrarDespedida();
    }

    public static void mostrarSaludo() {
        System.out.println("================================");
        System.err.println("¡Bienvenido al sistema de turnos!");
        System.out.println("================================");
    }

    public static void mostrarMenu() {
        System.out.println("1 - Sacar turno");
        System.out.println("2 - Consultar turno");
        System.out.println("3 - Cancelar turno");
        System.out.println("4 - Salir");
    }

    public static void mostrarDespedida() {
        System.err.println("Gracias por usar el sistema. ¡Hasta luego!");
    }
}