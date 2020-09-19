package view;

public class EnderecoView {
//	private String rua;
//	private String bairo;
//	private String cep;
//	private String numero;
//	private String complemento;

	public void printEndereco(String rua, String bairro, String cep, String numero, String complemento) {
		System.out.println("Endereço:");
		System.out.println("    Rua: " + rua);
		System.out.println("    CEP: "  + cep);
		System.out.println("    Número: "  + numero);
		System.out.println("    Complemento: " + complemento);
	}
}
