package pilha;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PilhaTeste {
	//@Teste indica � que uma classe teste, nao classe comum
	
	@Test
	public void validarInsercaoUmElementoPilha(){
		/*No push h� uma excessao. � preciso tratar excessao aqui*/
		try{		
			String resultadoEsperado = "Elemento1";
			Stack pilha = new Stack(2);		
			pilha.push(resultadoEsperado);
			/* � preciso pensar em todas as maneiras de validar push! */
			Assert.assertEquals(resultadoEsperado, pilha.top());
			Assert.assertFalse(pilha.isEmpty());
			Assert.assertEquals(1, pilha.size());
		}catch(StackFullException ex){
			Assert.fail();
		}
	}
	
	/*String em Java s�o objetos Imut�veis.  Quando se faz opera��es com 
	 * String, a original n�o � modificada.
	 */
	
	
	/*expected - mostra que teste deve lan�ar escessao
	 *N�o precisa de asserts nesse caso
	 */
	
	@Test(expected=StackFullException.class)
	public void validarInsercaoAcimaCapacidade() throws StackFullException{
		String e1 = "Elemento1";
		String e2 = "Elemento1";			
		Stack pilha = new Stack(1);		
		pilha.push(e1);
		pilha.push(e2);
	}
	
	@Test(expected=StackEmptyException.class)
	public void validarRemocaoPilhaVazia()  throws StackEmptyException, StackFullException{
		String e1 = "E1";
		Stack pilha = new Stack(1);
		pilha.push(e1);
		pilha.pop();
		pilha.pop();		
	}
	
	@Test
	public void validarRemocaoUmElemento() throws StackFullException, StackEmptyException{
		try{		
			String e1 = "E1";
			String e2 = "E2";
			Stack pilha = new Stack(2);
			pilha.push(e1);
			pilha.push(e2);
		
			String retorno = pilha.pop();
		
			Assert.assertEquals(e2, retorno);
			Assert.assertEquals(e1, pilha.top());
			Assert.assertFalse(pilha.isEmpty());
			Assert.assertEquals(1, pilha.size());
			
		/*tem que lan�ar duas exce��es, entao, usa-se a classe generica*/
		}catch (Exception ex){
			ex.printStackTrace();
			Assert.fail();
		}
		
		
		
	}
}
