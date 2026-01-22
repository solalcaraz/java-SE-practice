package main;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        /* Hacer un programa que dependiendo del promedio de un alumno,
        nos diga si aprobó o no una materia */
        double promedio;
        String condicionFinal;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el promedio del alumno:");
        promedio = sc.nextDouble();

        condicionFinal = (promedio>=6) ? "Aprobado" : "Desaprobado";

        System.out.println("El alumno esta " + condicionFinal + ", donde el promedio fue: " + promedio);
    }
}