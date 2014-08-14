package br.com.eng3.paises;

public enum Paises {

	CHINA,ARGENTINA,JAPÃO,REINO_UNIDO,ALEMANHA,ESTADOS_UNIDOS,BRASIL;

	public String toString(){
		switch(this){
		case REINO_UNIDO: return "Reino Unido";
		case CHINA:return "China";
		case ARGENTINA :return "Argentina";
		case JAPÃO : return "Japão";
		case ALEMANHA : return "Alemanha";
		case ESTADOS_UNIDOS :return "Alemanha";
		case BRASIL:return "Brasil";

		default: throw new IllegalArgumentException();
		}

	}

}
