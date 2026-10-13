/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 52558
 */
// Archivo: Gerente.java
public class Gerente extends Empleado {
    private double bono;

    public Gerente(double salarioBase, double bono) {
        super(salarioBase); // Herencia con super
        setBono(bono);
    }

    public void setBono(double bono) {
        if (bono >= 0) {
            this.bono = bono;
        } else {
            this.bono = 0.0;
        }
    }

    public double getBono() {
        return bono;
    }

    public void mostrarPagoTotal() {
        double pagoTotal;
        pagoTotal = getSalarioBase() + getBono();
        System.out.println("Salario Base ingresado: $" + getSalarioBase());
        System.out.println("Bono ingresado: $" + getBono());
        System.out.println("Pago total calculado: $" + pagoTotal);
    }
}