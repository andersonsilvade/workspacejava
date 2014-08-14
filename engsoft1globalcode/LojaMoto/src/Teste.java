import java.util.List;


public class Teste {

	public static void main(String[] args) {
		
		Estoque moto = new Estoque();
		
		moto.add(new Moto("CG","Preta",new Caracteristica(125,2012,5000)));
		moto.add(new Moto("CB300","Vermelha",new Caracteristica(300,2013,0)));
		moto.add(new Moto("Tornado","Preta",new Caracteristica(250,2012,10000)));
		moto.add(new Moto("CG","Vermelha",new Caracteristica(150,2013,0)));
		
		List <Moto> venda = moto.buscaMoto("CG");
		 if(!venda.isEmpty()){
			 for(Object i : venda){
					Moto loc = (Moto)i;
					loc.imprimir();
					System.out.println("++++++++++++++++++++++++++++++++++");
		 }
		
		
		 }
	}

	}
	
