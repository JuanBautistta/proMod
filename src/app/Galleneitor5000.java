package app;

public class Galleneitor5000{

    public static AbstractFactory getFactory(String opcion){
        if(opcion.equalsIgnoreCase("galleta")){
            return new FabricaGalletas();//Galleneitor
        }
        return null;
    }


}