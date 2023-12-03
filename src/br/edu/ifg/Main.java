package br.edu.ifg;

import view.InterfaceExibirBusca;
import view.InterfaceLogin;
import java.awt.EventQueue;
import java.text.SimpleDateFormat;

import view.InterfaceLogin;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceLogin window = new InterfaceLogin();
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		Usuario usuario = new Usuario();
		//usuario.cadastrar("Gabrielly", "45454545", "2002/04/25", "jshadihs", "996915851", "emailGabi.com", "feminino", "cliente","3847246723", "iuda");
		//usuario.cadastrar("Oscar", "45124678", "2002/09/14", "efgh", "993564781", "emailOscar.com", "masculino", "proprietario","405128623", "abc");
		//usuario.cadastrar("Yasmin", "222224", "2004/04/17", "abcd", "986941527", "emailYasmin.com", "feminino", "cliente","854517649", "defg");
		//usuario.cadastrar("Josefa", "222224", "2004/04/17", "abcd", "986941527", "emailYasmin.com", "feminino", "cliente","854517649", "defg");
		//usuario.editarUsuario(3,"Yasmin", "252525", "2002/04/25", "jshadihs", "996915851", "pedro.com", "feminino", "cliente","3847246723", "iuda");
		//usuario.login("emailGabi.com", "iuda");
		usuario.excluir(1);
	
		//Hotel hotel = new Hotel(null, null, null, false);
		//hotel.fazerReserva(0);
		
		// Pix pix = new Pix();
		// Pix.emitirCodigo(0);
		// System.out.println("Chave PIX gerada: " + pix.emitirCodigo(500));
		
		//Cartao cartao = new Cartao();
		//cartao.cadastrarCartao("123", 500, 2, "412579355", "2053/10/31");
	}

}
