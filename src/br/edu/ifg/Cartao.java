package br.edu.ifg;

import java.text.SimpleDateFormat;

public class Cartao extends Pagamento {
	private double valor;
	private String numero;
	private String cvv;
	private int qtdParcela;
	private SimpleDateFormat dataVencimento;

	public Cartao(String nome, Reserva reserva) {
		super(nome, reserva);
	}

	public void cadastrarCartao(String cvv, double valor, int qtdParcela, String numero, String dataVencimento) {
		this.adicionarDados(cvv, this.getValor(), qtdParcela, numero, dataVencimento);
		System.out.println("cartao cadastrado com sucesso");
	}

	public void adicionarDados(String cvv, double valor, int qtdParcela, String numero, String dataVencimento) {
		boolean status = this.validarDados(cvv, valor, qtdParcela, numero, dataVencimento);

		SimpleDateFormat data = new SimpleDateFormat(dataVencimento);

		this.setCvv(cvv);
		this.setValor(valor);
		this.setQtdParcela(qtdParcela);
		this.setNumero(numero);
		this.setDataVencimento(data);
	}

	private boolean validarDados(String cvv, double valor, int qtdParcela, String numero, String dataVencimento) {
		boolean status = true;

		if (cvv.isEmpty())
			status = false;
		if (valor < 0)
			status = false;
		if (qtdParcela < 1)
			status = false;
		if (numero.isEmpty())
			status = false;
		if (dataVencimento.isEmpty())
			status = false;

		return status;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public int getQtdParcela() {
		return qtdParcela;
	}

	public void setQtdParcela(int qtdParcela) {
		this.qtdParcela = qtdParcela;
	}

	public SimpleDateFormat getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(SimpleDateFormat dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	@Override
	public String toString() {
		return "Cartao [valor:" + valor + ", numero=" + numero + ", cvv=" + cvv + ", qtdParcela=" + qtdParcela
				+ ", dataVencimento=" + dataVencimento + "]";
	}
}
