/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajosemana9;


/**
 *
 * @author Mayra Bardales
 */
import java.util.Scanner;

public class Trabajosemana9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Reporte reporte = new Reporte();

        while (true) {
            try {
                System.out.println("-----MENU-----"
                    + "\n1. Abrir caja"
                    + "\n2. Cerrar caja y generar reporte"
                    + "\nIngrese una opción:");

                int opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("-----SERVICIOS-----"
                            + "\n1. Salud"
                            + "\n2. Estetica"
                            + "\nIngrese una opcion:");

                        int opcion2 = entrada.nextInt();
                        Servicio servicio = null;

                        if (opcion2 == 1) {
                            servicio = new Salud(entrada, reporte);
                        } else if (opcion2 == 2) {
                            servicio = new Estetica(entrada, reporte);
                        } else {
                            System.out.println("Opcion invalida. Intente nuevamente.");
                        }

                        if (servicio != null) servicio.mostrarMenu();
                        break;

                    case 2:
                        System.out.println("Generando reporte...");
                        reporte.generarReporte();
                        System.out.println("Cerrando el programa. Gracias!");
                        entrada.close();
                        return;

                    default:
                        System.out.println("Opcion no valida. Intente nuevamente.");
                }
            } catch (Exception e) {
                System.out.println("Entrada invalida. Intente nuevamente...");
                entrada.nextLine(); 
            }
        }
    }
}