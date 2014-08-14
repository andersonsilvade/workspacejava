import org.junit.Assert;
import org.junit.Test;

import br.com.fate.exe1.Poupanca;
import br.com.fatec.exe2.Calculadora;
import br.com.fatec.exe3.Expressoes;


public class Teste {
	
	@SuppressWarnings("deprecation")
	
	@Test
	public void testarEstancia() throws Exception{
		Calculadora cal = new Calculadora();
		}
	
	@Test
	public void testarPoupanca(){
		Poupanca poup = new Poupanca();
	
		
		double valor = 101.0;
		double esperado = 100.61;
		double resultado = Poupanca.calculaRendimento(valor);
		
		Assert.assertEquals(esperado, resultado,1);	
	}

	@Test
	public void testarSoma(){
		
		double a = 1;
		double b = 1;
		double esperado = 2;
		double resultado = Calculadora.somar(a, b);
		Assert.assertEquals(esperado, resultado,1);
		
	}
	
	@Test
    public void testarSubtracao(){
		
		double a = 1;
		double b = 1;
		double esperado = 0;
		double resultado = Calculadora.subtrair(a, b);
		Assert.assertEquals(esperado, resultado,1);
		
		
	}
	
	@Test
	public void testarDivisao() throws Exception{
		
		double a = 1;
		double b = 1;
		double c = 0;
		
		double esperado1 = 1;
		double esperado2 = 0;
		double resultado1 = Calculadora.dividir(a, b);
		double resultado2 = Calculadora.dividir(a, c);
		double resultado3 = Calculadora.dividir(c, b);
		
		Assert.assertEquals(esperado1, resultado1,0.1);
		Assert.assertEquals(esperado2, resultado2,0.1);
		Assert.assertEquals(esperado2, resultado3,0.1);
			
	}
	
	@Test
	public void testarMultiplicacao(){
		double a = 1;
		double b = 2;
		double c = 3.33;
		double d = 0;
		
		double esperado = 2;
		double esperado2 = 3.33;
		double esperado3 = 6.66;
		double esperado4 = 0;
		
		double resultado = Calculadora.multiplicar(a, b);
		double resultado2 = Calculadora.multiplicar(a, c);
		double resultado3 = Calculadora.multiplicar(b, c);
		double resultado4 = Calculadora.multiplicar(a, d);
		double resultado5 =Calculadora.multiplicar(d, b);
		
		Assert.assertEquals(esperado,resultado,0.1 );
		Assert.assertEquals(esperado2,resultado2,0.01);
		Assert.assertEquals(esperado3, resultado3,0.01);
		Assert.assertEquals(esperado4, resultado4,0.01);
		Assert.assertEquals(esperado4, resultado5,0.01);
			
		
	}
	
	@Test
	public void testarExpressoes(){
		
		String string = "1-HOME-SWEET-HOME";
		String string2 = "0-ANDERSON";
		String string3 = "ANDERSON@SILVA";
		String string4 = "abc";
		
		String resultado = Expressoes.testarExpressao(string);
		String resultado2 = Expressoes.testarExpressao(string2);
		String resultado3 = Expressoes.testarExpressao(string3);
		String resultado4 = Expressoes.testarExpressao(string4);
		
		
		String esperado = "1-4663-79338-4663";
		String esperado2 = "0-26337766"; 
		String esperado3 = "26337766745892";
		String esperado4 = "222";
		
		Assert.assertEquals(esperado,resultado);
		Assert.assertEquals(esperado2,resultado2);
		Assert.assertEquals(esperado3,resultado3);
		Assert.assertEquals(esperado4,resultado4);	
	}
	

}
