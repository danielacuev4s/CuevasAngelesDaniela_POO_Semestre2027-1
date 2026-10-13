/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 52558
 */
// Archivo: Empleado.java
public class Empleado {
    protected double salarioBase;

    public Empleado(double salarioBase) {
        setSalarioBase(salarioBase);
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase >= 0) {
            this.salarioBase = salarioBase;
        } else {
            this.salarioBase = 0.0;
        }
    }

    public double getSalarioBase() {
        return salarioBase;
    }
}