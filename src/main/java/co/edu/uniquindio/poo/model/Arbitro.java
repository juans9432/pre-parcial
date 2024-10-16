package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Arbitro extends Participante {

    private String nivelExperiencia;

    /**
     * constructor
     */
    public Arbitro(String nombres, String apellidos, String nacionalidad, LocalDate fechaNacimiento, byte edad, String paisRepresentacion, String nivelExperiencia){
        super(nombres, apellidos, nacionalidad, fechaNacimiento, edad, paisRepresentacion);
        this.nivelExperiencia=nivelExperiencia;
    }

    public String getNivelExperiencia() {
        return nivelExperiencia;
    }

    public void setNivelExperiencia(String nivelExperiencia) {
        this.nivelExperiencia = nivelExperiencia;
    }

    

}
