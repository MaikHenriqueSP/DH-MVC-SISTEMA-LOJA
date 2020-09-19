package view;

import model.Endereco;

public class EnderecoView {

	public void printEndereco(String rua, String bairro, String cep, String numero, String complemento) {
		System.out.println("--------------------------------------------");
		System.out.println("Endereço:");
		System.out.println("    Rua: " + rua);
		System.out.println("    CEP: "  + cep);
		System.out.println("    Número: "  + numero);
		System.out.println("    Complemento: " + complemento);
		System.out.println("--------------------------------------------");
	}
	
	public void printEndereco(Endereco endereco) {
		this.printEndereco(endereco.getRua(), endereco.getBairo(), endereco.getCep(), 
				endereco.getNumero(), endereco.getComplemento());
	}
}
