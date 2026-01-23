package Logica;

public class Squirtle extends Pokemon implements Agua{
    @Override
    public void atacarHidrobomba() {
        System.out.println("Soy Squirtle y estoy atacando con Hidrobomba");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Soy Squirtle y estoy atacando con Pistola de Agua");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Soy Squirtle y estoy atacando con Burbuja");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Soy Squirtle y estoy atacando con Hidropulso");
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Squirtle y estoy atacando con Placaje");
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("Soy Squirtle y estoy atacando con Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Squirtle y estoy atacando con Mordisco");
    }
}
