package poo.taller.punto2.domain;

import java.util.ArrayList;
import java.util.List;

public class DispensadorMecato {
    private String marca;
    private List<Mecato> productos;

    public boolean sacarUnidad(){
    }

    public DispensadorMecato(String marca) {
        this.marca = marca;
        this.productos= new ArrayList<>();
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setProductos(List<Mecato> productos) {
        this.productos = productos;
    }
}







