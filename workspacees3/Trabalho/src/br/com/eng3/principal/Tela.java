package br.com.eng3.principal;

import java.text.DecimalFormat;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import br.com.eng3.paises.Comparacao;
import br.com.eng3.paises.DadosPaises;
import br.com.eng3.paises.Paises;
import br.com.eng3.regiao.ImprimirVitimaRegiao;
import br.com.eng3.tipo.Acidente;
import br.com.eng3.tipo.ImpressaoVitima;
import br.com.eng3.tipo.ImpressaoVitimaOrdenado;
import br.com.eng3.tipo.Tipo;

public class Tela implements Observer{

	private ImpressaoVitima ipv ;
	private Comparacao comp;
	private ImpressaoVitimaOrdenado ivo;
	private ImprimirVitimaRegiao ivr;
	


	//SET	
	public void setIpv(ImpressaoVitima ipv){
		this.ipv = ipv;

	}
	public void setComp(Comparacao comp){
		this.comp = comp;
	}
	public void setIvo(ImpressaoVitimaOrdenado ivo){
		this.ivo = ivo;
	}
	public void setIvr(ImprimirVitimaRegiao ivr){
		this.ivr = ivr;
	}
	//UPDATE
	public void updateAcidente(Acidente acid) {
		ipv.imprimirVitima(acid);
		ivr.imprimirVitimaRegia(acid);
		ivo.imprimirOrdenado(acid);
	}

	public void updatePaises(DadosPaises dados) {
		comp.compararOutroPais(dados);

	}

	public void imprimirAuto(Acidente v){

		Tipo t = Tipo.AUTO;	    
		DecimalFormat formatado = new DecimalFormat("0.00");
		if(v != null){
			if(v.getTipo().equals(t)){
				System.out.println("----------------------------------------------------------------");
				System.out.println("Dados referente ao ano "+v.getAno());
				System.out.println("Tipo da vitima "+v.getTipo());
				System.out.println("Total de mortes "+v.getMorteTotal());
				System.out.println("Paticipação no total  de acidentes "+formatado.format(v.getParticipacaoCategoria())+"%");
				System.out.println("Taxa de óbito por 100 mil habitantes "+formatado.format(v.getTaxaObito()));
				System.out.println("----------------------------------------------------------------");
			}
		}
	}


	public void imprimirPedestre(Acidente v){
		Tipo t = Tipo.PEDESTRE;
		DecimalFormat formatado = new DecimalFormat("0.00");

		if(v != null){
			if(v.getTipo().equals(t)){
				System.out.println("----------------------------------------------------------------");
				System.out.println("Dados referente ao ano "+v.getAno());
				System.out.println("Tipo da vitima "+v.getTipo());
				System.out.println("Total de mortes "+v.getMorteTotal());
				System.out.println("Paticipação no total  de acidentes "+formatado.format(v.getParticipacaoCategoria())+"%");
				System.out.println("Taxa de óbito por 100 mil habitantes "+formatado.format(v.getTaxaObito()));
				System.out.println("----------------------------------------------------------------");
			}
		}

	}
	public void imprimirCaminhao(Acidente v){
		Tipo t = Tipo.CAMINHAO;

		DecimalFormat formatado = new DecimalFormat("0.00");
		if(v != null){
			if(v.getTipo().equals(t)){
				System.out.println("----------------------------------------------------------------");
				System.out.println("Dados referente ao ano "+v.getAno());
				System.out.println("Tipo da vitima "+v.getTipo());
				System.out.println("Total de mortes "+v.getMorteTotal());
				System.out.println("Paticipação no total  de acidentes "+formatado.format(v.getParticipacaoCategoria())+"%");
				System.out.println("Taxa de óbito por 100 mil habitantes "+formatado.format(v.getTaxaObito()));
				System.out.println("----------------------------------------------------------------");
			}
		}
	}
	public void imprimirCiclista(Acidente v){
		Tipo t = Tipo.CICLISTA;
		DecimalFormat formatado = new DecimalFormat("0.00");
		if(v != null){
			if(v.getTipo().equals(t)){
				System.out.println("----------------------------------------------------------------");
				System.out.println("Dados referente ao ano "+v.getAno());
				System.out.println("Tipo da vitima "+v.getTipo());
				System.out.println("Total de mortes "+v.getMorteTotal());
				System.out.println("Paticipação no total  de acidentes "+formatado.format(v.getParticipacaoCategoria())+"%");
				System.out.println("Taxa de óbito por 100 mil habitantes "+formatado.format(v.getTaxaObito()));
				System.out.println("----------------------------------------------------------------");
			}
		}
	}
	public void imprimirMoto(Acidente v){
		Tipo t = Tipo.MOTO;
		DecimalFormat formatado = new DecimalFormat("0.00");
		if(v != null){
			if(v.getTipo().equals(t)){
				System.out.println("----------------------------------------------------------------");
				System.out.println("Dados referente ao ano "+v.getAno());
				System.out.println("Tipo da vitima "+v.getTipo());
				System.out.println("Total de mortes "+v.getMorteTotal());
				System.out.println("Paticipação no total  de acidentes "+formatado.format(v.getParticipacaoCategoria())+"%");
				System.out.println("Taxa de óbito por 100 mil habitantes "+formatado.format(v.getTaxaObito()));
				System.out.println("----------------------------------------------------------------");
			}
		}
	}
	public void imprimirOnibus(Acidente v){
		Tipo t = Tipo.ONIBUS;

		DecimalFormat formatado = new DecimalFormat("0.00");
		if(v != null){
			if(v.getTipo().equals(t)){
				System.out.println("----------------------------------------------------------------");
				System.out.println("Dados referente ao ano "+v.getAno());
				System.out.println("Tipo da vitima "+v.getTipo());
				System.out.println("Total de mortes "+v.getMorteTotal());
				System.out.println("Paticipação no total  de acidentes "+formatado.format(v.getParticipacaoCategoria())+"%");
				System.out.println("Taxa de óbito por 100 mil habitantes "+formatado.format(v.getTaxaObito()));
				System.out.println("----------------------------------------------------------------");
			}
		}
	}

	public void imprimirOutros(Acidente v){
		Tipo t = Tipo.OUTROS;
		DecimalFormat formatado = new DecimalFormat("0.00");
		if(v != null){
			System.out.println("----------------------------------------------------------------");

			if(v.getTipo().equals(t)){
				System.out.println("Dados referente ao ano "+v.getAno());
				System.out.println("Tipo da vitima "+v.getTipo());
				System.out.println("Total de mortes "+v.getMorteTotal());
				System.out.println("Paticipação no total  de acidentes "+formatado.format(v.getParticipacaoCategoria())+"%");
				System.out.println("Taxa de óbito por 100 mil habitantes "+formatado.format(v.getTaxaObito()));
				System.out.println("----------------------------------------------------------------");
			}

		}
	}

	public void imprimirAlemanha(DadosPaises dp){

		DecimalFormat formato = new DecimalFormat("0.00");
		
		if(dp.getPais().equals(Paises.ALEMANHA)){
			System.out.println("----------------------------------------------------------------");
			System.out.println("A "+dp.getPais()+" no ano de 2011 teve um total de "+dp.getTotalMortos()+ " mil mortos em acidente de trânsito enquanto "
					+Paises.BRASIL+" teve um total de "+DadosPaises.getBrasilTotalMortos()+" mil" );
			System.out.println("Porém a taxa/100mil habitantes da "+dp.getPais()+" foi de "+dp.getTaxaObito());
			System.out.println("Enquanto a do "+Paises.BRASIL+" foi de "+DadosPaises.getBrasilTaxaObito()+" ou seja "+formato.format((((DadosPaises.getBrasilTaxaObito()/dp.getTaxaObito())*100)-100))+
					"% mais mortos, em taxa/100mil habitantes, que o  "+dp.getPais());
			System.out.println("----------------------------------------------------------------");

		}
	}
	public void imprimirArgentina(DadosPaises dp){
		DecimalFormat formato = new DecimalFormat("0.00");
		
		if(dp.getPais().equals(Paises.ARGENTINA)){
			System.out.println("----------------------------------------------------------------");
			System.out.println("A "+dp.getPais()+" no ano de 2011 teve um total de "+dp.getTotalMortos()+ " mil mortos em acidente de trânsito enquanto "
					+Paises.BRASIL+" teve um total de "+DadosPaises.getBrasilTotalMortos()+" mil" );
			System.out.println("Porém a taxa/100mil habitantes da "+dp.getPais()+" foi de "+dp.getTaxaObito());
			System.out.println("Enquanto a do "+Paises.BRASIL+" foi de "+DadosPaises.getBrasilTaxaObito()+" ou seja "+formato.format((((DadosPaises.getBrasilTaxaObito()/dp.getTaxaObito())*100)-100))+
					"% mais mortos, em taxa/100mil habitantes, que o  "+dp.getPais());
			System.out.println("----------------------------------------------------------------");
		}
	}

	public void imprimirChina(DadosPaises dp){
		DecimalFormat formato = new DecimalFormat("0.00");
		
		if(dp.getPais().equals(Paises.CHINA)){
			System.out.println("----------------------------------------------------------------");
			System.out.println("A "+dp.getPais()+" no ano de 2011 teve um total de "+dp.getTotalMortos()+ " mil mortos em acidente de trânsito enquanto "
					+Paises.BRASIL+" teve um total de "+DadosPaises.getBrasilTotalMortos()+" mil" );
			System.out.println("Porém a taxa/100mil habitantes da "+dp.getPais()+" foi de "+dp.getTaxaObito());
			System.out.println("Enquanto a do "+Paises.BRASIL+" foi de "+DadosPaises.getBrasilTaxaObito()+" ou seja "+formato.format((((DadosPaises.getBrasilTaxaObito()/dp.getTaxaObito())*100)-100))+
					"% mais mortos, em taxa/100mil habitantes, que o  "+dp.getPais());
			System.out.println("----------------------------------------------------------------");

		}
	}

	public void imprimirEstadosUnidos(DadosPaises dp){
		DecimalFormat formato = new DecimalFormat("0.00");
		
		if(dp.getPais().equals(Paises.ESTADOS_UNIDOS)){
			System.out.println("----------------------------------------------------------------");
			System.out.println("O "+dp.getPais()+" no ano de 2011 teve um total de "+dp.getTotalMortos()+ " mil mortos em acidente de trânsito enquanto "
					+Paises.BRASIL+" teve um total de "+DadosPaises.getBrasilTotalMortos()+" mil" );
			System.out.println("Porém a taxa/100mil habitantes da "+dp.getPais()+" foi de "+dp.getTaxaObito());
			System.out.println("Enquanto a do "+Paises.BRASIL+" foi de "+DadosPaises.getBrasilTaxaObito()+" ou seja "+formato.format((((DadosPaises.getBrasilTaxaObito()/dp.getTaxaObito())*100)-100))+
					"% mais mortos, em taxa/100mil habitantes, que o  "+dp.getPais());
			System.out.println("----------------------------------------------------------------");

		}
	}

	public void imprimirJapao(DadosPaises dp){
		DecimalFormat formato = new DecimalFormat("0.00");
		
		if(dp.getPais().equals(Paises.JAPÃO)){
			System.out.println("----------------------------------------------------------------");
			System.out.println("O "+dp.getPais()+" no ano de 2011 teve um total de "+dp.getTotalMortos()+ " mil mortos em acidente de trânsito enquanto "
					+Paises.BRASIL+" teve um total de "+DadosPaises.getBrasilTotalMortos()+" mil" );
			System.out.println("Porém a taxa/100mil habitantes da "+dp.getPais()+" foi de "+dp.getTaxaObito());
			System.out.println("Enquanto a do "+Paises.BRASIL+" foi de "+DadosPaises.getBrasilTaxaObito()+" ou seja "+formato.format((((DadosPaises.getBrasilTaxaObito()/dp.getTaxaObito())*100)-100))+
					"% mais mortos, em taxa/100mil habitantes, que o  "+dp.getPais());
			System.out.println("----------------------------------------------------------------");

		}

	}

	public void imprimirReinoUnido(DadosPaises dp){

		DecimalFormat formato = new DecimalFormat("0.00");
		
		if(dp.getPais().equals(Paises.REINO_UNIDO)){
			System.out.println("----------------------------------------------------------------");
			System.out.println("O "+dp.getPais()+" no ano de 2011 teve um total de "+dp.getTotalMortos()+ " mil mortos em acidente de trânsito enquanto "
					+Paises.BRASIL+" teve um total de "+DadosPaises.getBrasilTotalMortos()+" mil" );
			System.out.println("Porém a taxa/100mil habitantes da "+dp.getPais()+" foi de "+dp.getTaxaObito());
			System.out.println("Enquanto a do "+Paises.BRASIL+" foi de "+DadosPaises.getBrasilTaxaObito()+" ou seja "+formato.format((((DadosPaises.getBrasilTaxaObito()/dp.getTaxaObito())*100)-100))+
					"% mais mortos, em taxa/100mil habitantes, que o  "+dp.getPais());
			System.out.println("----------------------------------------------------------------");

		}


	}
	public void imprimirCentroOeste(int total){	


		System.out.println("----------------------------------------------------------------");
		System.out.println("Total de mortos em acidentes de transito na região Centro-Oeste: "+total);
		System.out.println("----------------------------------------------------------------");

	}

	public void imprimirNordeste(int total){	


		System.out.println("----------------------------------------------------------------");
		System.out.println("Total de mortos em acidentes de transito na região Nordeste: "+total);
		System.out.println("----------------------------------------------------------------");

	}

	public void imprimirNorte(int total){


		System.out.println("----------------------------------------------------------------");  
		System.out.println("Total de mortos em acidentes de transito na região Norte: "+total);
		System.out.println("----------------------------------------------------------------"); 

	}
	public void imprimirSudeste(int total){	

		System.out.println("----------------------------------------------------------------");	
		System.out.println("Total de mortos em acidentes de transito na região Sudeste: "+total);
		System.out.println("----------------------------------------------------------------");

	}
	public void imprimirSul(int total){	


		System.out.println("----------------------------------------------------------------");
		System.out.println("Total de mortos em acidentes de transito na região Sul: "+total);
		System.out.println("----------------------------------------------------------------");

	}

	public void imprimirCrescente(List<Acidente> lista){


		Collections.sort(lista);

		int x = 1; 
		System.out.println("Pos|Tipo        |Quantidade de acidentados");
		System.out.println("------------------------------------------");
		for(Object i : lista){
			Acidente acidente = (Acidente) i;
			if(acidente.getTipo().toString().length()<5){
				System.out.println(x+"º |"+acidente.getTipo()+ "\t|"+ acidente.getMorteTotal());
			}else{
				System.out.println(x+"º |"+acidente.getTipo()+ "\t|"+ acidente.getMorteTotal());
			}
			x++;
		}
		System.out.println("");
	}

	public void imprimirDecrescente(List<Acidente> lista){


		Collections.sort(lista);
		Collections.reverse(lista);
		int x = 1; 
		System.out.println("Pos|Tipo        |Quantidade de acidentados");
		System.out.println("------------------------------------------");
		for(Object i : lista){
			Acidente acidente = (Acidente) i;
			if(acidente.getTipo().toString().length()<5){
				System.out.println(x+"º |"+acidente.getTipo()+ "\t|"+ acidente.getMorteTotal());
			}else{
				System.out.println(x+"º |"+acidente.getTipo()+ "\t|"+ acidente.getMorteTotal());
			}
			x++;

		}
		System.out.println("");
	}
}
