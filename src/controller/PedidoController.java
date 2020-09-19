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
		this.pedidoModel.adicionarProduto(produto);	
	}
	
	public Cliente getCliente() {
		return this.pedidoModel.getCliente();
	}
	
	public void setCliente(Cliente cliente) {
		this.pedidoModel.setCliente(cliente);
	}
	
	public List<Produto> getProduto() {
		return this.pedidoModel.getProdutos();
	}
	
	public String getNotaFiscal() {
		return this.pedidoModel.getNotaFiscal();
	}
	
	public void setNotaFiscal(String notaFiscal) {
		this.pedidoModel.setNotaFiscal(notaFiscal);
	}
	
	public LocalDate getDataSolicitacao() {
		return this.pedidoModel.getDataSolicitacao();
	}
	
	public void setDataSolicitacao(LocalDate dataSolicitacao) {
		this.pedidoModel.setDataSolicitacao(dataSolicitacao);
	}
	
	public float getValorTotal() {
		return this.pedidoModel.getValorTotal();
	}
	
	public void setValorTotal(float valorTotal) {
		this.pedidoModel.setValorTotal(valorTotal);
	}
	
	public String getStatus() {
		return this.pedidoModel.getStatus();
	}
	
	public void setStatus(String status) {
		this.pedidoModel.setStatus(status);
	}
	
	public void updateView() {
		this.pedidoView.printPredido(this.getNotaFiscal(), this.getDataSolicitacao(), this.getValorTotal(),
				this.getStatus());
		this.updateProdutoView();
		this.updateClienteView();
	}

	public void updateProdutoView() {
		this.produtoView.printProduto(this.pedidoModel.getProdutos());
	}
	
	public void updateClienteView() {
		Cliente cliente = this.getCliente();
		this.clienteView.printClienteDetails(cliente.getNome(), cliente.getCpf(), cliente.getEmail(),
				cliente.getDataNascimento());
	} 
}
