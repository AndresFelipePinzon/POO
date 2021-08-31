package poo.hotel.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Hotel {
    private String nombre;
    private String ciudad;
    private int nroEstrellas;
    private List<Habitacion> habitaciones;
    private List<Restaurante> restuarantes;
    private Piscina piscina;
    private List<Empleado> empleados;

    public Hotel(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.habitaciones = new ArrayList<>();
        this.restuarantes = new ArrayList<>();
        this.empleados = new ArrayList<>();
    }

    public List<Habitacion> getHabitacionesPorPisoFuncional(int piso) {
        List<Habitacion> habs = this.getHabitaciones().stream().filter(h -> {
            return h.getPiso() == piso;
        }).collect(Collectors.toList());

        return habs;
    }

    public List<Habitacion> getHabitacionesPorPiso(int piso) {
        List<Habitacion> habitacionesDelPiso = new ArrayList<>();
        for (Habitacion h: this.getHabitaciones()) {
            if (h.getPiso() == piso) {
                habitacionesDelPiso.add(h);
            }
        }
        return habitacionesDelPiso;
    }

    public Habitacion getHabitacionPorNumeroFuncional(int numero) {
        Habitacion hab = this.getHabitaciones().stream().filter(h -> {
            return h.getNumero() == numero;
        }).findFirst().orElse(null);

        return hab;
    }

    public Habitacion getHabitacionPorNumero(int numero) {
        for (Habitacion h: this.getHabitaciones()) {
            if (h.getNumero() == numero) {
                return h;
            }
        }

        return null;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getNroEstrellas() {
        return nroEstrellas;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public List<Restaurante> getRestuarantes() {
        return restuarantes;
    }

    public Piscina getPiscina() {
        return piscina;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNroEstrellas(int nroEstrellas) {
        this.nroEstrellas = nroEstrellas;
    }

    public void setRestuarantes(List<Restaurante> restuarantes) {
        this.restuarantes = restuarantes;
    }

    public void setPiscina(Piscina piscina) {
        this.piscina = piscina;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }
}
