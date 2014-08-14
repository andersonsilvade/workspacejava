package br.com.testeSoftware.exer2;

import java.util.ArrayList;
import java.util.Scanner;

public class Caverna {

	ArrayList circulo;

	public void addCirculo(Integer tamanho){

		
		circulo = new ArrayList<>();
		for(Integer x = 0 ; x <tamanho;x++){
			circulo.add(x);
		}
	}

	public void removerCirculo(int posicao,int passo ){
       
		int cont = 0;
		int aux = circulo.size();
        int aux2 = 0;
		while(aux!= 1){
			for(int i = posicao;i < circulo.size();i++){
				aux2 = i;
				
				if(!circulo.isEmpty()){
					if(cont  == passo){
						circulo.remove(i);
						cont = 0;
						aux--;
						
					}
					cont++;
					
				}

				}
			if(aux2 == (circulo.size()-1)){
				aux2 = 0;
				posicao  = 0;
			}
		}
		for(int z = 0;z < circulo.size();z++){
			if(!circulo.isEmpty()){
				System.out.println("A restou o elemento da : "+circulo.get(z)+"º posição");
			}
		}

	}
}