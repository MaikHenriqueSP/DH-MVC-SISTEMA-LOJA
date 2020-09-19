package model;

public class Produto {
	private String nome;
	private float preco;
	private int quantidadeEstoque;
	private String descricao;
	
	public Produto(String nome, float preco, int quantidadeEstoque, String descricao) {
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}
	
	protected void setNome(String nome) {
		this.nome = nome;
	}
	
	public float getPreco() {
		return preco;
	}
	
	protected void setPreco(float preco) {
		this.preco = preco;
	}
	
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	
	protected void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	protected void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
