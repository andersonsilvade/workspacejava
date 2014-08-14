package org.edu.fatec.venda.enity;

import org.edu.fatec.vendas.Pedido;
import org.edu.fatec.vendas.entity.ItemPedido;
import org.edu.fatec.vendas.entity.Produto;
import org.junit.Assert;
import org.junit.Test;

public class ItemPedidoTest {
	@Test
	public void validarCalculoVlTotal(){
		Produto produto = new Produto();
		produto.setPreco(15.5);
		ItemPedido item = new ItemPedido(1, produto, 3);
		
		Assert.assertSame(produto, item.getProduto());
		Assert.assertEquals(new Double(46.5), item.totalItem());
		Assert.assertEquals(46.5, item.totalItem().doubleValue());
		Assert.assertEquals(3, item.getQuantidade().intValue());
		
		
	}
	
	
	

}
