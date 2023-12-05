package br.edu.ifg;

import view.InterfaceExibirBusca;
import view.InterfaceLogin;
import java.awt.EventQueue;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;

import view.InterfaceLogin;

public class Main {

	public static void main(String[] args) throws ParseException {
		// EventQueue.invokeLater(new Runnable() {
		// public void run() {
		// try {
		// InterfaceLogin window = new InterfaceLogin();
		// window.getFrame().setVisible(true);
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		// }
		// });
		// Quarto teste = new Quarto();
		// //teste.cadastrar(500, "Teste", 5, 10,1);
		// teste.buscar(2);
		// System.out.println(teste.toString());

		//Usuario usuario = new Usuario();
		// usuario.cadastrar("Gabrielly", "45454545", "2002/04/25", "jshadihs",
		// "996915851", "emailGabi.com", "feminino", "cliente","3847246723", "iuda");
		// usuario.cadastrar("Oscar", "45124678", "2002/09/14", "efgh", "993564781",
		// "emailOscar.com", "masculino", "proprietario","405128623", "abc");
		// usuario.cadastrar("Yasmin", "222224", "2004/04/17", "abcd", "986941527",
		// "emailYasmin.com", "feminino", "cliente","854517649", "defg");
		// usuario.cadastrar("Josefa", "222224", "2004/04/17", "abcd", "986941527",
		// "emailYasmin.com", "feminino", "cliente","854517649", "defg");
		// usuario.editarUsuario(3,"Yasmin", "252525", "2002/04/25", "jshadihs",
		// "996915851", "pedro.com", "feminino", "cliente","3847246723", "iuda");
		// usuario.login("emailGabi.com", "iuda");
		// usuario.excluir(1);

		// Hotel hotel = new Hotel(null, null, null, false);
		// hotel.fazerReserva(0);

		// Pix pix = new Pix();
		// Pix.emitirCodigo(0);
		// System.out.println("Chave PIX gerada: " + pix.emitirCodigo(500));

		// Cartao cartao = new Cartao();
		// cartao.cadastrarCartao("123", 500, 2, "412579355", "2053/10/31");
		Usuario user = new Usuario();
		// user.cadastrar("Pedro", "7864587", "2002/04/25", "teste", "84575478",
		// "pedrpg5@gmail.com", "masculino",
		// "proprietario", "abc");
		user.login("pedrpg5@gmail.com", "abc");
		System.out.println(user.toString());
		Hotel teste = new Hotel();
		Map<Integer, Hotel> hoteis = teste.buscarHoteis("ordalia", "2023/12/04", "2023/12/07");
		for (Hotel hotel : hoteis.values()) {
			for (Quarto quarto : hotel.getQuartos().values()) {
				System.out.println(quarto.toString());
			}
		}
		// teste.buscarHotel(5);
		// Quarto quarto = new Quarto();
		// quarto.buscar(37);
		// Reserva reserva = new Reserva();
		// reserva.CadastrarReserva("2023/12/04", "2023/12/07", 15000, user, teste,
		// quarto);
		// System.out.println(teste.toString());
		// teste.editar(user, 5, "pedroHotel", "teste", "teste descricao", "ordalia",
		// false);
		// System.out.println(teste.toString());
		// teste.excluir(4, user);
		// Map<Integer, Hotel> hoteis = teste.buscarHoteis("inhumas");
		// for (Hotel hotel : hoteis.values()) {
		// System.out.println(hotel.toString());
		// }
		// teste.cadastrar("TesteHotel", "Teste", "TesteGErakbs", "oradalia", false,
		// user.getId());
		// teste.cadastrarQuarto(user, 500, "Teste com Hotel", 5, 2);
		// teste.cadastrarQuarto(user, 500, "Teste com Hotel 1", 5, 20);
		// teste.cadastrarQuarto(user, 500, "Teste com Hotel 2", 50, 2);
		// teste.buscarQuartos();
		// teste.editarQuarto(user, 21, 100, "Teste com Hotel Editado", 2, 200);

	}

}
