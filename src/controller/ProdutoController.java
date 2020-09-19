package controller;

import model.Produto;
import view.ProdutoView;

public class ProdutoController {
	private Produto produtoModel;
	private ProdutoView produtoView;
	
	public ProdutoController(Produto produtoModel, ProdutoView produtoView) {
		this.produtoModel = produtoModel;
		this.produtoView = produtoView;
	}
	
	public String getNome() {
		return this.produtoModel.getNome();
	}
	
	public void setNome(String nome) {
		this.produtoModel.setNome(nome);
	}
	
	public float getPreco() {
		return this.produtoModel.getPreco();
	}
	
	public void setPreco(float preco) {
		this.setPreco(preco);
	}
	
	public int getQuantidadeEstoque() {
		return this.produtoModel.getQuantidadeEstoque();
	}
	
	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.produtoModel.setQuantidadeEstoque(quantidadeEstoque);
	}
	
	public String getDescricao() {
		return this.produtoModel.getDescricao();
	}
	
	public void setDescricao(String descricao) {
		this.produtoModel.setDescricao(descricao);
	}	
	
	public void updateView() {
		this.produtoView.printProduto(this.produtoModel.getNome(), this.produtoModel.getPreco(),
				this.produtoModel.getQuantidadeEstoque(), this.produtoModel.getDescricao());
	}
}
