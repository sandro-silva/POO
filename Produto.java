package br.ufpb.dcx.sistemacomercial;

public class Produto {
	
	private String codigo;
	private String descricao;
	private double precoVenda;
	private int quantidadeEmEstoque;
	private CategoriaProduto categoria;
	
	
	public Produto(String codigo, String descricao, double precoVenda, int quantidadeEmEstoque, CategoriaProduto categoria) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.precoVenda = precoVenda;
		this.quantidadeEmEstoque = quantidadeEmEstoque;
		this.categoria = categoria;
	}
	
	public Produto() {
		this("", "", 0, 0, CategoriaProduto.DEFAULT);
	}
	
	public String getCodigo() {
		return this.codigo;
	}

	public CategoriaProduto getCategoria() {
		return this.categoria;
	}

	public double getPrecoVenda() {
		return this.precoVenda;
	}

	public String getDescricao() {
		return this.descricao;
	}
	
	public int getQuantidadeEmEstoque() {
		return this.quantidadeEmEstoque;
	}
	
	public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}
	
	public void setCategoria(CategoriaProduto categoria) {
		this.categoria = categoria;
	}
	
	public String toString() {
		return "Produto de codigo: "+ this.codigo+ " e da categoria: "+this.categoria; 
		
	}
	
}
