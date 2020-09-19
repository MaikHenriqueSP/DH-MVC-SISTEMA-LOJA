package view;

import java.time.LocalDate;
import java.util.List;

import model.Cliente;

public class ClienteView {

	public void printClienteDetails(String nome, String cpf, String email, LocalDate dataNascimento) {
		System.out.println("--------------------------------------------");
		System.out.println("Descrição de cadastro do cliente:");
		System.out.println("    Nome: " + nome);
		System.out.println("    CPF:" + cpf);
		System.out.println("    Email:" + email);
		System.out.println("    Data Nascimento:" + dataNascimento);
		System.out.println("--------------------------------------------");
	}
	
	public void printClienteDetails(List<Cliente> clientes) {
		System.out.println("/////////////////////////////////////////////////////////////////");
		System.out.println("Lista de clientes");
		clientes.forEach(cliente -> printClienteDetails(cliente.getNome(), cliente.getCpf(), 
				cliente.getEmail(), cliente.getDataNascimento()));		
		System.out.println("/////////////////////////////////////////////////////////////////");
	}
}
