package app;

public class GalletaChispa implements Galleta{

    String tipo="";

    @Override
    public void crearGalleta(){
        tipo = "Galleta con chispas";
    }

    @Override
    public void getTipo(){
        System.out.println(tipo);
    }
}