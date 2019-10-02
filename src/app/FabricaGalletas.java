package app;

public class FabricaGalletas extends AbstractFactory{

    public Object getDulce(String tipoDulce){
        return getGalleta(tipoDulce);
    }

    public Galleta getGalleta(String tipoGalleta){
        if(tipoGalleta == null)return null;
        else if(tipoGalleta.replaceAll("\\s","").equalsIgnoreCase("salada")){
            return new GalletaSalada();
        }else if(tipoGalleta.replaceAll("\\s","").equalsIgnoreCase("mermelada")){
            return new GalletaMermelada();
        }else if(tipoGalleta.replaceAll("\\s","").equalsIgnoreCase("chispas")){
            return new GalletaChispa();
        }
        return null;
    }
}