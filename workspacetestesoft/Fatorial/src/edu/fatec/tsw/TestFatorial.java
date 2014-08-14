package edu.fatec.tsw;

import junit.framework.Assert;

import org.junit.Test;

public class TestFatorial {
	
	
	
	@Test
	public void validandoFatorial() throws InvalidNumberException{
	
			Fatorial tFat = new Fatorial();
		
		Assert.assertEquals(1, tFat.fatorial(0));
		Assert.assertEquals(1, tFat.fatorial(1));
		Assert.assertEquals(0,tFat.fatorial(-1));
		Assert.assertEquals(2,2);
		Assert.assertEquals(120,tFat.fatorial(5));
		Assert.assertEquals(null,null);
				
}
}
