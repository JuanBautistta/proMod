package app;

public class FactoryProducer{

    public static AbstractFactory getFactory(String opcion){
        if(opcion.equals("gomita")){
            return new FabricaGomitas();//Wonka
        }else if(opcion.equalsIgnoreCase("chocolate")){
            return new FabricaChocolates();//Wonka
        }else if(opcion.equalsIgnoreCase("galleta")){
            return new FabricaGalletas();//Galleneitor
        }
        return null;
    }

}