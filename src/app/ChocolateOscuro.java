package app;

public class ChocolateOscuro implements Chocolate{

    String tipo="";

    @Override
    public void crearChocolate(){
        tipo="Chocolate oscuro";
    }

    @Override
    public void getTipo(){
        System.out.println(tipo);
    }
}