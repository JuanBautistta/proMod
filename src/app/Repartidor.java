package app;

public class Repartidor{
    
    private int id;
    private String rfc;
    private String nombre;

    public Repartidor(int id,String rfc,String nombre){
        this.id = id;
        this.rfc=rfc;
        this.nombre=nombre;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param rfc the rfc to set
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the rfc
     */
    public String getRfc() {
        return rfc;
    }
}