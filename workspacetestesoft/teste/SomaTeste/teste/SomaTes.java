package teste;

import org.junit.Assert;
import org.junit.Test;



public class SomaTes {
	@Test
	public void testValidarSoma(){
		Soma operador = new Soma();
		Integer resultado = (int) operador.somar(-2, 5);
		
		Assert.assertEquals(3, resultado.intValue());
		
	}
	

}
