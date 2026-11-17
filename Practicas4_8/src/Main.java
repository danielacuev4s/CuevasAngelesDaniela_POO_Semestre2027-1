/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 52558
 */
/*Realizado por:
    - Pérez Galindo Claudia
    - Zepeda Calalpa Carlos
    - Cuevas Angeles Daniela
    - Victoriano Escalante Emma Paola
-----------------------------------
Funcionamiento general
    Este es el probador principal, aquí se instancia la clase Biblioteca
    para gestionar el registro de libros, de usuarios y la ejecución
    de los préstamos
*/

/*Realizado por:
    - Pérez Galindo Claudia
    - Zepeda Calalpa Carlos
-----------------------------------
Funcionamiento general
    Este es el probador principal, aquí se instancia la clase Biblioteca
    y se ejecutan los 4 casos de prueba solicitados en la práctica.
*/

public class Main {

    // Declaracion de métodos -----------------------------------------------------------------

    public static void main(String[] args) {

        Biblioteca miBiblioteca;
        Libro libro1;
        Libro libro2;
        Libro libro3;
        Usuario usuario1;
        Usuario usuario2;
        Prestamo prestamo1;

        System.out.println("---------- ");

        miBiblioteca = new Biblioteca();

        System.out.println("\n--- Caso 1: Registro de Libros ---");
        libro1 = new Libro("111", "Java Básico", "Varios Autores", 2021, true);
        libro2 = new Libro("222", "Clean Code", "Robert C. Martin", 2008, true);
        libro3 = new Libro("333", "Patrones de Diseño", "GoF", 1994, true);

        miBiblioteca.agregarLibro(libro1);
        miBiblioteca.agregarLibro(libro2);
        miBiblioteca.agregarLibro(libro3);

        miBiblioteca.mostrarCatalogo();

        System.out.println("\n--- Caso 2: Registro de Usuarios ---");
        // Se usa el constructor disponible en la clase Usuario.
        usuario1 = new Usuario(1, "Juan Pérez", "juancho@gmail.com", "55-1111-2222", true);
        usuario2 = new Usuario(2, "María Gómez", "maria.gomez@gmail.com", "55-3333-4444", true);

        miBiblioteca.registrarUsuario(usuario1);
        miBiblioteca.registrarUsuario(usuario2);

        miBiblioteca.mostrarUsuarios();

        System.out.println("\n--- Caso 3: Solicitud de Préstamo ---");
        System.out.println("Juan solicita el libro Clean Code.");
        
        prestamo1 = new Prestamo(usuario1, libro2); 
        prestamo1.iniciarPrestamo(); 
        
        System.out.println("Resultado esperado:");
        System.out.println("Libro disponible = " + libro2.estaDisponible());
        System.out.println("Préstamo activo = " + prestamo1.estaActivo());

        System.out.println("\n--- Caso 4: Devolución de Libro ---");
        System.out.println("Juan devuelve el libro.");
        miBiblioteca.devolverLibro(prestamo1); 
        
        System.out.println("Resultado esperado:");
        System.out.println("Libro disponible = " + libro2.estaDisponible());
        System.out.println("Préstamo activo = " + prestamo1.estaActivo());
    }
}