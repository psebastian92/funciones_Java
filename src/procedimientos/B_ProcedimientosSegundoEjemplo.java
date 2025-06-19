package procedimientos;

import java.util.Scanner;

public class B_ProcedimientosSegundoEjemplo {

    static int vidaJugador = 100;
    static int vidaEnemigo = 80;

    public static void main(String[] args) {
        mostrarInicio();
        jugar();
        mostrarResultadoFinal();
    }

    public static void mostrarInicio() {
        System.out.println("🎮 ¡Comienza la batalla!");
        System.out.println("Tu vida: 100 | Vida del enemigo: 50");
        System.out.println("-----------------------------------");
    }

    public static void jugar() {
        Scanner sc = new Scanner(System.in);

        while (vidaJugador > 0 && vidaEnemigo > 0) {
            mostrarEstado();
            mostrarMenu();

            System.out.print("Elegí una opción: ");
            int opcion = sc.nextInt();

            if (opcion == 1) {
                atacar();
            } else if (opcion == 2) {
                curarse();
            } else {
                System.out.println("Opción no válida.");
                continue;
            }

            turnoEnemigo();
        }

        sc.close();
    }

    public static void mostrarMenu() {
        System.out.println("\n1 - Atacar");
        System.out.println("2 - Curarse");
    }

    public static void mostrarEstado() {
        System.out.println("\n❤️ Tu vida: " + vidaJugador);
        System.out.println("💀 Vida del enemigo: " + vidaEnemigo);
    }

    public static void atacar() {
        int daño = 15;
        vidaEnemigo -= daño;
        System.out.println("⚔️ Atacaste al enemigo y le quitaste " + daño + " puntos.");
    }

    public static void curarse() {
        int cura = 10;
        vidaJugador += cura;
        if (vidaJugador > 100) vidaJugador = 100; // Si llega a 100 de vida, no dejar que aumente mas de 100.
        System.out.println("💊 Te curaste " + cura + " puntos.");
    }

    public static void turnoEnemigo() {
        if (vidaEnemigo <= 0) return;

        int accion = (int)(Math.random() * 2); // 0 o 1

        if (accion == 0) {
            int daño = 10;
            vidaJugador -= daño;
            System.out.println("👾 El enemigo te atacó e hizo " + daño + " de daño.");
        } else if (accion == 1) {
            int cura = 8;
            vidaEnemigo += cura;
            if (vidaEnemigo > 100) vidaJugador = 100; // Si llega a 100 de vida, no dejar que aumente mas de 100.
            System.out.println("👾 El enemigo se curó " + cura + " puntos de vida.");
        }
    }

    public static void mostrarResultadoFinal() {
        System.out.println("\n🎬 Fin del juego.");
        if (vidaJugador <= 0 && vidaEnemigo <= 0) {
            System.out.println("🤝 ¡Empate!");
        } else if (vidaJugador <= 0) {
            System.out.println("💀 Perdiste...");
        } else {
            System.out.println("🏆 ¡Ganaste!");
        }
    }
}
