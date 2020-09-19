package model;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Loja {
	private String nomeLoja;
	private List<Cliente> clientes;
	private List<Produto> produtos;
	private List<Pedido> pedidos;
	
	public Loja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
		this.clientes = new LinkedList<>();
		this.produtos = new LinkedList<>();
		this.pedidos = new LinkedList<>();
	}
	
	public void cadastrarCliente(Cliente cliente) {
		if(cliente == null || clientes.contains(cliente)) { 
			return;
		}		
		clientes.add(cliente);
	}
	
	public void removerCliente(Cliente cliente) {
		if(cliente == null) { 
			return;
		}
		clientes.remove(cliente);
	}
	
	public void cadastrarProduto(Produto produto) {
		if(produto == null || produtos.contains(produto)) { 
			return;
		}	
		produtos.add(produto);
	}
	
	public void removerProduto(Produto produto) {
		if(produto == null) { 
			return;
		}
		produtos.remove(produto);
	}
	
	public void cadastrarPedido(Pedido pedido) {
		if(pedido == null || pedidos.contains(pedido)) { 
			return;
		}	
		pedidos.add(pedido);
	}
	
	public void removerPedido(Pedido pedido) {
		if(pedido == null) { 
			return;
		}
		pedidos.remove(pedido);
	} 
	
	public String getNomeLoja() {
		return nomeLoja;
	}
	
	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}

	public List<Cliente> getClientes() {
		return List.copyOf(clientes);
	}

	protected void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	protected void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public List<Produto> getProdutos() {
		return List.copyOf(produtos);
	}
	
	protected void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public List<Pedido> getPedidos() {
		return List.copyOf(pedidos);
	}
}
