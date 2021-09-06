package poo.taller.punto3.domain;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class Agenda {
    public int capacidad;
    private List<Contacto> contactos;

    public Agenda() {
        this.contactos = new ArrayList<>();
    }

    public void crear(Contacto c){
        contactos.add(c);

    }
    public void crear() {
        for (int i = 0; i < contactos.size(); i++) {
            System.out.println(contactos.get(i).getNombres());
            System.out.println(contactos.get(i).getApellidos());
            System.out.println(contactos.get(i).getNumero());
        }
    }
    public boolean eliminarContacto(String numero){
        for (int i=0;i<contactos.size();i++){
            if (numero == contactos.get(1).getNumero()){
                contactos.remove(1);
            }
        }
    }

    public boolean buscarContactoNombre(String Nombres){
        for (int i=0;i<contactos.size();i++){
            if(Nombres == contactos.get(1).getNombres()){
                System.out.println(contactos.get(1).getNombres());
            }
        }

    }
    public boolean buscarContactoApellido(String Apellidos){
        for (int i=0;i<contactos.size();i++){
            if(Apellidos == contactos.get(1).getNumero()){
                System.out.println(contactos.get(1).getApellidos());
            }
        }

    }
    public boolean buscarContactoNumero(){

        for (int i=0;i<contactos.size();i++){
            if(numero == contactos.get(1).getNumero()){
                System.out.println(contactos.get(1).getNumero());
            }
        }

    }

    public int cambiarNumeroContacto(){
        return 0;
    }
}
