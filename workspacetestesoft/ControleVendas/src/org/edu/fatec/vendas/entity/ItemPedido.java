package org.edu.fatec.vendas.entity;

public class ItemPedido {
	private Integer codigo;
	private Produto produto;
	private Integer quantidade;
	
	public ItemPedido(Integer codigo, Produto produto, Integer quantidade) {
		this.codigo = codigo;
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public Double totalItem() {
		return getQuantidade() * produto.getPreco();
	}
}
