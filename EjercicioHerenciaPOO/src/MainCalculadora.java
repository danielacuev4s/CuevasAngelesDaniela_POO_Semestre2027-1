/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 52558
 */
// Cuevas Angeles Daniela
//Este programa calcula la suma de dos números enteros y dos decimales
import java.util.Scanner;

public class MainCalculadora {
    public static void main(String[] args) {
        // DECLARACIÓN DE VARIABLES
        Scanner lector;
        Calculadora calc;
        
        int entero1;
        int entero2;
        double decimal1;
        double decimal2;
        
        int resultadoEnteros;
        double resultadoDecimales;

        // INICIALIZACIÓN
        lector = new Scanner(System.in);
        calc = new Calculadora();

        System.out.println("SOBRECARGA");

        //ENTRADA DEL USUARIO ENTEROS
        System.out.print("Ingrese el primer número entero: ");
        while (!lector.hasNextInt()) {
            System.out.println("Error: Ingrese un valor entero válido.");
            lector.next();
        }
        entero1 = lector.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        while (!lector.hasNextInt()) {
            System.out.println("Error: Ingrese un valor entero válido.");
            lector.next();
        }
        entero2 = lector.nextInt();

        //ENTRADA DEL USUARIO PARA DECIMALES
        System.out.print("Ingrese el primer número decimal: ");
        while (!lector.hasNextDouble()) {
            System.out.println("Error: Ingrese un valor decimal válido.");
            lector.next();
        }
        decimal1 = lector.nextDouble();

        System.out.print("Ingrese el segundo número decimal: ");
        while (!lector.hasNextDouble()) {
            System.out.println("Error: Ingrese un valor decimal válido.");
            lector.next();
        }
        decimal2 = lector.nextDouble();

        // SOBRECARGA
        resultadoEnteros = calc.sumar(entero1, entero2);
        resultadoDecimales = calc.sumar(decimal1, decimal2);

        // RESULTADOS
        System.out.println("RESULTADOS");
        System.out.println("Suma de dos enteros (" + entero1 + " + " + entero2 + "): " + resultadoEnteros);
        System.out.println("Suma de dos decimales (" + decimal1 + " + " + decimal2 + "): " + resultadoDecimales);

        lector.close();
    }
}