package co.alejo.dominio;

public class Persona {
    public String nombre;
    public short edad;
    public long identificacion;

    public Persona(String nombre, long identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    public Persona(String nombre, short edad, long identificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.identificacion = identificacion;
    }
}
