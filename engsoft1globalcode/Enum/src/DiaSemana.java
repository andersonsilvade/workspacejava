
public enum DiaSemana {
	
	
	SEGUNDA(0),TERÇA(1),QUARTA(2),QUINTA(3),SEXTA(4),SABADO(5),DOMINGO(6);
	
	private DiaSemana(int num){
		this.num = num;
		
	}
	private int num;
	
	public int getNum(){
		return num;
	}

}
