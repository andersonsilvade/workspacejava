
public class Facade {

	
		
		BDAcidente todos ;
		BDAcidente pais;
		public Facade(){
		todos = new BDAcidente();
		pais = new BDAcidente();
		}
		
		public void inicializar(){
		
		/*Pedestre*/
		Acidente pedestre = new Acidente(Tipo.PEDESTRE,11805,27.30,6.1,1271,2965,5200,1813,867);
		todos.addAcidente(pedestre);
	
		/*Ciclista*/
		Acidente ciclista = new Acidente(Tipo.CICLISTA,1884,4.40,1.00,143,405,5200,417,281);
		todos.addAcidente(ciclista);
		
		/*Moto*/
		Acidente moto = new Acidente(Tipo.MOTO,14666,33.90,7.6,1320,5392,4436,2249,1527);
		todos.addAcidente(moto);
		
		
		/*Auto */
		Acidente auto = new Acidente(Tipo.AUTO,12429,28.70,6.50,605,2975,4948,2539,1415);
		todos.addAcidente(auto);
        
		
		/*Caminhï¿½o*/
		Acidente caminhao = new Acidente(Tipo.CAMINHAO,1567,3.60,0.80,89,270,544,363,308);
		todos.addAcidente(caminhao);
		
			
		/*Onibus*/
		Acidente onibus = new Acidente(Tipo.ONIBUS,248,0.60,0.1,20,56,97,52, 27);
		todos.addAcidente(onibus);
		
		
		/*Outros*/
		Acidente outros = new Acidente(Tipo.OUTROS,658,1.50,0.3);
		todos.addAcidente(outros);
		}
		
		public void inicializarPais(){
			
			DadosPaises chi = new DadosPaises(Paises.CHINA, 275938,20.5);
			DadosPaises arg = new DadosPaises(Paises.ARGENTINA,5094,12.6);
			DadosPaises ale = new DadosPaises(Paises.ALEMANHA,3830,4.7);
			DadosPaises jpn = new DadosPaises(Paises.JAPÃO,6625,5.2);
			DadosPaises uk = new DadosPaises(Paises.REINO_UNIDO,2278,3.7);
			DadosPaises usa = new DadosPaises(Paises.ESTADOS_UNIDOS,35490,11.4);
			DadosPaises bra = new DadosPaises(Paises.BRASIL, 43077,22.5);
			pais.addPaises(bra);
			pais.addPaises(usa);
			pais.addPaises(uk);
			pais.addPaises(jpn);
			pais.addPaises(ale);
			pais.addPaises(chi);
			pais.addPaises(arg);
			
		}
		public void ordenar(ImpressaoVitimaOrdenado ivo){
			todos.setOrdenado(ivo);
			todos.selecionarOrdem();
			
		}
		public void imprimirVitima(ImpressaoVitima iv){
			todos.setVitima(iv);
			todos.selecionarVitima();
		}
		public void imprimirRegiao(ImprimirVitimaRegiao ivr){
			todos.setRegiao(ivr);
			todos.selecionarRegiao();
		}
		public void compararPais(Comparacao c){
			pais.setComparar(c);
			pais.selecionarPais();
		}
		
				
		
	}


