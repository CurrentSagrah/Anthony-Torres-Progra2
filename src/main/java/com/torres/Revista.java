package com.torres;

public class Revista extends Recurso {

    private String edicion;
    private String categoria;

    public Revista(String id, String titulo, String edicion, String categoria) {
        super(id, titulo);

        this.edicion = edicion;
        this.categoria = categoria;
    }

    @Override
    public void mostrarFichaTecnica() {

        super.mostrarFichaTecnica();

        System.out.println("Edicion: " + edicion);
        System.out.println("Categoria: " + categoria);
    }
}