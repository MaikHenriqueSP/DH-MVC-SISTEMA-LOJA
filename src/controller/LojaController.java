package controller;

import java.util.List;

import model.Cliente;
import model.Loja;
import model.Pedido;
import model.Produto;
import view.ClienteView;
import view.LojaView;
import view.PedidoView;
import view.ProdutoView;

public class LojaController {
	private Loja lojaModel;
	private LojaView lojaView;
	private ClienteView clienteView;
	private PedidoView pedidoView;
	private ProdutoView produtoView;
	
	
	public LojaController(Loja lojaModel, LojaView lojaView, ClienteView clienteView, 
			PedidoView pedidoView, ProdutoView produtoView) {
		this.lojaModel = lojaModel;
		this.lojaView = lojaView;
		this.clienteView = clienteView;
		this.pedidoView = pedidoView;
		this.produtoView = produtoView;
	}
	
	public void cadastrarCliente(Cliente cliente) {
		lojaModel.cadastrarCliente(cliente);
	}
	
	public void removerCliente(Cliente cliente) {
		lojaModel.removerCliente(cliente);
	}
	
	public void cadastrarProduto(Produto produto) {
		lojaModel.cadastrarProduto(produto);
	}
	
	public void removerProduto(Produto produto) {
		lojaModel.removerProduto(produto);
	}
	
	public void cadastrarPedido(Pedido pedido) {
		lojaModel.cadastrarPedido(pedido);
	}
	
	public void removerPedido(Pedido pedido) {
		lojaModel.removerPedido(pedido);
	} 
	
	public String getNomeLoja() {
		return lojaModel.getNomeLoja();
	}
	
	public void setNomeLoja(String nomeLoja) {
		lojaModel.setNomeLoja(nomeLoja);
	}

	public List<Cliente> getClientes() {
		return lojaModel.getClientes();
	}


	public List<Produto> getProdutos() {
		return lojaModel.getProdutos();
	}
	

	public List<Pedido> getPedidos() {
		return lojaModel.getPedidos();
	}
	
	public void updateView() {
		updateLojaView();
		updateClientesView();
		updatePedidosView();
	}
	
	public void updateLojaView() {
		lojaView.printLoja(getNomeLoja(), getClientes(), getProdutos(), getPedidos());
	}
	
	public void updateClientesView() {
		clienteView.printClienteDetails(getClientes());
	}
	
	public void updatePedidosView() {
		pedidoView.printPedido(getPedidos());
	}
	
	public void updateProdutosView() {
		produtoView.printProduto(getProdutos());
	}
}
