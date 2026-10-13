/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 52558
 */
// Archivo: Profesor.java
public class Profesor extends Persona {
    private String materia;

    public void setMateria(String materia) {
        if (materia != null && !materia.trim().isEmpty()) {
            this.materia = materia;
        } else {
            this.materia = "General";
        }
    }

    public String getMateria() {
        return materia;
    }

    public void darClase() {
        System.out.println("El profesor " + getNombre() + " está impartiendo la clase de " + getMateria());
    }
}