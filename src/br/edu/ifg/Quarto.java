package br.edu.ifg;

public class Quarto {
	private double preco;
	private String decricao;
	private int qtdCama;
	private int id;
	
	public Quarto(double preco, String decricao, int qtdCama, int id) {
		super();
		this.preco = preco;
		this.decricao = decricao;
		this.qtdCama = qtdCama;
		this.id = id;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDecricao() {
		return decricao;
	}

	public void setDecricao(String decricao) {
		this.decricao = decricao;
	}

	public int getQtdCama() {
		return qtdCama;
	}

	public void setQtdCama(int qtdCama) {
		this.qtdCama = qtdCama;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
