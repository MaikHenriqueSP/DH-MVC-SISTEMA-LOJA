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
		return telefoneModel.getTelefone();
	}
	
	public void setTelefone(String telefone) {
		telefoneModel.setTelefone(telefone);
	}
	
	public String getDdd() {
		return telefoneModel.getDdd();
	}
	
	public void setDdd(String ddd) {
		telefoneModel.setDdd(ddd);
	}
	
	public void updateTelefoneView() {
		telefoneView.printTelefone(getDdd(), getTelefone());
	}
}
