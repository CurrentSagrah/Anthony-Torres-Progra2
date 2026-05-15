package com.torres;

public class Digital extends Recurso {

    private String formato;
    private String tamano;

    public Digital(String id, String titulo, String formato, String tamano) {
    super(id, titulo);

        this.formato = formato;
        this.tamano = tamano;
    }

    @Override
    public void mostrarFichaTecnica() {

        super.mostrarFichaTecnica();

        System.out.println("Formato: " + formato);
        System.out.println("Tamaño: " + tamano);
    }
}