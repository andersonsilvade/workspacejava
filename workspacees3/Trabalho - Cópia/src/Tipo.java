
public enum Tipo {
	
	PEDESTRE,CICLISTA,MOTO,AUTO,CAMINHAO,ONIBUS,OUTROS;
	public String toString(){
        switch(this){
        case PEDESTRE :return "Pedestre";
        case CICLISTA : return "Ciclista";
        case MOTO : return "Moto";
        case AUTO : return "Autom�vel";
        case CAMINHAO : return "Caminh�o";
        case ONIBUS :  return "Onibus";
        case OUTROS:return "Outros";
        default: throw new IllegalArgumentException();
        }

}
}
