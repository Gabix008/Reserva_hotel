package br.edu.ifg;

public enum Sexo {
	FEMININO("feminino"),
	MASCULINO("masculino");
	
	private String descricao;
	
	Sexo(String descricao) {
		this.descricao = descricao;
	}
}
