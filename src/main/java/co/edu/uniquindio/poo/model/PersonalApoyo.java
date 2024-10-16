package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class PersonalApoyo extends Participante{

    private String experienciaPrevia;

    /**
     * constructor
     */
    public PersonalApoyo(String nombres, String apellidos, String nacionalidad, LocalDate fechaNacimiento, byte edad, String paisRepresentacion, String experienciaPrevia){
        super(nombres, apellidos, nacionalidad, fechaNacimiento, edad, paisRepresentacion);
        this.experienciaPrevia=experienciaPrevia;
    }

    public String getExperienciaPrevia() {
        return experienciaPrevia;
    }

    public void setExperienciaPrevia(String experienciaPrevia) {
        this.experienciaPrevia = experienciaPrevia;
    }

    

}
