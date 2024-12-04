/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajosemana9;
 import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Servicio {
    protected Scanner entrada; 
    protected Reporte reporte; 

   
    public Servicio(Scanner entrada, Reporte reporte) {
        this.entrada = entrada;
        this.reporte = reporte;
    }

   
    public abstract void mostrarMenu();

    
    protected int obtenerOpcion() {
        try {
            return entrada.nextInt();
        } catch (InputMismatchException e) {
            entrada.nextLine(); 
            System.out.println("Entrada invalida. Intente nuevamente.");
            return -1; 
        }
    }
}