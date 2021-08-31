package poo.taller.punto1.domain;

public class Docente {
    private String identificacion;
    private String nombre;
    private int edad;

    public Docente(String identificacion, String nombre) {
        this.identificacion = identificacion;
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
