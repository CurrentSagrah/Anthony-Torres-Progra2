package com.torres;

public class Recurso {

    protected String id;
    protected String titulo;
    protected boolean disponible;

    public Recurso(String id, String titulo) {
        this.id = id;
        this.titulo = titulo;
        this.disponible = true;
    }

    public String getId() {
        return id;
    }

    public void mostrarFichaTecnica() {
        System.out.println("ID: " + id);
        System.out.println("Titulo: " + titulo);
        System.out.println("Disponible: " + disponible);
    }
}