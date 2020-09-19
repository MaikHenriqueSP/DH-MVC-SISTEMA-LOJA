package view;

import java.time.LocalDate;
import java.util.List;

import model.Cliente;

public class ClienteView {

	public void printClienteDetails(String nome, String cpf, String email, LocalDate dataNascimento) {
		System.out.println("--------------------------------------------");
		System.out.println("Descrição de cadastro do cliente:");
		System.out.println("    CPF:" + cpf);
		System.out.println("    Email:" + cpf);
		System.out.println("    Data Nascimento:" + cpf);
		System.out.println("    Telefones: ");
		System.out.println("--------------------------------------------");
	}
	
	public void printClienteDetails(List<Cliente> clientes) {
		clientes.forEach(cliente -> printClienteDetails(cliente.getNome(), cliente.getCpf(), 
				cliente.getEmail(), cliente.getDataNascimento()));		
	}
}
