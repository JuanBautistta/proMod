package app;

public class FabricaGomitas extends AbstractFactory{

    @Override
    public Object getDulce(String tipoDulce){
        return getGomita(tipoDulce);
    }

    public Gomita getGomita(String tipoGomita){
        if(tipoGomita == null){
            return null;
        }else if(tipoGomita.replaceAll("\\s","").equalsIgnoreCase("ositosdulces")){
            return new GomitaOsoDulce();
        }else if(tipoGomita.replaceAll("\\s","").equalsIgnoreCase("gusanosacidos")){
            return new GomitaGusanoAcido();
        }else if(tipoGomita.replaceAll("\\s","").equalsIgnoreCase("frutasconchamoy")){
            return new GomitaFrutaChamoy();
        }
        return null;
    }
}