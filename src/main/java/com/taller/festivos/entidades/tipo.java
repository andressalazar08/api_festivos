package com.taller.festivos.entidades;

public class tipo {
    
    private long id;

    private String tipo;

    //creación de constructor vacío
    public tipo() {
    }

    public tipo(long id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    



}
