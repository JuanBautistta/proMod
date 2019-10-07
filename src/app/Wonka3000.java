package app;

public class Wonka3000 {

    public void prepara(){
        seleccionaMolde();
        agregarIngredienteExtra();
    }

    public void seleccionaMolde(){

    }

    public void agregarIngredienteExtra(){
        
    }


    public static AbstractFactory getFactory(String opcion){
        if(opcion.equals("gomita")){
            return new FabricaGomitas();//Wonka
        }else if(opcion.equalsIgnoreCase("chocolate")){
            return new FabricaChocolates();//Wonka
        }
        return null;
    }


}