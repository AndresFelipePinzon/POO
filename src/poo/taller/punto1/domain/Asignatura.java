package poo.taller.punto1.domain;

import java.util.ArrayList;
import java.util.List;

public class Asignatura {
    private String nombre;
    private int nroCreditos;
    private Docente docente;
    private List<Estudiante> estudiantes;


    public Asignatura(String nombre, Docente docente) {
        this.nombre = nombre;
        this.docente = docente;
        this.estudiantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getNroCreditos() {
        return nroCreditos;
    }

    public Docente getDocente() {
        return docente;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setNroCreditos(int nroCreditos) {
        this.nroCreditos = nroCreditos;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
}
