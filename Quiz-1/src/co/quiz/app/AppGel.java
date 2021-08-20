package co.quiz.app;

import co.quiz.dominio.DispensadorDeGel;

public class AppGel {
    public static void main(String[] args) {
        DispensadorDeGel dispensador = new DispensadorDeGel("Familia", 4);

        dispensador.dispensar(4);

        System.out.println("Cantidad actual " + dispensador.cantidadActual);

        dispensador.llenar();

        System.out.println("Cantidad actual " + dispensador.cantidadActual);
    }
}
