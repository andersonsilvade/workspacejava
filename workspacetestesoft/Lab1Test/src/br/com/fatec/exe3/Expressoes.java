package br.com.fatec.exe3;

import java.lang.reflect.Array;

public class Expressoes {
	
	public static String testarExpressao(String n){
		char [] letra = new char[n.length()];
		char letraCo;
		
		StringBuilder expressao = new StringBuilder();
		for(int i = 0;i<n.length();i++){
			letra[i] = n.toUpperCase().charAt(i);
		}
		for(int x = 0;x < letra.length;x++){
			 letraCo = letra[x];
			 if(letraCo == 'A'||letraCo =='B'||letraCo == 'C' ){
				 expressao.append('2');
			 }
			 if(letraCo == 'D'||letraCo =='E'||letraCo == 'F' ){
				 expressao.append('3');
			 }
			 if(letraCo == 'G'||letraCo =='H'||letraCo == 'I' ){
				 expressao.append('4');
			 }
			 if(letraCo == 'J'||letraCo =='K'||letraCo == 'L' ){
				 expressao.append('5');
			 }
			 if(letraCo == 'M'||letraCo =='N'||letraCo == 'O' ){
				 expressao.append('6');
			 }
			 if(letraCo == 'P'||letraCo =='Q'||letraCo == 'R'||letraCo == 'S' ){
				 expressao.append('7');
			 }
			 if(letraCo == 'T'||letraCo =='U'||letraCo == 'V' ){
				 expressao.append('8');
			 }
			 if(letraCo == 'W'||letraCo =='X'||letraCo == 'Y'||letraCo == 'Z' ){
				 expressao.append('9');
			 }
			 if(letraCo == '-' ){
				 expressao.append('-');
			 }
			 if(letraCo == '0' ){
				 expressao.append('0');
			 }
			 if(letraCo == '1' ){
				 expressao.append('1');
			 }

			}
					
		return expressao.toString();
	    
	}
	}
	
	
	


