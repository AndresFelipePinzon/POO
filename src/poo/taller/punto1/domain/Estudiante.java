package poo.taller.punto1.domain;

public class Estudiante {
    private String identificacion;
    private String nombre;
    private int semestreActual;
    private char genero;
    private Nota nota;

    public Estudiante(String identificacion, String nombre) {
        this.identificacion = identificacion;
        this.nombre = nombre;
    }

    public Estudiante(String identificacion, String nombre, int semestreActual) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.semestreActual = semestreActual;
    }

    public String getIdentificacion() {

        return identificacion;
    }

    public String getNombre() {

        return nombre;
    }

    public int getSemestreActual() {

        return semestreActual;
    }

    public char getGenero() {

        return genero;
    }

    public Nota getNota() {

        return nota;
    }

    public void setGenero(char genero) {

        this.genero = genero;
    }

    public void setNota(Nota nota) {

        this.nota = nota;
    }
}
