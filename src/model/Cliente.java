package model;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Cliente {
	private String nome;
	private String cpf;
	private String email;
	private LocalDate dataNascimento;
	private Endereco endereco;
	private List<Telefone> telefones;
	
	public Cliente(String nome, String cpf, String email, LocalDate dataNascimento, Endereco endereco, 
			Telefone telefoneInicial) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.telefones = new LinkedList<>();
		this.telefones.add(telefoneInicial);
	}
	
	public void adicionarTelefone(Telefone telefone) {
		this.telefones.add(telefone);		
	}
	
	public void removerTelefone(Telefone telefone) {
		telefones.remove(telefone);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Telefone> getTelefones() {
		return List.copyOf(telefones);
	}

	protected void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
}
