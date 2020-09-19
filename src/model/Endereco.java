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

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairo() {
		return bairo;
	}

	public void setBairo(String bairo) {
		this.bairo = bairo;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return (complemento == null) ? "" : complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairo == null) ? 0 : bairo.hashCode());
		result = prime * result + ((cep == null) ? 0 : cep.hashCode());
		result = prime * result + ((complemento == null) ? 0 : complemento.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((rua == null) ? 0 : rua.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		if (bairo == null) {
			if (other.bairo != null)
				return false;
		} else if (!bairo.equals(other.bairo))
			return false;
		if (cep == null) {
			if (other.cep != null)
				return false;
		} else if (!cep.equals(other.cep))
			return false;
		if (complemento == null) {
			if (other.complemento != null)
				return false;
		} else if (!complemento.equals(other.complemento))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (rua == null) {
			if (other.rua != null)
				return false;
		} else if (!rua.equals(other.rua))
			return false;
		return true;
	}
	
	
}
