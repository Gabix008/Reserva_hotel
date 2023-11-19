package br.edu.ifg;

public class Cartao {
	private double valor;
	private String numero;
	private String cvv;
	private int qtdParcela;
	
	public Cartao(String cvv, double valor, int qtdParcela, String numero) {
		super();
		this.cvv = cvv;
		this.valor = valor;
		this.qtdParcela = qtdParcela;
		this.numero = numero;
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
	
	
}
