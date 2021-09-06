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

        private boolean sacarUnidades(String nombreP){
            List<Mecato> product =new ArrayList<>();
            for(Mecato pro1: this.getproductos()){
                if(pro1.getNombre().equals(nombreP)){
                    return true;
                }
            }
            return false;
        }
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setProductos(List<Mecato> productos) {
        this.productos = productos;
    }
}







