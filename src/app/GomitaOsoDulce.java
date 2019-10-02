package app;

public class GomitaOsoDulce implements Gomita{
   
    String tipo = "";

    @Override
    public void crearGomita(){
        tipo = "Gomita de oso dulce";
    }

    @Override
    public void getTipo(){
        System.out.println(tipo);
    }
}