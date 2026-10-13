/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 52558
 */
// Archivo: Main.java (Herencia Simple)
import java.util.Scanner;

public class MainProfesor {
    public static void main(String[] args) {
        //DECLARACIÓN DE VARIABLES
        Scanner lector;
        Profesor miProfesor;
        String nombreIngresado;
        String materiaIngresada;

        // INICIALIZACIÓN
        lector = new Scanner(System.in);
        miProfesor = new Profesor();

        System.out.println("HERENCIA SIMPLE");

        // ENTRADA DEL USUARIO
        System.out.print("Ingrese el nombre del profesor: ");
        nombreIngresado = lector.nextLine();
        miProfesor.setNombre(nombreIngresado);

        System.out.print("Ingrese la materia que imparte: ");
        materiaIngresada = lector.nextLine();
        miProfesor.setMateria(materiaIngresada);

        //SALIDA
        System.out.println("RESULTADOS");
        miProfesor.saludar();
        miProfesor.darClase();

        lector.close();
    }
}
