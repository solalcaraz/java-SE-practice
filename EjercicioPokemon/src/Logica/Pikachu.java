package Logica;

public class Pikachu extends Pokemon implements Electrico{
    @Override
    public void atacarImpactrueno() {
        System.out.println("Soy Pikachu y estoy atacando con Impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Soy Pikachu y estoy atacando con Puño de Trueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Soy Pikachu y estoy atacando con Rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Soy Pikachu y estoy atacando con Rayo carga");
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Pikachu y estoy atacando con Placaje");
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("Soy Pikachu y estoy atacando con Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Pikachu y estoy atacando con Mordisco");
    }
}