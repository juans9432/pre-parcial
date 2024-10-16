package co.edu.uniquindio.poo.model;

import java.util.LinkedList;

public class Equipo {

    private String nombre, paisOrigen;
    private LinkedList<Atleta> listaAtletas;

    /**
     * constructor
     */
    public Equipo(String nombre, String paisOrigen){
        this.nombre=nombre;
        this.paisOrigen=paisOrigen;
        this.listaAtletas=new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public LinkedList<Atleta> getListaAtletas() {
        return listaAtletas;
    }

    public void setListaAtletas(LinkedList<Atleta> listaAtletas) {
        this.listaAtletas = listaAtletas;
    }

    

}
