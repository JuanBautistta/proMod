package app;

public class FabricaChocolates extends AbstractFactory{
    @Override
    public Object getDulce(String tipoDulce){
        return getChocolate(tipoDulce);
    }

    public Chocolate getChocolate(String tipoChocolate){
        if(tipoChocolate==null)return null;
        else if(tipoChocolate.replaceAll("\\s","").equalsIgnoreCase("leche")){
            return new ChocolateLeche();
        }else if(tipoChocolate.replaceAll("\\s","").equalsIgnoreCase("oscuro")){
            return new ChocolateOscuro();
        }else if(tipoChocolate.replaceAll("\\s","").equalsIgnoreCase("almendras")){
            return new ChocolateAlmendra();
        }
        return null;
    }
}