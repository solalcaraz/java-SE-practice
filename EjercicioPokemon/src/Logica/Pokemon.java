package Logica;

public abstract class Pokemon {
    protected int num_pokedex, temporadaQueAparece;
    protected String nombrePokemon, tipo;
    protected double pesoPokemon;
    protected char sexo;

    protected abstract void atacarPlacaje();
    protected abstract void atacarArañazo();
    protected abstract void atacarMordisco();
}
