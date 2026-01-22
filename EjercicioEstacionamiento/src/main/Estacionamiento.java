package main;

import java.util.Scanner;

public class Estacionamiento {
    public static void main(String[] args) {
        int tipoServicio, cantHoras, total;
        double totalMediaJornada, totalJornadaCompleta;
        String patente = "";
        Scanner sc = new Scanner(System.in);

        while(!patente.equalsIgnoreCase("fin")) {
            System.out.println("Ingrese la patente del vehículo:");
            patente = sc.nextLine();

            System.out.println("Ingrese el tipo de servicio segun corresponda:");
            System.out.println("1. Por hora");
            System.out.println("2. Por media jornada");
            System.out.println("3. Por Jornada completa");
            sc = new Scanner(System.in);
            tipoServicio = sc.nextInt();

            if (tipoServicio>3 || tipoServicio<=0) {
                System.out.println("No ingreso un tipo de servicio correcto.");
            } else {
                if (tipoServicio == 1) {
                    System.out.println("Ingrese las horas que desea estacionar:");
                    cantHoras = sc.nextInt();
                    total = 3 * cantHoras;
                    System.out.println("El valor total a abonar es: $" + total + "USD");
                } else {
                    if (tipoServicio == 2) {
                        totalMediaJornada = (5*3) * 0.95;
                        System.out.println("El servicio de media jornada corresponde a 5hs y posee un 5% de descuento." +
                                "Por lo que el valor total de su estacionamiento es de: " + totalMediaJornada);
                    } else {
                        totalJornadaCompleta = (10*3) * 0.9;
                        System.out.println("El servicio de jornada completa corresponde a 10hs y posee un 10% de descuento." +
                                "Por lo que el valor total a abonar es de: " + totalJornadaCompleta);
                    }
                }
            }
        }
    }
}