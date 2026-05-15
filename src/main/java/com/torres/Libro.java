package com.torres;

public class Libro extends Recurso {

    private String autor;
    private int paginas;

    public Libro(String id, String titulo, String autor, int paginas) {

        super(id, titulo);

        this.autor = autor;
        this.paginas = paginas;
    }

    @Override
    public void mostrarFichaTecnica() {

        super.mostrarFichaTecnica();

        System.out.println("Autor: " + autor);
        System.out.println("Paginas: " + paginas);
    }
}