package view;

import java.util.List;
import model.Telefone;

public class TelefoneView {
	
	public void printTelefone(String ddd, String telefone) {
		System.out.println("(" + ddd + ")" + " " + telefone);		
	}
	
	public void printTelefone(List<Telefone> telefones) {
		telefones.forEach(telefone -> printTelefone(telefone.getDdd(), telefone.getTelefone()));
	}

}
