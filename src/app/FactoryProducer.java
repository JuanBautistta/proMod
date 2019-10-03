package app;

public class FactoryProducer{

    public static AbstractFactory getFactory(String opcion){
        if(opcion.equals("gomita")){
            return new FabricaGomitas();
        }else if(opcion.equalsIgnoreCase("chocolate")){
            return new FabricaChocolates();
        }else if(opcion.equalsIgnoreCase("galleta")){
            return new FabricaGalletas();
        }
        return null;
    }
    
}