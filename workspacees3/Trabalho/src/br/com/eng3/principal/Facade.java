
package br.com.eng3.principal;

import br.com.eng3.paises.Alemanha;
import br.com.eng3.paises.Argentina;
import br.com.eng3.paises.China;
import br.com.eng3.paises.Comparacao;
import br.com.eng3.paises.DadosPaises;
import br.com.eng3.paises.EstadosUnidos;
import br.com.eng3.paises.Japao;
import br.com.eng3.paises.Paises;
import br.com.eng3.paises.ReinoUnido;
import br.com.eng3.regiao.CentroOeste;
import br.com.eng3.regiao.ImprimirVitimaRegiao;
import br.com.eng3.regiao.Nordeste;
import br.com.eng3.regiao.Norte;
import br.com.eng3.regiao.Sudeste;
import br.com.eng3.regiao.Sul;
import br.com.eng3.tipo.Acidente;
import br.com.eng3.tipo.Auto;
import br.com.eng3.tipo.Caminhao;
import br.com.eng3.tipo.Ciclista;
import br.com.eng3.tipo.ImpressaoOrdemCrescente;
import br.com.eng3.tipo.ImpressaoOrdemDecrescente;
import br.com.eng3.tipo.ImpressaoVitima;
import br.com.eng3.tipo.ImpressaoVitimaOrdenado;
import br.com.eng3.tipo.Moto;
import br.com.eng3.tipo.Onibus;
import br.com.eng3.tipo.Outros;
import br.com.eng3.tipo.Pedestre;
import br.com.eng3.tipo.Tipo;

public class Facade {

	private BDAcidente paises;
	private BDAcidente bda ;
	private Tela  tela;


	//Tipo Acidente
	private ImpressaoVitima iv;
	//Pais Acidente
	private Comparacao com;
	//Região Acidente
	private ImprimirVitimaRegiao ivr;
	//ordenar
	private ImpressaoVitimaOrdenado ivo;

	public void criarMVCAcidente(){

		bda = new BDAcidente();
		tela = new Tela();

		iv = new Caminhao(bda, tela); //conexao controlle-> model e controller->tela
		tela.setIpv(iv); //conexao tela->controller

		ivr = new Nordeste(bda, tela);
		tela.setIvr(ivr);


		ivo = new ImpressaoOrdemDecrescente(bda, tela);
		tela.setIvo(ivo);
		bda.registrarObservers(tela); //conexao model->tela


	}
	public void criarMVCPais(){

		paises = new BDAcidente();
		tela = new Tela();
		com = new Alemanha(paises, tela);
		tela.setComp(com);
		paises.registrarObservers(tela);

	}



	public void inicializar(){

		/*Auto ok*/
		Acidente acidAuto = new Acidente(Tipo.AUTO,12429,28.70,6.50,605,2975,4948,2539,1415);
		bda.addAcidente(acidAuto);


		/*Pedestre ok*/
		Acidente acidPedestre = new Acidente(Tipo.PEDESTRE,11805,27.30,6.1,1271,2965,5200,1813,867);
		bda.addAcidente(acidPedestre);

		/*Ciclista ok*/
		Acidente acidCiclista = new Acidente(Tipo.CICLISTA,1884,4.40,1.00,143,405,5200,417,281);
		bda.addAcidente(acidCiclista);

		/*Moto ok*/
		Acidente acidMoto = new Acidente(Tipo.MOTO,14666,33.90,7.6,1320,5392,4436,2249,1527);
		bda.addAcidente(acidMoto);

		/*Caminhï¿½o ok*/
		Acidente acidCaminhao = new Acidente(Tipo.CAMINHAO,1567,3.60,0.80,89,270,544,363,308);
		bda.addAcidente(acidCaminhao);

		/*Onibus*/
		Acidente acidOnibus = new Acidente(Tipo.ONIBUS,248,0.60,0.1,20,56,97,52, 27);
		bda.addAcidente(acidOnibus);

		/*Outros*/
		Acidente acidOutros = new Acidente(Tipo.OUTROS,658,1.50,0.3);
		bda.addAcidente(acidOutros);

	}

	public void inicializarPais(){

		DadosPaises chi = new DadosPaises(Paises.CHINA, 275938,20.5);
		DadosPaises arg = new DadosPaises(Paises.ARGENTINA,5094,12.6);
		DadosPaises ale = new DadosPaises(Paises.ALEMANHA,3830,4.7);
		DadosPaises jpn = new DadosPaises(Paises.JAPÃO,6625,5.2);
		DadosPaises uk = new DadosPaises(Paises.REINO_UNIDO,2278,3.7);
		DadosPaises usa = new DadosPaises(Paises.ESTADOS_UNIDOS,35490,11.4);

		paises.addPaises(usa);
		paises.addPaises(uk);
		paises.addPaises(jpn);
		paises.addPaises(ale);
		paises.addPaises(chi);
		paises.addPaises(arg);

	}
}


