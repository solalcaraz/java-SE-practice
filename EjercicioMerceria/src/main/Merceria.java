package main;

import java.util.Scanner;

public class Merceria {
    public static void main(String[] args) {
        int cantPaquetes;
        double montoTotal, diferencia, descuento, totalConDesc;
        Scanner sc = new Scanner(System.in);

        System.out.println("*****BIENVENIDO A LA MERCERIA*****");
        System.out.println("Ingrese la cantidad de paquetes:");
        cantPaquetes = sc.nextInt();

        if (cantPaquetes<5) {
            if (cantPaquetes<0) {
                System.out.println("No se permiten compras con cantidad de paquetes negativos.");
            } else {
                System.out.println("No se realizan ventas minoristas (cantidad de paquetes menor a 5).");
            }
        } else {
            System.out.println("Ingrese el monto total de la compra:");
            sc = new Scanner(System.in);
            montoTotal = sc.nextDouble();

            if (cantPaquetes>=5 && cantPaquetes<=15) {
                System.out.println("El costo del envío sale 10USD.");
                montoTotal += 10;
            } else {
                System.out.println("El envío es gratis. ¡Muchas gracias por su compra!");
            }

            if (montoTotal<100) {
                diferencia = 100 - montoTotal;
                System.out.println("El monto es menor a 100 por lo que no posee promociones. " +
                        "Le falta comprar " + diferencia + "USD");
            } else {
                if (montoTotal>=100 & montoTotal<=300) {
                    descuento = montoTotal*0.05;
                    totalConDesc =  montoTotal - descuento;
                    System.out.println("Por su compra tiene un descuento del 5% que equivale a: " + descuento +
                            ". El monto total final con decuento es: " +totalConDesc);
                } else {
                    descuento = montoTotal*0.10;
                    totalConDesc = montoTotal - descuento;
                    System.out.println("Por su compra tiene un descuento del 10% que equivale a: " +descuento+
                            ". El monto total final con descuento es: " +totalConDesc);
                }
            }
        }
    }
}