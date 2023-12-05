package br.edu.ifg;

import java.util.Random;

public class Pix extends Pagamento {
	private double valor;
	private String chavePix;

	public Pix(String nome, Reserva reserva) {
		super(nome, reserva);
		this.valor = reserva.getValorTotal();
		this.chavePix = this.emitirCodigo(valor);
	}

	public String emitirCodigo(double valor) {
		String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		int tamanhoChave = 20;

		StringBuilder chavePix = new StringBuilder();

		Random random = new Random();

		for (int i = 0; i < tamanhoChave; i++) {
			char caractere = caracteres.charAt(random.nextInt(caracteres.length()));
			chavePix.append(caractere);
		}
		chavePix.append(String.valueOf(valor));

		return chavePix.toString();
	}

	public double getValor() {
		return valor;

	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getChavePix() {
		return chavePix;
	}

	public void setChavePix(String chavePix) {
		this.chavePix = chavePix;
	}

}
