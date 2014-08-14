package operacoes;



public class Operacoes {
	
	
	
	public  Double multuply(Double valor1,Double valor2){
		valor1 = valor1 == null ? 1 : valor1;
		valor2 = valor2 == null? 1 : valor2;
		
		return valor1*valor2;
	}
	
	public  Double divide(Double valor1,Double valor2){
		valor1 = valor1 == null ? 1 : valor1;
		valor2 = valor2 == null? 1 : valor2;
		
		return  (valor1/valor2);
			
	}
	
	public Double calcAreaCircle(Double raio){
		raio = raio == null ? 0 : raio;
		
		return  (Math.PI*Math.pow(raio,2));
	}
}
