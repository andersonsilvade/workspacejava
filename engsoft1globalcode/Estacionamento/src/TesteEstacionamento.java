import java.util.LinkedList;
import java.util.List;
public class TesteEstacionamento {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estacionamento estacionado = new Estacionamento();
		
		
		estacionado.addCarro(new Carro("QVD - 4354","A-11",new Espec("Fiat","Uno","Vermelho")));
		estacionado.addCarro(new Carro("DVQ - 5787","A-12",new Espec("Fiat","Palio","Preto")));
		estacionado.addCarro(new Carro("XYZ - 0001","B-02",new Espec("Ford","Ka","Azul")));
		
		Carro encontrado = estacionado.buscarCarroPlaca("QVD - 4354");
		Carro encontrado1 =estacionado.buscarCarroPlaca("QVD - 4355");
		List <Carro> localizado = estacionado.buscarCarroEspec(new Espec("Fiat","Palio","Preto"));
		List<Carro>localizado1 = estacionado.buscarCarroEspec(new Espec("GM","Palio","Preto"));
		List<Carro>localizado2 = estacionado.buscarCarroEspec(new Espec("GM","Onix","Preto"));
		List<Carro>localizado3 = estacionado.buscarCarroEspec(new Espec("GM","Onix","Verde"));
		List<Carro>localizado4 = estacionado.buscarCarroEspec(new Espec("Fiat","Onix","Preto"));
		if(encontrado!= null){
			encontrado.imprimir();
			System.out.println("==============================");
			}else{
				System.out.println("Carro não localizado!!");
				
			}
			
		
	if(encontrado1!= null){
		encontrado1.imprimir();
		}else{
			System.out.println("Carro não localizado!!");
			System.out.println("==============================");
		}
		
	
	if(!localizado.isEmpty()){
		for(Object i : localizado){
			Carro loc = (Carro)i;
			loc.imprimir();
			System.out.println("==============================");
		}
	}else{
		System.out.println("Carro não localizado!!!");
	}
	if(!localizado1.isEmpty()){
		for(Object i : localizado1){
			Carro loc = (Carro)i;
			loc.imprimir();
		}
	}else{
		System.out.println("Carro não localizado!!!");
		System.out.println("==============================");
	}
	
	if(!localizado2.isEmpty()){
		for(Object i : localizado2){
			Carro loc = (Carro)i;
			loc.imprimir();
		}
	}else{
		System.out.println("Carro não localizado!!!");
		System.out.println("==============================");
	}
	if(!localizado3.isEmpty()){
		for(Object i : localizado3){
			Carro loc = (Carro)i;
			loc.imprimir();
		}
	}else{
		System.out.println("Carro não localizado!!!");
		System.out.println("==============================");
	}
	
	if(!localizado4.isEmpty()){
		for(Object i : localizado4){
			Carro loc = (Carro)i;
			loc.imprimir();
		}
	}else{
		System.out.println("Carro não localizado!!!");
		System.out.println("==============================");
	}
	}
	
	}

