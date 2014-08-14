package br.com.lab10.exer3;



public class Diamante {
	
	
	public static void diamante(String letra){
		
		String [] alfabeto = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","X","Z"};
	    
		int linha = 1;
		int espacoEsquerdo = 23;
		int aux = 0;
		if(linha == 1){
			for(int i = 0;i < espacoEsquerdo;i++){
				System.out.print(" ");
			}
			System.out.println(alfabeto[0]);
			linha++;
			espacoEsquerdo--;
		}
		
		if(linha > 1){
			for(int x = 1 ; x <alfabeto.length;x++){
				for(int z = 0;z < espacoEsquerdo;z++){
					System.out.print(" ");
				}
				System.out.print(alfabeto[x]);
				
				for(int y = 1;y < linha;y++){
					System.out.print(" ");
				}
				
				System.out.println(alfabeto[x]);
				
				espacoEsquerdo--;
				aux = x;
				if(alfabeto[x].equalsIgnoreCase(letra))break;
				linha= linha+2;
			}
			
		}
		if(linha > 1){
			espacoEsquerdo++;
			for(int f = (aux - 1);f >0;f--){
				for(int r = 0 ;r <= (espacoEsquerdo);r++){
				System.out.print(" ");
			      }
			System.out.print(alfabeto[f]);
			linha = linha - 2;
			for(int g = 1 ;g < linha ;g++){
				System.out.print(" ");
			}
			
			System.out.println(alfabeto[f]);
			espacoEsquerdo++;
			
			if(alfabeto[f].equals("B"))break;
		
			}
		
		}
		for(int h = 0 ;h <= espacoEsquerdo;h++){
			System.out.print(" ");
		}
			System.out.println(alfabeto[0]);
		
	}
}
	


