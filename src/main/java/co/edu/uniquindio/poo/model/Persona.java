package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Persona {

    private String nombres, apellidos, nacionalidad;
    private LocalDate fechaNacimiento;

    /**
     * constructor
     */
    public Persona(String nombres, String apellidos, String nacionalidad, LocalDate fechaNacimiento){
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.nacionalidad=nacionalidad;
        this.fechaNacimiento=fechaNacimiento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    

}
