package Logica;

public class Bulbasaur extends Pokemon implements Planta{
    @Override
    public void atacarParalizar() {
        System.out.println("Soy Bulbasur y estoy atacando con Paralizar");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Soy Bulbasur y estoy atacando con Drenaje");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Soy Bulbasur y estoy atacando con Hoja Afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Soy Bulbasur y estoy atacando con Latigo Cepa");
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Bulbasur y estoy atacando con Placaje");
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("Soy Bulbasur y estoy atacando con Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Bulbasur y estoy atacando con Mordisco");
    }
}
