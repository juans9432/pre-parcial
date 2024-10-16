package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Participante extends Persona {

    private byte edad;
    private String paisRepresentacion;

    /**
     * constructor
     */
    public Participante(String nombres, String apellidos, String nacionalidad, LocalDate fechaNacimiento, byte edad, String paisRepresentacion){
        super(nombres, apellidos, nacionalidad, fechaNacimiento);
        this.edad=edad;
        this.paisRepresentacion=paisRepresentacion;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getPaisRepresentacion() {
        return paisRepresentacion;
    }

    public void setPaisRepresentacion(String paisRepresentacion) {
        this.paisRepresentacion = paisRepresentacion;
    }
}
