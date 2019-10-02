package app;

public class GalletaSalada implements Galleta{

    String tipo="";

    @Override
    public void crearGalleta(){
        tipo = "Galleta salada";
    }

    @Override
    public void getTipo(){
        System.out.println(tipo);
    }

}