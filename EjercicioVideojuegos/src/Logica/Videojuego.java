package Logica;

public class Videojuego {
    // Punto 1
    private int codigo, cantidadJugadores;
    private String titulo, consola, categoria;

    public Videojuego() {}

    public Videojuego(int codigo, int cantidadJugadores, String titulo, String consola, String categoria) {
        this.codigo = codigo;
        this.cantidadJugadores = cantidadJugadores;
        this.titulo = titulo;
        this.consola = consola;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidadJugadores() {
        return cantidadJugadores;
    }

    public void setCantidadJugadores(int cantidadJugadores) {
        this.cantidadJugadores = cantidadJugadores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
