/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// Archivo: Persona.java
public class Persona {
    protected String nombre;

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            this.nombre = "Sin Nombre";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre);
    }
}
