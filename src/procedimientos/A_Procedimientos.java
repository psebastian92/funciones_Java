package procedimientos;

public class A_Procedimientos {

    public static void main(String[] args) {
        mostrarSaludo();
        mostrarMenu();
        especialidadesDisponibles();
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
    
    public static void especialidadesDisponibles() {
    	String[] conjuntoTurnos = {"Psicología", "Pediatría", "Oftalmología"};
  		System.err.println("\tEspecialidades disponibles: ");
  		for (int i = 0; i < conjuntoTurnos.length; i++) {
			System.out.println("\tEspecialidad: " + conjuntoTurnos[i]);
		}
  	}

    public static void mostrarDespedida() {
        System.err.println("Gracias por usar el sistema. ¡Hasta luego!");
    }
}