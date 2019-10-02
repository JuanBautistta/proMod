package app;

public class ChocolateAlmendra implements Chocolate{

    String tipo="";

    @Override
    public void crearChocolate(){
        tipo="Chocolate con almendras";
    }

    @Override
    public void getTipo(){
        System.out.println(tipo);
    }
}