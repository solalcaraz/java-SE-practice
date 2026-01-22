package main;

import java.util.Scanner;

public class Estacionamiento {
    public static void main(String[] args) {
        int tipoServicio, cantHoras, contHora=0, contMedia=0, contCompleta=0;
        double total, totalDia=0.0;
        String patente = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la patente del vehículo:");
        patente = sc.nextLine();

        while (!patente.equalsIgnoreCase("fin")) {
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
                    contHora++;
                    totalDia += total;
                } else {
                    if (tipoServicio == 2) {
                        total = (5*3) * 0.95;
                        System.out.println("El servicio de media jornada corresponde a 5hs y posee un 5% de descuento. " +
                                "Por lo que el valor total de su estacionamiento es de: " + total);
                        contMedia++;
                        totalDia += total;
                    } else {
                        total = (10*3) * 0.9;
                        System.out.println("El servicio de jornada completa corresponde a 10hs y posee un 10% de descuento. " +
                                "Por lo que el valor total a abonar es de: " + total);
                        contCompleta++;
                        totalDia += total;
                    }
                }
                System.out.println("*****MUCHAS GRACIAS POR SU COMPRA!*****");
            }
            sc = new Scanner(System.in);
            System.out.println("\nIngrese la patente del vehículo:");
            patente = sc.nextLine();
        }
        System.out.println("\n##########################################");
        System.out.println("Totales monetarios del dia.");
        System.out.println("Cantidad Servicios por Hora: " + contHora);
        System.out.println("Cantidad Servicios de Media Jornada: " + contMedia);
        System.out.println("Cantidad Servicios de Jornada Completa: " + contCompleta);
        System.out.println("El monto total recaudado del dia es de $: " + totalDia + "USD");
    }
}