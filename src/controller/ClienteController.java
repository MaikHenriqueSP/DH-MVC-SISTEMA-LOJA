package controller;

import java.time.LocalDate;
import java.util.List;

import model.Cliente;
import model.Endereco;
import model.Telefone;
import view.ClienteView;
import view.EnderecoView;

public class ClienteController {
	private Cliente clienteModel;
	private ClienteView clienteView;
	private EnderecoView enderecoView;
	
	public ClienteController(Cliente clienteModel, ClienteView clienteView, EnderecoView enderecoView) {
		this.clienteModel = clienteModel;
		this.clienteView = clienteView;
		this.enderecoView = enderecoView;
	}	
	
	public void adicionarTelefone(Telefone telefone) {
		this.clienteModel.adicionarTelefone(telefone);		
	}
	
	public void removerTelefone(Telefone telefone) {
		this.clienteModel.removerTelefone(telefone);
	}

	public String getNome() {
		return this.clienteModel.getNome();
	}

	protected void setNome(String nome) {
		this.clienteModel.setNome(nome);
	}

	public String getCpf() {
		return this.clienteModel.getCpf();
	}

	protected void setCpf(String cpf) {
		this.clienteModel.setCpf(cpf);
	}

	public String getEmail() {
		return this.clienteModel.getEmail();
	}

	protected void setEmail(String email) {
		this.clienteModel.setEmail(email);
	}

	public LocalDate getDataNascimento() {
		return this.clienteModel.getDataNascimento();
	}

	protected void setDataNascimento(LocalDate dataNascimento) {
		this.clienteModel.setDataNascimento(dataNascimento);
	}

	public Endereco getEndereco() {
		return this.clienteModel.getEndereco();
	}

	protected void setEndereco(Endereco endereco) {
		this.clienteModel.setEndereco(endereco);
	}

	public List<Telefone> getTelefones() {
		return this.clienteModel.getTelefones();
	}
	
	public void updateClienteView() {
		clienteView.printClienteDetails(clienteModel.getNome(),clienteModel.getCpf(), clienteModel.getEmail(),
				clienteModel.getDataNascimento());
		this.updateClienteEnderecoView();
	}
	
	public void updateClienteEnderecoView() {
		enderecoView.printEndereco(clienteModel.getEndereco());
	}

}
