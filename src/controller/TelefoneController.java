package controller;

import model.Telefone;
import view.TelefoneView;

public class TelefoneController {
	private Telefone telefoneModel;
	private TelefoneView telefoneView;
	
	public TelefoneController(Telefone telefoneModel, TelefoneView telefoneView) {
		this.telefoneModel = telefoneModel;
		this.telefoneView = telefoneView;
	}
	
	public String getTelefone() {
		return this.telefoneModel.getTelefone();
	}
	
	public void setTelefone(String telefone) {
		this.telefoneModel.setTelefone(telefone);
	}
	
	public String getDdd() {
		return this.telefoneModel.getDdd();
	}
	
	public void setDdd(String ddd) {
		this.telefoneModel.setDdd(ddd);
	}
	
	public void updateTelefoneView() {
		this.telefoneView.printTelefone(this.getDdd(), this.getTelefone());
	}
}
