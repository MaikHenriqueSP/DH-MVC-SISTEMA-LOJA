package view;

import java.time.LocalDate;

public class PedidoView {
	public void printPredido(String notaFiscal, LocalDate dataSolicitacao, float valorTotal, String status) {
		System.out.println("Produto");
		System.out.println("    Nota Fiscal:" + notaFiscal);
		System.out.println("    Data Solicitacao: " + dataSolicitacao);
		System.out.println("    Valor Total: R$" + valorTotal);
		System.out.println("    Status: " + notaFiscal);
	}
}
