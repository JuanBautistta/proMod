package app;

public class Sucursal{
    
    private int id;
    private String direccion;
    private Inventario inventario;
    private Repostero repostero;

    public Sucursal(int id,String direccion,Inventario inventario,Repostero repostero){
        this.id=id;
        this.direccion=direccion;
        this.inventario=inventario;
        this.repostero=repostero;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @param inventario the inventario to set
     */
    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    /**
     * @param repostero the repostero to set
     */
    public void setRepostero(Repostero repostero) {
        this.repostero = repostero;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @return the inventario
     */
    public Inventario getInventario() {
        return inventario;
    }

    /**
     * @return the repostero
     */
    public Repostero getRepostero() {
        return repostero;
    }
}