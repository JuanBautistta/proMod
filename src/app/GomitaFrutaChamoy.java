package app;

public class GomitaFrutaChamoy implements Gomita{

    String tipo="";

    @Override
    public void crearGomita(){
        tipo = "Gomita de frutas con chamoy";
    }

    @Override
    public void getTipo(){
        System.out.println(tipo);
    }
}