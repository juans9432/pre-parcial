package co.edu.uniquindio.poo.model;

import java.util.LinkedList;
import java.util.List;

public class Empresa {
    private String nombre;
    private LinkedList<EventoDeportivo> listaEventos;

    /**
     * constructor
     */
    public Empresa(String nombre){
        this.nombre=nombre;
        this.listaEventos=new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<EventoDeportivo> getListaEventos() {
        return listaEventos;
    }

    public void setListaEventos(LinkedList<EventoDeportivo> listaEventos) {
        this.listaEventos = listaEventos;
    }

    /**
     * metodo que retorna los atletas que participaron en un evento de natacion de tipo competicion
     */
    public List<Atleta> listaAtletasNatacion(){
        List<Atleta> listaAtletasNatacion = new LinkedList<>();

        for(EventoDeportivo eventoAux : listaEventos){
            if(eventoAux.getDeporte().equals("natacion") && eventoAux.getTipoEvento().equals(TipoEvento.COMPETICION)){
                for (Participante participante : eventoAux.getListaParticipantes()) {
                    if (participante instanceof Atleta) {
                        listaAtletasNatacion.add((Atleta) participante);
                    }  
                }      
            }
        }
        return listaAtletasNatacion;
    }
    
}
