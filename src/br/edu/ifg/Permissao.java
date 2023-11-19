package br.edu.ifg;

public enum Permissao {
	PROPRIETARIO("proprietario"),
	CLIENTE("cliente");
	
	private String descricao;
	
	Permissao(String descricao){
		this.descricao = descricao;
	}
}
