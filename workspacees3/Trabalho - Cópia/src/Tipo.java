
public enum Tipo {
	
	PEDESTRE,CICLISTA,MOTO,AUTO,CAMINHAO,ONIBUS,OUTROS;
	public String toString(){
        switch(this){
        case PEDESTRE :return "Pedestre";
        case CICLISTA : return "Ciclista";
        case MOTO : return "Moto";
        case AUTO : return "Automóvel";
        case CAMINHAO : return "Caminhão";
        case ONIBUS :  return "Onibus";
        case OUTROS:return "Outros";
        default: throw new IllegalArgumentException();
        }

}
}
