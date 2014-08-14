package br.com.fatec.exe2;

public class Conversao {
	
	public static int converterRomano(String roma){
		int decimal = 0;
		String nRomano = roma.toUpperCase();
		for(int i = 0; i < nRomano.length();i++){
			char convert = nRomano.charAt(i);
			switch(convert){
			case 'M':
				decimal+=1000;
				break;
			case 'D':
				decimal+=500;
				break;
			case 'C':
				decimal+=100;
				break;
			case 'L':
				decimal+=50;
				break;
			case 'X':
				decimal+=10;
				break;
			case 'V':
				decimal+=5;
				break;
			case 'I':
				decimal+=1;
				break;
			
			}
		}
		if(nRomano.contains("IV")) decimal-=2;
		if(nRomano.contains("IX")) decimal-=2;
		if(nRomano.contains("XL")) decimal+=20;
		if(nRomano.contains("XC")) decimal-=20;
		if(nRomano.contains("CD")) decimal-=200;
		if(nRomano.contains("CM")) decimal-=200;
		
		return decimal;
	}
	public static StringBuilder converterDecimal(int num){
		StringBuilder romano = new StringBuilder();
		int numero = num;
		
		while(numero >= 1000){
			romano.append("M");
			numero = numero - 1000;
		}
		while(numero >= 900){
			romano.append("CM");
			numero = numero - 900;
		}
		while(numero >= 800){
			romano.append("DCCC");
			numero = numero - 800;
		}
		while(numero >= 700){
			romano.append("DCC");
			numero = numero - 700;
		}
		while(numero >= 600){
			romano.append("DC");
			numero = numero - 600;
		}
		while(numero >= 500){
			romano.append("D");
			numero = numero - 500;
		}
		while(numero >= 400){
			romano.append("CD");
			numero = numero - 400;
		}
		while(numero >= 300){
			romano.append("CCC");
			numero = numero - 300;
		}
		while(numero >= 200){
			romano.append("CC");
			numero = numero - 200;
		}
		while(numero >= 100){
			romano.append("C");
			numero = numero - 100;
		}
		while(numero >= 90){
			romano.append("XC");
			numero = numero - 90;
		}
		while(numero >= 80){
			romano.append("LXXX");
			numero = numero - 80;
		}
		while(numero >= 70){
			romano.append("LXX");
			numero = numero - 70;
		}
		while(numero >= 60){
			romano.append("LX");
			numero = numero - 60;
		}
		while(numero >= 50){
			romano.append("L");
			numero = numero - 50;
		}
		while(numero >= 40){
			romano.append("XL");
			numero = numero - 40;
		}
		while(numero >= 30){
			romano.append("XXX");
			numero = numero - 30;
		}
		while(numero >= 20){
			romano.append("XX");
			numero = numero - 20;
		}
		while(numero >= 10){
			romano.append("X");
			numero = numero - 10;
		}
		while(numero >= 9){
			romano.append("IX");
			numero = numero - 9;
		}
		while(numero >= 8){
			romano.append("VIII");
			numero = numero - 8;
		}
		while(numero >= 7){
			romano.append("VII");
			numero = numero - 7;
		}
		while(numero >= 6){
			romano.append("VI");
			numero = numero - 6;
		}
		while(numero >= 5){
			romano.append("V");
			numero = numero - 5;
		}
		while(numero >= 4){
			romano.append("IV");
			numero = numero - 4;
		}
		while(numero >= 3){
			romano.append("III");
			numero = numero - 3;
		}
		while(numero >= 2){
			romano.append("II");
			numero = numero - 2;
		}
		while(numero >= 1){
			romano.append("I");
			numero = numero - 1;
		}
		return romano;
		
		}
		
	}


