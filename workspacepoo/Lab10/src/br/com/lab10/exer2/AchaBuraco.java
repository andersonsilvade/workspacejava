package br.com.lab10.exer2;

public class AchaBuraco {
	
	
	public void achaBuraco(String texto){
		
		int contaBuraco = 0;
		
		for(int i = 0 ; i < texto.length();i++){
			char b = texto.toUpperCase().charAt(i);
			if(b == 'A'||b == 'D' || b == 'O'||b == 'P'||b=='Q')contaBuraco++;
			if(b == 'B')contaBuraco = contaBuraco + 2;
						
		}
		
		System.out.println("neste texto temos um total de "+contaBuraco+" buracos");
		
	}
	

}
