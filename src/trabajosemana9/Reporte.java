/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajosemana9;

import java.util.ArrayList;

public class Reporte {
    private double totalRecaudado;
    private ArrayList<String> servicios;
    private ArrayList<Integer> cantidades;
    private ArrayList<Double> ingresos;

    public Reporte() {
        totalRecaudado = 0.0;
        servicios = new ArrayList<>();
        cantidades = new ArrayList<>();
        ingresos = new ArrayList<>();
    }

    
    public void registrarVenta(String servicio, int cantidad, double total) {
        totalRecaudado += total;

       
        int index = servicios.indexOf(servicio);
        if (index != -1) {
            
            cantidades.set(index, cantidades.get(index) + cantidad);
            ingresos.set(index, ingresos.get(index) + total);
        } else {
            
            servicios.add(servicio);
            cantidades.add(cantidad);
            ingresos.add(total);
        }
    }

    
    public void generarReporte() {
        System.out.println("\n----- REPORTE FINAL -----");
        System.out.println("Total recaudado: $" + totalRecaudado);

        System.out.println("\nServicios realizados:");
        for (int i = 0; i < servicios.size(); i++) {
            System.out.println("- " + servicios.get(i) + ": " + cantidades.get(i) + " servicios realizados.");
        }

        System.out.println("\nIngresos por servicio:");
        for (int i = 0; i < servicios.size(); i++) {
            System.out.println("- " + servicios.get(i) + ": $" + ingresos.get(i));
        }

        System.out.println("\nGracias por utilizar el sistema. Hasta pronto.");
    }
}