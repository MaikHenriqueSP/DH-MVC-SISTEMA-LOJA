package view;

import java.time.LocalDate;

public class ClienteView {

	public void printClienteDetails(String nome, String cpf, String email, LocalDate dataNascimento) {
		System.out.println("Descrição de cadastro do cliente:");
		System.out.println("    CPF:" + cpf);
		System.out.println("    Email:" + cpf);
		System.out.println("    Data Nascimento:" + cpf);
		System.out.println("    Telefones: ");
	};
}
