package view;

import java.util.List;

import model.Produto;

public class ProdutoView {
	
	public void printProduto(String nome, float preco, int quantidadeEstoque, String descricao) {
		System.out.println("Produto");
		System.out.println("    Nome: " + nome);
		System.out.println("    Preco: " + preco);
		System.out.println("    Quantidade Estoque: " + quantidadeEstoque);
		System.out.println("    Descricao: " + descricao);
	}
	
	public void printProduto(List<Produto> produtos) {
		produtos.forEach(produto -> printProduto(produto.getNome(), produto.getPreco(), 
				produto.getQuantidadeEstoque(), produto.getDescricao()));
	}

}
