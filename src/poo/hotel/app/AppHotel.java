package poo.hotel.app;

import poo.hotel.dominio.Habitacion;
import poo.hotel.dominio.Hotel;

import java.util.Arrays;

public class AppHotel {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Hotel Caribe", "Cartagena");

        Habitacion habitacion1 = new Habitacion(1001, 10, 40);
        Habitacion habitacion2 = new Habitacion(1002, 10, 40);
        Habitacion habitacion3 = new Habitacion(1003, 10, 40);
        Habitacion habitacion4 = new Habitacion(2001, 20, 40);

        hotel.getHabitaciones().add(habitacion1);
        hotel.getHabitaciones().add(habitacion2);
        hotel.getHabitaciones().add(habitacion3);
        hotel.getHabitaciones().add(habitacion4);
//        hotel.setHabitaciones(Arrays.asList(habitacion1, habitacion2, habitacion3, habitacion4));

        // For each funcional
        hotel.getHabitaciones().forEach(ha -> {
            System.out.println("Numero de la habitación " + ha.getNumero() + " y piso "  + ha.getPiso() + ", tamaño: " + ha.getTamano());
        });

        hotel.getHabitaciones().remove(2);
        hotel.getHabitaciones().remove(habitacion4);

        hotel.getHabitaciones().forEach(ha -> {
            System.out.println("Numero de la habitación " + ha.getNumero() + " y piso "  + ha.getPiso() + ", tamaño: " + ha.getTamano());
        });

//        // For viejo
//        for(int i = 0; i < hotel.getHabitaciones().size(); i++) {
//            Habitacion h = hotel.getHabitaciones().get(i);
//            System.out.println("Numero de la habitación: " + h.getNumero());
//        }
//
//        // For each
//        for (Habitacion habi: hotel.getHabitaciones()) {
//            System.out.println("Numero de la habitación " + habi.getNumero() + " y piso "  + habi.getPiso());
//        }
    }
}
