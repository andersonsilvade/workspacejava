package org.edu.fatec.vendas;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.edu.fatec.vendas.entity.Cliente;
import org.edu.fatec.vendas.entity.ItemPedido;
import org.edu.fatec.vendas.entity.Produto;
import org.edu.fatec.vendas.exception.ItemNotFoundException;

public class Pedido {
	private Date data;
	private Cliente cliente;
	private Integer codigoPedido;
	private Map<Produto, ItemPedido> mapItens;
	
	public Pedido(Date data, Cliente cliente, Integer codigoPedido) {
		this.data = data;
		this.cliente = cliente;
		this.codigoPedido = codigoPedido;
		mapItens = new HashMap<Produto, ItemPedido>();
	}
	
	public Date getData() {
		if (data != null)
			return data;
		else{
			return new Date();
		}
	}

	public Cliente getCliente() {
		if (cliente != null)
			return cliente;
		else{
			return new Cliente(null, "Diversos", null);
		}
	}	
	
	public void addProduto(Produto produto) {
		ItemPedido item = new ItemPedido((mapItens.size() + 1), produto, 1); 
		mapItens.put(produto, item);
	}
	
	public void addProduto(Integer codigo, Produto produto, Integer quantidade) {
		ItemPedido item = new ItemPedido(codigo, produto, quantidade); 
		mapItens.put(produto, item);
	}
	
	public Double totalPedido() {
		Double resultado = 0.0;
		for (ItemPedido item : mapItens.values()) {
			resultado += item.totalItem();
		}
		return resultado;
	}
	
	public ItemPedido recuperItemPorCodigo(Integer codigoItem) throws ItemNotFoundException {
		for (ItemPedido item : mapItens.values()) {
			if (item.getCodigo().equals(codigoItem))
				return item;
		}
		throw new ItemNotFoundException();
	}
	
	public List<ItemPedido> listarItensPedido() {
		return new ArrayList<ItemPedido>(mapItens.values());
	}
	
	@Override
	public String toString() {
		return "Codigo Pedido = " + codigoPedido 
			+ "Qtde. Produtos = " + mapItens.keySet().size(); 
	}
}
