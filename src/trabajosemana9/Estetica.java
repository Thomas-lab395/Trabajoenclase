/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajosemana9;

import java.util.ArrayList;
import java.util.Scanner;

public class Estetica extends Servicio {
    private ArrayList<Double> precios;

    public Estetica(Scanner entrada, Reporte reporte) {
        super(entrada, reporte);
        precios = new ArrayList<>();
        precios.add(50.0);  // Corte de pelo
        precios.add(70.0);  // Baño completo
    }

    @Override
    public void mostrarMenu() {
        while (true) {
            System.out.println("----ESTETICA----"
                + "\n1. Corte de pelo"
                + "\n2. Baño completo"
                + "\n3. Regresar al menu principal"
                + "\nIngrese una opción:");

            int opcion = obtenerOpcion();

            if (opcion == 3) break;

            if (opcion > 0 && opcion <= precios.size()) {
                double precio = precios.get(opcion - 1);
                System.out.println("Precio: $" + precio + ". Ingrese la cantidad: ");
                int cantidad = obtenerOpcion();

                if (cantidad > 0) {
                    double total = precio * cantidad;
                    System.out.println("Total: $" + total);
                    reporte.registrarVenta("Estetica - Servicio " + opcion, cantidad, total);
                } else {
                    System.out.println("Cantidad invalida.");
                }
            } else {
                System.out.println("Opcion invalida. Intente nuevamente...");
            }
        }
    }
}