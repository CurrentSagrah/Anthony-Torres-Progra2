package com.torres;

/*
Estudiante: Anthony Torres
Materia: Programacion II
Fecha: 15-05-2026
*/
public class Main {

    public static void main(String[] args) {

        Biblioteca miBiblioteca = new Biblioteca();


        Libro libro1 = new Libro(
                "L001",
                "Cien años de soledad",
                "Gabriel Garcia Marquez",
                471
        );


        Revista revista1 = new Revista(
                "R001",
                "National Geographic",
                "2026",
                "Ciencia"
        );


        Digital digital1 = new Digital(
                "D001",
                "Curso Java PDF",
                "PDF",
                "5MB"
        );


        miBiblioteca.registrarRecurso(libro1);
        miBiblioteca.registrarRecurso(revista1);
        miBiblioteca.registrarRecurso(digital1);

        System.out.println("===== INVENTARIO COMPLETO =====");
        miBiblioteca.mostrarInventario();

        System.out.println("===== SOLO LIBROS =====");
        miBiblioteca.mostrarLibros();
        System.out.println("===== SOLO REVISTAS =====");
        miBiblioteca.mostrarRevistas();


        System.out.println("===== SOLO DIGITALES =====");
        miBiblioteca.mostrarDigitales();

        System.out.println("===== BUSQUEDA POR ID =====");

        Recurso encontrado = miBiblioteca.BuscarPorID("L001");

        if (encontrado != null) {
            encontrado.mostrarFichaTecnica();
        } else {
            System.out.println("Recurso no encontrado");
        }
    }
}