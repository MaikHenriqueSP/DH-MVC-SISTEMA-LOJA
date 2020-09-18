package model;

public class Telefone {
	private String telefone;
	private String ddd;
	
	public Telefone(String telefone, String ddd) {
		this.telefone = telefone;
		this.ddd = ddd;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	protected void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getDdd() {
		return ddd;
	}
	
	protected void setDdd(String ddd) {
		this.ddd = ddd;
	}
}
