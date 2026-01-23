package Logica;

public class Charmander extends Pokemon implements Fuego{
    @Override
    public void atacarPunioFuego() {
        System.out.println("Soy Charmander y estoy atacando con Puño de Fuego");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Soy Charmander y estoy atacando con Ascuas");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Soy Charmander y estoy atacando con Lanza Llamas");
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Charmander y estoy atacando con Placaje");
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("Soy Charmander y estoy atacando con Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Charmander y estoy atacando con Mordisco");
    }
}