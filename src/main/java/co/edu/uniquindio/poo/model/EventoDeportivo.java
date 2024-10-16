package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.util.LinkedList;

public class EventoDeportivo {
    private String nombre, deporte, pais, ciudad;
    private LocalDate fechaInicio;
    private TipoEvento tipoEvento;
    private LinkedList<Participante> listaParticipantes;

    /**
     * constructor
     */
    public EventoDeportivo(String nombre, String deporte, String pais, String ciudad, LocalDate fechaInicio, TipoEvento tipoEvento){
        this.nombre=nombre;
        this.deporte=deporte;
        this.pais=pais;
        this.ciudad=ciudad;
        this.fechaInicio=fechaInicio;
        this.tipoEvento=tipoEvento;
        this.listaParticipantes=new LinkedList<>();    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public LinkedList<Participante> getListaParticipantes() {
        return listaParticipantes;
    }

    public void setListaParticipantes(LinkedList<Participante> listaParticipantes) {
        this.listaParticipantes = listaParticipantes;
    }
}
