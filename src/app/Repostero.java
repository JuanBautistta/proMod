package app;

public class Repostero{
    
    private int id;
    private String nombre;
    private String rfc;

    public Repostero(int id,String nombre,String rfc){
        this.id=id;
        this.nombre=nombre;
        this.rfc=rfc;
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