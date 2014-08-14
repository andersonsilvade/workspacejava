package br.com.fate.exe1;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class Poupanca {
	
	
	
	private static double rendimento = 0;
	
	
	
	
	public static double calculaRendimento(double saldo){
		rendimento =(saldo +(saldo*0.006));
		BigDecimal decimal = new BigDecimal(rendimento).setScale(2, RoundingMode.CEILING);
		rendimento = decimal.doubleValue();
		return rendimento;
	}
	
	
	
	

}
