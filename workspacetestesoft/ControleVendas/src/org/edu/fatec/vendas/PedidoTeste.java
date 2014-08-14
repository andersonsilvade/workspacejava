package org.edu.fatec.vendas;

import java.util.Date;

import junit.framework.Assert;
import junit.framework.AssertionFailedError;

import org.edu.fatec.vendas.entity.Cliente;
import org.edu.fatec.vendas.entity.Produto;
import org.edu.fatec.vendas.exception.ItemNotFoundException;
import org.junit.Test;

public class PedidoTeste {
	
	
	@Test
	public void validarAdicaoProdutoSemCodigoQauntidade(){
		try{
			Date dataAtual = new Date();
			Cliente cliente = new Cliente("4444444444","Teste1","33333333");
			Cliente cliente2 = new Cliente("22222", "Anderson","22222");
			Produto produto = new Produto();
			produto.setPreco(15.5);
			Pedido pedido = new Pedido(dataAtual, cliente, 1);
			Pedido pedido2 = new Pedido(null,cliente2 , 2);
			pedido.addProduto(produto);
			Assert.assertSame(produto, pedido.recuperItemPorCodigo(1).getProduto());
			Assert.assertEquals(15.5,pedido.totalPedido());
			Assert.assertEquals(dataAtual,pedido.getData());
			Assert.assertEquals(dataAtual,pedido2.getData());
			Assert.assertSame(cliente,pedido.getCliente());
			
		}catch(ItemNotFoundException ex){
			Assert.fail();
		}
	}

}
