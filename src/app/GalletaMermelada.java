package app;

public class GalletaMermelada implements Galleta{

    String tipo="";

    @Override
    public void crearGalleta(){
        tipo = "Galleta con mermelada";
    }

    @Override
    public void getTipo(){
        System.out.println(tipo);
    }

}