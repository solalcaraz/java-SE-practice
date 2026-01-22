package main;

import java.util.Scanner;

public class MatricesSecundario {
    public static void main(String[] args) {
        double notas[][] = new double[4][3];
        double promedios[] = new double[4];
        double total = 0;
        Scanner sc = new Scanner(System.in);

        // carga de las notas
        for (int f=0; f<notas.length;f++) {
            System.out.println("Ingrese las notas del alumno: " + (f+1));
            for (int c=0;c<notas[0].length;c++) {
                notas[f][c] = sc.nextDouble();
            }
        }

        //calculo de los promedios
        for (int f=0; f<notas.length;f++) {
            for (int c=0;c<notas[0].length;c++) {
                total += notas[f][c];
            }
            promedios[f] = total / notas[0].length;
            total=0;
        }

        System.out.println("----------PROMEDIOS----------");
        //mostrar notas y promedio
        for (int f=0; f<notas.length;f++) {
            System.out.println("Las notas del alumno N°" + (f+1) + " son:");
            for (int c=0;c<notas[0].length;c++) {
                System.out.println(notas[f][c]);
            }
            System.out.println("El promedio fue de: " + promedios[f]);
            System.out.println("-----------------------------");
        }
    }
}