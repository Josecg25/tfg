package com.example.ciudades.model;

public class Evento {

    private int idCiudad;
    private int idCategoria;
    private int idEvento;
    private String titulo;
    private String descripcion;
    private String url;

    public Evento(int idEvento, int idCiudad, int idCategoria, String titulo, String descripcion, String url) {
        this.idEvento = idEvento;
        this.idCiudad = idCiudad;
        this.idCategoria = idCategoria;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.url = url;
    }

    public Evento() {}

    public int getIdCiudad() { return idCiudad; }
    public int getIdCategoria() { return idCategoria; }
    public int getIdEvento() { return idEvento; }
    public String getTitulo() { return titulo; }
    public String getDescripcion() { return descripcion; }
    public String getUrl() { return url; }
}

