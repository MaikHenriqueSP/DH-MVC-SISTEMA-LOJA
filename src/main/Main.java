package main;

import java.time.LocalDate;
import java.util.Arrays;

import controller.ClienteController;
import controller.LojaController;
import model.Cliente;
import model.Endereco;
import model.Loja;
import model.Pedido;
import model.Produto;
import model.Telefone;
import view.ClienteView;
import view.EnderecoView;
import view.LojaView;
import view.PedidoView;
import view.ProdutoView;
import view.TelefoneView;

public class Main {
	public static void main(String[] args) {
		//Views
		ClienteView clienteView = new ClienteView();
		LojaView lojaView = new LojaView();
		PedidoView pedidoView = new PedidoView();
		EnderecoView enderecoView = new EnderecoView();
		ProdutoView produtoView = new ProdutoView();
		TelefoneView telefoneView = new TelefoneView();
		
		//Loja
		Loja loja = new Loja("Minha Loja");

		//Clientes
		Cliente cliente1 = new Cliente("Jooj", "123.222.111.2", "naosei@gmail.com", LocalDate.of(1980, 1, 12), 
				new Endereco("Rua Barcelos", "Não sei", "103101301", "2131"), new Telefone("11", "21313131313"));
		Cliente cliente2 = new Cliente("Berg", "444.21.444.3", "naumsei@gmail.com", LocalDate.of(1975, 12, 2), 
				new Endereco("Rua Não sei", "Não sei", "103101301", "2131"), new Telefone("02", "931678909013"));
		Cliente cliente3 = new Cliente("Nome", "423.522.311.2", "ns@gmail.com", LocalDate.of(1990, 3, 12), 
				new Endereco("Rua Aleatória", "Não sei", "902104301", "4131"), new Telefone("14", "21313131313"));
		Cliente cliente4 = new Cliente("Jooj", "123.222.111.2", "naosei@gmail.com", LocalDate.of(1980, 1, 12), 
				new Endereco("Rua Melamel", "Não sei", "103101301", "2131"), new Telefone("08", "12345678"));
		
		//Produtos
		Produto produto1 = new Produto("Air max", 231.2f, 30, "Ar máximo");
		Produto produto2 = new Produto("Veloster", 313993.f, 99, "Carro de três portas");
		Produto produto3 = new Produto("Algum Produto", 132.f, 10, "Muito bom");
		
		//Pedidos
		Pedido pedido1 = new Pedido(cliente1, "FKLAJF3131KASLK123", LocalDate.now(), "Pedido Relizado", Arrays.asList(produto1));
		Pedido pedido2 = new Pedido(cliente2, "MMVKVKJKJ923184391", LocalDate.now(), "Separado para entrega", Arrays.asList(produto2, produto3));
		Pedido pedido3 = new Pedido(cliente3, "ASLKJDAOI094184091", LocalDate.now(), "Saiu para entrega", Arrays.asList(produto1, produto2));
		
		//	Controllers
		LojaController lojaController = new LojaController(loja, lojaView, clienteView, pedidoView, produtoView);
		ClienteController clienteController = new ClienteController(cliente1, clienteView, enderecoView, telefoneView);
		
//		lojaController.updateView();
		
//		//Cadastro Clientes
		lojaController.cadastrarCliente(cliente1);
		lojaController.cadastrarCliente(cliente2);
		lojaController.cadastrarCliente(cliente3);
		lojaController.cadastrarCliente(cliente4);
		
//		lojaController.updateView();
		
//		//Cadastro pedidos
		lojaController.cadastrarPedido(pedido1);
		lojaController.cadastrarPedido(pedido2);
		lojaController.cadastrarPedido(pedido3);
		
//		//Cadastro produtos
		lojaController.cadastrarProduto(produto1);
		lojaController.cadastrarProduto(produto2);
		lojaController.cadastrarProduto(produto3);
		
//		//View da loja		
//		lojaController.updateView();
//		
//		//View do cliente
//		clienteController.updateView();
		clienteController.adicionarTelefone(new Telefone("12", "38213821313"));
//		clienteController.updateView();
		
		lojaController.removerPedido(pedido1);
//		lojaController.updateView();
		
		lojaController.removerCliente(cliente1);
		
//		lojaController.updateLojaView();
//		lojaController.updatePedidosView();
//		lojaController.updateClientesView();
		lojaController.updateView();
			
	}
}
