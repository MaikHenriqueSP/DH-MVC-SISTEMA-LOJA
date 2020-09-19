package view;

public class ProdutoView {
	
	public void printProduto(String nome, float preco, int quantidadeEstoque, String descricao) {
		System.out.println("Produto");
		System.out.println("    Nome: " + nome);
		System.out.println("    Preco: " + preco);
		System.out.println("    Quantidade Estoque: " + quantidadeEstoque);
		System.out.println("    Descricao: " + descricao);
	}
}
