package controller;

import java.time.LocalDate;
import java.util.List;

import model.Cliente;
import model.Endereco;
import model.Telefone;
import view.ClienteView;

public class ClienteController {
	private Cliente clienteModel;
	private ClienteView clienteView;
	
	public ClienteController(Cliente clienteModel, ClienteView clienteView) {
		this.clienteModel = clienteModel;
		this.clienteView = clienteView;
	}	
	
	public void adicionarTelefone(Telefone telefone) {
		clienteModel.adicionarTelefone(telefone);		
	}
	
	public void removerTelefone(Telefone telefone) {
		clienteModel.removerTelefone(telefone);
	}

	public String getNome() {
		return clienteModel.getNome();
	}

	protected void setNome(String nome) {
		clienteModel.setNome(nome);
	}

	public String getCpf() {
		return clienteModel.getCpf();
	}

	protected void setCpf(String cpf) {
		clienteModel.setCpf(cpf);
	}

	public String getEmail() {
		return clienteModel.getEmail();
	}

	protected void setEmail(String email) {
		clienteModel.setEmail(email);
	}

	public LocalDate getDataNascimento() {
		return clienteModel.getDataNascimento();
	}

	protected void setDataNascimento(LocalDate dataNascimento) {
		clienteModel.setDataNascimento(dataNascimento);
	}

	public Endereco getEndereco() {
		return clienteModel.getEndereco();
	}

	protected void setEndereco(Endereco endereco) {
		clienteModel.setEndereco(endereco);
	}

	public List<Telefone> getTelefones() {
		return clienteModel.getTelefones();
	}
	
	public void updateClienteView() {
		clienteView.printClientDetails(clienteModel.getNome(),clienteModel.getCpf(), clienteModel.getEmail(),
				clienteModel.getDataNascimento(), clienteModel.getEndereco(), clienteModel.getTelefones());
	}

}
