package view;

import java.util.List;

import model.Cliente;
import model.Pedido;
import model.Produto;

public class LojaView {
	
	public void printLoja(String nomeLoja, List<Cliente> clientes, List<Produto> produtos, List<Pedido> pedidos) {
		System.out.println("--------------------------------------------");
		System.out.println(nomeLoja);
		System.out.println("    Clientes cadastrados: " + clientes.size());
		System.out.println("    Produtos cadastrados: " + produtos.size());
		System.out.println("    Pedidos realizados: " + pedidos.size());
		System.out.println("--------------------------------------------");
	}

}
