package com.cifpceuta.applistadolibros;

public class Libro {

    private String titulo;
    private int paginas;

    private int portada;

    private String description;

    public Libro(String titulo, int paginas, int portada,String description) {
        this.titulo = titulo;
        this.paginas = paginas;
        this.portada = portada;
        this.description = description;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getPortada() {
        return portada;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPortada(int portada) {
        this.portada = portada;
    }
}
