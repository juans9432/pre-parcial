package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Entrenador extends Participante {

    private String especializacion;

    /**
     * constructor
     */
    public Entrenador(String nombres, String apellidos, String nacionalidad, LocalDate fechaNacimiento, byte edad, String paisRepresentacion, String especializacion){
        super(nombres, apellidos, nacionalidad, fechaNacimiento, edad, paisRepresentacion);
        this.especializacion=especializacion;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    

}
