package model;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Pedido {
	private Cliente cliente;
	private List<Produto> produtos;
	private String notaFiscal;
	private LocalDate dataSolicitacao;
	private float valorTotal;
	private String status;
	
	
	public Pedido(Cliente cliente, String notaFiscal, LocalDate dataSolicitacao, float valorTotal, String status) {
		super();
		this.cliente = cliente;
		this.notaFiscal = notaFiscal;
		this.dataSolicitacao = dataSolicitacao;
		this.valorTotal = valorTotal;
		this.status = status;
		this.produtos = new LinkedList<>();
	}
	
	public void adicionarProduto(Produto produto) {
		this.produtos.add(produto);		
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public List<Produto> getProduto() {
		return List.copyOf(this.produtos);
	}
	
	protected void setProduto(List<Produto> produto) {
		this.produtos = produto;
	}
	
	public String getNotaFiscal() {
		return notaFiscal;
	}
	
	public void setNotaFiscal(String notaFiscal) {
		this.notaFiscal = notaFiscal;
	}
	
	public LocalDate getDataSolicitacao() {
		return dataSolicitacao;
	}
	
	public void setDataSolicitacao(LocalDate dataSolicitacao) {
		this.dataSolicitacao = dataSolicitacao;
	}
	
	public float getValorTotal() {
		return valorTotal;
	}
	
	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
}
