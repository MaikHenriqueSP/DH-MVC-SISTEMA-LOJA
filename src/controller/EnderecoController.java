package controller;

import model.Endereco;
import view.EnderecoView;

public class EnderecoController {
	private Endereco enderecoModel;
	private EnderecoView enderecoView;

	public EnderecoController(Endereco enderecoModel, EnderecoView enderecoView) {
		this.enderecoModel = enderecoModel;
		this.enderecoView = enderecoView;
	}

	public String getRua() {
		return enderecoModel.getRua();
	}

	public void setRua(String rua) {
		enderecoModel.setRua(rua);
	}

	public String getBairo() {
		return enderecoModel.getBairo();
	}

	public void setBairo(String bairo) {
		enderecoModel.setBairo(bairo);
	}

	public String getCep() {
		return enderecoModel.getCep();
	}

	public void setCep(String cep) {
		enderecoModel.setCep(cep);
	}

	public String getNumero() {
		return enderecoModel.getNumero();
	}

	public void setNumero(String numero) {
		enderecoModel.setNumero(numero);
	}

	public String getComplemento() {
		return enderecoModel.getComplemento();
	}

	public void setComplemento(String complemento) {
		enderecoModel.setComplemento(complemento);
	}
	
	public void updateClienteView() {
		enderecoView.printEndereco(this.getRua(), this.getBairo(), 
				this.getCep(), this.getNumero(), this.getComplemento());
	}
}
