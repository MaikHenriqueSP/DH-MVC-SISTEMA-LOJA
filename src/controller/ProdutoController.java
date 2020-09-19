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
		return produtoModel.getNome();
	}
	
	public void setNome(String nome) {
		produtoModel.setNome(nome);
	}
	
	public float getPreco() {
		return produtoModel.getPreco();
	}
	
	public void setPreco(float preco) {
		produtoModel.setPreco(preco);
	}
	
	public int getQuantidadeEstoque() {
		return produtoModel.getQuantidadeEstoque();
	}
	
	public void setQuantidadeEstoque(int quantidadeEstoque) {
		produtoModel.setQuantidadeEstoque(quantidadeEstoque);
	}
	
	public String getDescricao() {
		return produtoModel.getDescricao();
	}
	
	public void setDescricao(String descricao) {
		produtoModel.setDescricao(descricao);
	}	
	
	public void updateView() {
		produtoView.printProduto(produtoModel.getNome(), produtoModel.getPreco(),
				produtoModel.getQuantidadeEstoque(), produtoModel.getDescricao());
	}
}
