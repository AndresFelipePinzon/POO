package poo.taller.punto1.domain;

import java.util.List;

public class Nota {
    private double notaParcial;
    private double notaFinal;
    private List<Double> notasSeguimiento;
    private Asignatura materia;

    public Nota(Asignatura materia) {

        this.materia = materia;
    }

    private double calcularSeguimiento() {
        double sumaNotas = 0;

        for (Double nota: this.notasSeguimiento) {
            sumaNotas += nota;
        }

        return sumaNotas / this.notasSeguimiento.size();
    }

    public double calcularDefinitiva() {
        return (this.notaParcial * 0.3) + (this.notaFinal * 0.3) + (calcularSeguimiento() * 0.4);
    }

    public double getNotaParcial() {

        return notaParcial;
    }

    public double getNotaFinal() {

        return notaFinal;
    }

    public List<Double> getNotasSeguimiento() {

        return notasSeguimiento;
    }

    public Asignatura getMateria() {

        return materia;
    }

    public void setNotaParcial(double notaParcial) {

        this.notaParcial = notaParcial;
    }

    public void setNotaFinal(double notaFinal) {

        this.notaFinal = notaFinal;
    }

    public void setNotasSeguimiento(List<Double> notasSeguimiento) {

        this.notasSeguimiento = notasSeguimiento;
    }
}
