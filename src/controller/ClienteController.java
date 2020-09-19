package controller;

import java.time.LocalDate;
import java.util.List;

import model.Cliente;
import model.Endereco;
import model.Telefone;
import view.ClienteView;
import view.EnderecoView;
import view.TelefoneView;

public class ClienteController {
	private Cliente clienteModel;
	private ClienteView clienteView;
	private EnderecoView enderecoView;
	private TelefoneView telefoneView;
	
	public ClienteController(Cliente clienteModel, ClienteView clienteView, EnderecoView enderecoView, 
			TelefoneView telefoneView) {
		this.clienteModel = clienteModel;
		this.clienteView = clienteView;
		this.enderecoView = enderecoView;
		this.telefoneView = telefoneView;
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
		
	public void updateView() {
		this.updateClienteView();
		this.updateEnderecoView();
		this.updateTelefoneView();
	}
	
	public void updateClienteView() {
		clienteView.printClienteDetails(this.getNome(),this.getCpf(), this.getEmail(),
				this.getDataNascimento());
	}
	
	public void updateEnderecoView() {
		enderecoView.printEndereco(this.getEndereco());
	}
	
	public void updateTelefoneView() {
		telefoneView.printTelefone(this.getTelefones());
	}

}
