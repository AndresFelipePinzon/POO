package poo.taller.punto2.domain;

public class Mecato {
    private int codigo;
    private String nombre;
    private int precio;
    private int cantidadActual;


    public Mecato(int codigo, String nombre, int precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
}



