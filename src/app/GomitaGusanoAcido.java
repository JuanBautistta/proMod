package app;

public class GomitaGusanoAcido implements Gomita{
    
    String tipo = "";

    @Override 
    public void crearGomita(){
        tipo="Gomita gusano acido";
    }

    @Override
    public void getTipo(){
        System.out.println(tipo);
    }
}