package app;

public class ChocolateLeche implements Chocolate{
    
    String tipo="";

    @Override
    public void crearChocolate(){
        tipo="Chocolate de leche";
    }

    @Override
    public void getTipo(){
        System.out.println(tipo);
    }
}