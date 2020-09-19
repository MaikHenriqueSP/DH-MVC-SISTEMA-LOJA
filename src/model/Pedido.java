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
	
	
	public Pedido(Cliente cliente, String notaFiscal, LocalDate dataSolicitacao, String status, 
			List<Produto> produtos) {
		this.cliente = cliente;
		this.notaFiscal = notaFiscal;
		this.dataSolicitacao = dataSolicitacao;
		this.valorTotal = 0;
		this.status = status;
		this.produtos = new LinkedList<>(produtos);
		calcularValorTotal();
	}
	
	private void calcularValorTotal() {
		this.valorTotal = produtos.stream().map(Produto::getPreco)
				.reduce(0.0f, (acumulador, preco) -> acumulador + preco);
	}
	
	public void adicionarProduto(Produto produto) {
		if (produto == null || produtos.contains(produto)) {
			return;
		}
		this.produtos.add(produto);		
		this.valorTotal += produto.getPreco();
	}
	
	public void removerProduto(Produto produto) {
		if (produto == null) {
			return;
		}
		this.produtos.remove(produto);
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public List<Produto> getProdutos() {
		return List.copyOf(this.produtos);
	}
	
	protected void setProdutos(List<Produto> produto) {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + ((dataSolicitacao == null) ? 0 : dataSolicitacao.hashCode());
		result = prime * result + ((notaFiscal == null) ? 0 : notaFiscal.hashCode());
		result = prime * result + ((produtos == null) ? 0 : produtos.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + Float.floatToIntBits(valorTotal);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (dataSolicitacao == null) {
			if (other.dataSolicitacao != null)
				return false;
		} else if (!dataSolicitacao.equals(other.dataSolicitacao))
			return false;
		if (notaFiscal == null) {
			if (other.notaFiscal != null)
				return false;
		} else if (!notaFiscal.equals(other.notaFiscal))
			return false;
		if (produtos == null) {
			if (other.produtos != null)
				return false;
		} else if (!produtos.equals(other.produtos))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (Float.floatToIntBits(valorTotal) != Float.floatToIntBits(other.valorTotal))
			return false;
		return true;
	}
	
	
}
