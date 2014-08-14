package operacoesTeste;

import operacoes.Operacoes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class OperacoesTest {
	
	private Operacoes d;
	@Before
	public void setUp(){
		d = new Operacoes();
	}
 
	@Test
	public void testDivide() {
		
		Double esperado = 1.0;
		Double resultado = d.divide(1.0,1.0);
		Assert.assertEquals(esperado,resultado);
		
	}
	
	@Test
	public void testCalcAreaCircle() {
		
		
		Double esperado2 = 113.09733552923255;
		Double resultado2 = d.calcAreaCircle(6.0);
		Assert.assertEquals(esperado2,resultado2);
		
	}

	@Test
	public void testMultuply() {
		
		Double esperado3 = 2.0;
		Double resultado3 = d.multuply(1.0,2.0);
		Assert.assertEquals(esperado3,resultado3);
		
	}

}
