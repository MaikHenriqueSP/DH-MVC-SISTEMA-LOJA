package controller;

import java.time.LocalDate;
import java.util.List;

import model.Cliente;
import model.Pedido;
import model.Produto;
import view.ClienteView;
import view.PedidoView;
import view.ProdutoView;

public class PedidoController {
	private Pedido pedidoModel;
	private PedidoView pedidoView;
	private ProdutoView produtoView;
	private ClienteView clienteView;
	
	public PedidoController(Pedido pedidoModel, PedidoView pedidoView, ProdutoView produtoView,
			ClienteView clienteView) {
		this.pedidoModel = pedidoModel;
		this.pedidoView = pedidoView;
		this.produtoView = produtoView;
		this.clienteView = clienteView;
	}
	
	public void adicionarProduto(Produto produto) {
		pedidoModel.adicionarProduto(produto);	
	}
	
	public Cliente getCliente() {
		return pedidoModel.getCliente();
	}
	
	public void setCliente(Cliente cliente) {
		pedidoModel.setCliente(cliente);
	}
	
	public List<Produto> getProduto() {
		return pedidoModel.getProdutos();
	}
	
	public String getNotaFiscal() {
		return pedidoModel.getNotaFiscal();
	}
	
	public void setNotaFiscal(String notaFiscal) {
		pedidoModel.setNotaFiscal(notaFiscal);
	}
	
	public LocalDate getDataSolicitacao() {
		return pedidoModel.getDataSolicitacao();
	}
	
	public void setDataSolicitacao(LocalDate dataSolicitacao) {
		pedidoModel.setDataSolicitacao(dataSolicitacao);
	}
	
	public float getValorTotal() {
		return pedidoModel.getValorTotal();
	}
	
	public void setValorTotal(float valorTotal) {
		pedidoModel.setValorTotal(valorTotal);
	}
	
	public String getStatus() {
		return pedidoModel.getStatus();
	}
	
	public void setStatus(String status) {
		pedidoModel.setStatus(status);
	}
	
	public void updateView() {
		pedidoView.printPedido(getNotaFiscal(), getDataSolicitacao(), getValorTotal(), getStatus());
		updateProdutoView();
		updateClienteView();
	}

	public void updateProdutoView() {
		produtoView.printProduto(pedidoModel.getProdutos());
	}
	
	public void updateClienteView() {
		Cliente cliente = getCliente();
		clienteView.printClienteDetails(cliente.getNome(), cliente.getCpf(), cliente.getEmail(),
				cliente.getDataNascimento());
	} 
}
