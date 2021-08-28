package poo.banco.dominio;

import java.time.LocalDateTime;

public class Persona {
    private String nombre;
    private long identificacion;
    private LocalDateTime fechaNacimiento;

    public Persona(String nombre, long identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.fechaNacimiento = LocalDateTime.now();
    }

    public Persona(String nombre, long identificacion, LocalDateTime fechaNacimiento) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    public long getIdentificacion() {
        return identificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
