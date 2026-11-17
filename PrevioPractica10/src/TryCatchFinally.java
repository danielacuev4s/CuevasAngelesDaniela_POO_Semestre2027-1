/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 52558
 */
public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            int equis = 5/0;
            System.out.println("Equis = " + equis);
        } catch ( ArithmeticException e ) {
            System.out.println("Error: división entre cero.");
        } catch ( Exception e ) {
            System.out.println("Error: excepción general.");
        } finally {
            System.out.println("El bloque finally siempre se ejecuta.");
        }
    }
}
