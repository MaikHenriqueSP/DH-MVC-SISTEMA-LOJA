package model;

public class Endereco {
	private String rua;
	private String bairo;
	private String cep;
	private String numero;
	private String complemento;
	
	public Endereco(String rua, String bairo, String cep, String numero, String complemento) {
		this.rua = rua;
		this.bairo = bairo;
		this.cep = cep;
		this.numero = numero;
		this.complemento = complemento;
	}
	
	public Endereco(String rua, String bairo, String cep, String numero) {
		this.rua = rua;
		this.bairo = bairo;
		this.cep = cep;
		this.numero = numero;
	}

	public String getRua() {
		return rua;
	}

	protected void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairo() {
		return bairo;
	}

	protected void setBairo(String bairo) {
		this.bairo = bairo;
	}

	public String getCep() {
		return cep;
	}

	protected void setCep(String cep) {
		this.cep = cep;
	}

	public String getNumero() {
		return numero;
	}

	protected void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return (complemento == null) ? "" : complemento;
	}

	protected void setComplemento(String complemento) {
		this.complemento = complemento;
	}
}
