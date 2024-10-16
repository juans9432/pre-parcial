package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Atleta extends Participante{

    private byte aniosExperiencia;

    /**
     * constructor
     */
    public Atleta(String nombres, String apellidos, String nacionalidad, LocalDate fechaNacimiento, byte edad, String paisRepresentacion, byte aniosExperiencia){
        super(nombres, apellidos, nacionalidad, fechaNacimiento, edad, paisRepresentacion);
        this.aniosExperiencia=aniosExperiencia;
    }

    public byte getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(byte aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    
}
