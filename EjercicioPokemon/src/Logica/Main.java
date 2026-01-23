package Logica;

public class Main {
    public static void main(String[] args) {
        Squirtle squirtle = new Squirtle();
        Pikachu pikachu = new Pikachu();
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();

        squirtle.atacarBurbuja();
        squirtle.atacarPistolaAgua();
        pikachu.atacarRayoCarga();
        pikachu.atacarArañazo();
        charmander.atacarArañazo();
        charmander.atacarAscuas();
        bulbasaur.atacarDrenaje();
        bulbasaur.atacarArañazo();
    }
}