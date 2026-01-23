package Logica;

public class Main {
    public static void main(String[] args) {
        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(5, "Sol", "Alcaraz");

        System.out.println("La id del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre del alumno 2 es: " + alu2.getNombre());
        System.out.println("El apellido del alumno 2 es: " + alu2.getApellido());

        alu1.setId(8);
        alu1.setNombre("Pepito");
        alu1.setApellido("Gomez");

        System.out.println("-----------------");
        System.out.println("La id del alumno 1 es: " + alu1.getId());
        System.out.println("El nombre del alumno 1 es: " + alu1.getNombre());
        System.out.println("El apellido del alumno 1 es: " + alu1.getApellido());

        alu2.setId(20);
        System.out.println("-----------------");
        System.out.println("La id del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre del alumno 2 es: " + alu2.getNombre());
        System.out.println("El apellido del alumno 2 es: " + alu2.getApellido());
    }
}