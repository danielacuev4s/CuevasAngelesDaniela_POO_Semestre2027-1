/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 52558
 */
// Cuevas Angeles Daniela
import java.util.Scanner;

public class MainEmpleado {
    public static void main(String[] args) {
        //DECLARACIÓN DE VARIABLES
        Scanner lector;
        Gerente miGerente;
        double salarioIngresado;
        double bonoIngresado;

        //INICIALIZACIÓN
        lector = new Scanner(System.in);

        System.out.println("HERENCIA CON SUPER");

        //ENTRADA DEL USUARIO
        System.out.print("Ingrese el salario base del empleado/gerente: ");
        while (!lector.hasNextDouble()) {
            System.out.println("Error: Ingrese un valor numerico valido.");
            lector.next();
        }
        salarioIngresado = lector.nextDouble();

        System.out.print("Ingrese el bono correspondiente: ");
        while (!lector.hasNextDouble()) {
            System.out.println("Error: Ingrese un valor numérico válido.");
            lector.next();
        }
        bonoIngresado = lector.nextDouble();

        //SALIDA
        miGerente = new Gerente(salarioIngresado, bonoIngresado);
        
        System.out.println("RESULTADOS");
        miGerente.mostrarPagoTotal();

        lector.close();
    }
}
