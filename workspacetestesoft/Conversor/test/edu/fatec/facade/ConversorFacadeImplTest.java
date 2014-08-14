package edu.fatec.facade;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;
import edu.fatec.command.ICommand;
import edu.fatec.exception.InvalidValueException;




public class ConversorFacadeImplTest {
	
	@Mock
	private ICommand comandoConversao;
	
	@Before
	public void initMock(){
		MockitoAnnotations.initMocks(this);
		
	}
	
	@Test
	public void validarConversaoDadoAlqueri(){
		try{
		IConversorFacade conversor = new ConversorFacadeImpl();
		
		when(comandoConversao.execute(anyDouble())).thenReturn(10d);
		//fazendo cast do conversor 
		((ConversorFacadeImpl)conversor).setConversorAlqueire(comandoConversao);
		Double retorno = conversor.converterDado(TipoConversor.ALQUEIRE,5d);
		//inicializado teste
		Assert.assertEquals(new Double(10d), retorno);
		//a
		verify(comandoConversao,times(1)).execute(anyDouble());
		//b 
		verify(comandoConversao,Mockito.only()).execute(anyDouble());
		//a e b são o mesmo teste
		}catch(Exception ex){
			Assert.fail();
		}
	}
	
	

}
