package view;

import java.time.LocalDate;
import java.util.List;

import model.Endereco;
import model.Telefone;

public class ClienteView {

	public void printClientDetails(String nome, String cpf, String email, LocalDate dataNascimento,
			Endereco endereco, List<Telefone> telefones) {
		System.out.println("Descrição de cadastro do cliente:");
		System.out.println("    CPF:" + cpf);
		System.out.println("    Email:" + cpf);
		System.out.println("    Data Nascimento:" + cpf);
		System.out.println("    Telefones: ");
		telefones.forEach(telefone -> 
			System.out.println("        (" + telefone.getDdd() + ") " +telefone.getTelefone()));
		System.out.println("    Endereço:");
		System.out.println("        Rua:" + endereco.getRua());
		System.out.println("        Número:" + endereco.getNumero());
		System.out.println("        Bairro:" + endereco.getBairo());
		System.out.println("        CEP:" + endereco.getCep());
		System.out.println("        Complemento:" + endereco.getComplemento());
	};
}
