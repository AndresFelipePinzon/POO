package poo.hotel.dominio;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    public String nombre;
    public String ciudad;
    public int nroEstrellas;
    public List<Habitacion> habitaciones;
    public List<Restaurante> restuarantes;
    public Piscina piscina;
    public List<Empleado> empleados;

    public Hotel(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.habitaciones = new ArrayList<>();
        this.restuarantes = new ArrayList<>();
        this.empleados = new ArrayList<>();
    }
}
