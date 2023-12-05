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
		// Usuario usuer = new Usuario();
		// usuer.login("pedrpg5@gmail.com", "abc");
		// Hotel teste = new Hotel();
		// teste.buscarHotel(5);
		// teste.cadastrarQuarto(usuer, 150, "Quarto 150", 8, 7);
		// teste.cadastrarQuarto(usuer, 1500, "Quarto 150", 8, 7);
		// Map<Integer, Hotel> hoteis = teste.buscarHoteis("inhumas", "2023/12/06",
		// "2023/12/08");

		// for (Hotel hotel : hoteis.values()) {
		// for (Quarto quarto : hotel.getQuartos().values()) {
		// System.out.println(quarto.toString());
		// }
		// }
	}

}