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
	}

}