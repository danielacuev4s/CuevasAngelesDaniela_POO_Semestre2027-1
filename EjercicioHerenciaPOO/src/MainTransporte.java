/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 52558
 */
// Archivo: Main.java (Herencia con Override)
import java.util.Scanner;

public class MainTransporte {
    public static void main(String[] args) {
        // --- 1. DECLARACIÓN DE VARIABLES ---
        Scanner lector;
        Transporte miTransporte;
        Avion miAvion;
        int tipoTransporte;

        // --- 2. INICIALIZACIÓN ---
        lector = new Scanner(System.in);
        miTransporte = new Transporte();
        miAvion = new Avion();

        System.out.println("OVERRIDE");
        System.out.println("¿Que tipo de transporte desea probar?");
        System.out.println("1. Transporte generico");
        System.out.println("2. Avion (Método Override)");
        System.out.print("Seleccione una opción (1 o 2): ");

        // ENTRADA DEL USUARIO
        while (!lector.hasNextInt()) {
            System.out.println("Error: Debe ingresar 1 o 2.");
            lector.next();
        }
        tipoTransporte = lector.nextInt();

        // SALIDA 
        System.out.println("RESULTADO");
        if (tipoTransporte == 1) {
            miTransporte.arrancar();
        } else if (tipoTransporte == 2) {
            miAvion.arrancar();
        } else {
            System.out.println("Opción no valida. Se ejecutara el transporte por defecto:");
            miTransporte.arrancar();
        }

        lector.close();
    }
}
