package poo.taller.punto3.domain;

import java.util.ArrayList;
import java.util.List;


public class Agenda {
    public int capacidad;
    private List<Contacto> contactos;

    public Agenda() {
        this.contactos = new ArrayList<>(20);//tamaño de 20 contactos
    }

    public void crear(Contacto c){
        this.contactos.add(c);
    }
}
