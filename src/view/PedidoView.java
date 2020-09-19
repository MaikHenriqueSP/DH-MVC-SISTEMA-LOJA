package view;

import java.time.LocalDate;
import java.util.List;

import model.Pedido;

public class PedidoView {
	public void printPedido(String notaFiscal, LocalDate dataSolicitacao, float valorTotal, String status) {
		System.out.println("--------------------------------------------");
		System.out.println("Produto");
		System.out.println("    Nota Fiscal:" + notaFiscal);
		System.out.println("    Data Solicitacao: " + dataSolicitacao);
		System.out.println("    Valor Total: R$" + valorTotal);
		System.out.println("    Status: " + notaFiscal);
		System.out.println("--------------------------------------------");
	}
	
	public void printPedido(List<Pedido> pedidos) {
		pedidos.forEach(pedido -> printPedido(pedido.getNotaFiscal(), pedido.getDataSolicitacao(), 
				pedido.getValorTotal(), pedido.getStatus()));		
	}
}
