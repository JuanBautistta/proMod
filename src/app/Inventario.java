package app;

import java.util.Collection;

public class Inventario{
    
    private Collection<Ingrediente> inventario;

    public Inventario(Collection<Ingrediente> inventario){
        this.inventario = inventario;
    }

    /**
     * @param inventario the inventario to set
     */
    public void setInventario(Collection<Ingrediente> inventario) {
        this.inventario = inventario;
    }

    /**
     * @return the inventario
     */
    public Collection<Ingrediente> getInventario() {
        return inventario;
    }

}