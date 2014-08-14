package pilha;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PilhaTeste {
	//@Teste indica é que uma classe teste, nao classe comum
	
	@Test
	public void validarInsercaoUmElementoPilha(){
		/*No push há uma excessao. é preciso tratar excessao aqui*/
		try{		
			String resultadoEsperado = "Elemento1";
			Stack pilha = new Stack(2);		
			pilha.push(resultadoEsperado);
			/* É preciso pensar em todas as maneiras de validar push! */
			Assert.assertEquals(resultadoEsperado, pilha.top());
			Assert.assertFalse(pilha.isEmpty());
			Assert.assertEquals(1, pilha.size());
		}catch(StackFullException ex){
			Assert.fail();
		}
	}
	
	/*String em Java são objetos Imutáveis.  Quando se faz operações com 
	 * String, a original não é modificada.
	 */
	
	
	/*expected - mostra que teste deve lançar escessao
	 *Não precisa de asserts nesse caso
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
			
		/*tem que lançar duas exceções, entao, usa-se a classe generica*/
		}catch (Exception ex){
			ex.printStackTrace();
			Assert.fail();
		}
		
		
		
	}
}
