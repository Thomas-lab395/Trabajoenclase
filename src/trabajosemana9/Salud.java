/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajosemana9;


import java.util.ArrayList;
import java.util.Scanner;

public class Salud extends Servicio {
    private ArrayList<Double> precios;

    public Salud(Scanner entrada, Reporte reporte) {
        super(entrada, reporte); 
        precios = new ArrayList<>();
        precios.add(100.0); 
        precios.add(500.0); 
        precios.add(50.0);  
        precios.add(30.0);  
    }

    @Override
    public void mostrarMenu() {
        while (true) {
            System.out.println("----SALUD----"
                + "\n1. Vacunas"
                + "\n2. Operaciones"
                + "\n3. Medicamentos"
                + "\n4. Examenes"
                + "\n5. Regresar al menu principal"
                + "\nIngrese una opcion:");

            int opcion = obtenerOpcion();

            if (opcion == 5) break;

            if (opcion > 0 && opcion <= precios.size()) {
                double precio = precios.get(opcion - 1);
                System.out.println("Precio: $" + precio + ". cantidad de compra?:");
                int cantidad = obtenerOpcion();

                if (cantidad > 0) {
                    double total = precio * cantidad;
                    System.out.println("Total: $" + total);
                    reporte.registrarVenta("Salud - Servicio " + opcion, cantidad, total);
                } else {
                    System.out.println("Cantidad invalida.");
                }
            } else {
                System.out.println("Opcion invalida. Intente nuevamente.");
            }
        }
    }
}