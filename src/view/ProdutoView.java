package view;

import java.util.List;

import model.Produto;

public class ProdutoView {
	
	public void printProduto(String nome, float preco, int quantidadeEstoque, String descricao) {
		System.out.println("--------------------------------------------");
		System.out.println("Produto");
		System.out.println("    Nome: " + nome);
		System.out.println("    Preco: " + preco);
		System.out.println("    Quantidade Estoque: " + quantidadeEstoque);
		System.out.println("    Descricao: " + descricao);
		System.out.println("--------------------------------------------");
	}
	
	public void printProduto(List<Produto> produtos) {
		System.out.println("/////////////////////////////////////////////////////////////////");
		System.out.println("Lista de produtos");
		produtos.forEach(produto -> printProduto(produto.getNome(), produto.getPreco(), 
				produto.getQuantidadeEstoque(), produto.getDescricao()));
		System.out.println("/////////////////////////////////////////////////////////////////");
	}

}
