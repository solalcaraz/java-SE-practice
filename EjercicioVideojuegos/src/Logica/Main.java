package Logica;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Punto 2
        List<Videojuego> listaJuegos = new ArrayList<Videojuego>();

        Videojuego juego1 = new Videojuego(1, 1, "Crash Bandicooot", "PS1", "Plataformas");
        Videojuego juego2 = new Videojuego(2, 1, "Donkey Kong", "Family / NES", "Plataformas");
        Videojuego juego3 = new Videojuego(3, 4, "Mario Kart 64", "Nintendo 64", "Plataformas");
        Videojuego juego4 = new Videojuego(4, 1, "The Legend of Zelda: Ocarina of Time", "Nintendo 64", "Aventura / Acción");
        Videojuego juego5 = new Videojuego(5, 2, "Mortal Kombat", "SEGA Genesis", "Peleas");

        listaJuegos.add(juego1);
        listaJuegos.add(juego2);
        listaJuegos.add(juego3);
        listaJuegos.add(juego4);
        listaJuegos.add(juego5);

        // Punto 3
        for (Videojuego juego: listaJuegos) {
            String jugador = juego.getCantidadJugadores() > 1 ? "jugadores" : "jugador";
            System.out.println("El juego " + juego.getTitulo() + " permite " + juego.getCantidadJugadores() + " " + jugador + ". Está disponible en la consola: " + juego.getConsola());
        }

        // Punto 4
        juego4.setTitulo("Zeldita");
        juego4.setCantidadJugadores(2);
        juego1.setTitulo("Crash");
        juego1.setCantidadJugadores(5);

        System.out.println("-----Cambio de nombre y jugadores para dos juegos-----");
        for (Videojuego juego: listaJuegos) {
            String jugador = juego.getCantidadJugadores() > 1 ? "jugadores" : "jugador";
            System.out.println("El juego " + juego.getTitulo() + " permite " + juego.getCantidadJugadores() + " " + jugador + ". Está disponible en la consola: " + juego.getConsola());
        }

        // Punto 5
        System.out.println("----------------------");
        for (Videojuego juego: listaJuegos) {
            if (juego.getConsola().equals("Nintendo 64")) {
                System.out.println(juego.toString());
            }
        }
    }
}