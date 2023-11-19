package br.edu.ifg;

import java.text.SimpleDateFormat;
import java.util.Map;

public class Usuario {
	private String nome;
	private String cpf;
	private SimpleDateFormat dataNasc;
	private String endereco;
	private String telefone;
	private String email;
	private Sexo sexo;
	private Permissao permissao;
	private String codigoReserva;
	private String senha;
	
	public Usuario(String nome, String cpf, SimpleDateFormat dataNasc, String endereco, String telefone, String email,
			Sexo sexo, Permissao permissao, String codigoReserva, String senha) {
		super();
		this.cadastrar(nome, cpf, cpf, endereco, telefone, email, email, senha, codigoReserva, senha);
	}
	
	public void cadastrar(String nome, String cpf, String dataNasc, String endereco, String telefone, String email,
			String sexo, String permissao, String codigoReserva, String senha) {
		boolean status = this.validarDados(nome, cpf, dataNasc, endereco, telefone, email, sexo, permissao, codigoReserva, senha);
		Sexo sexoUsuario;
		Permissao permissaoUsuario;
		
		if(!status) {
			System.out.println("Preencha todos os campos");
			return;
		}
		
		if(sexo.equals("masculino")) {
			sexoUsuario = Sexo.MASCULINO;
		}else {
			sexoUsuario = Sexo.FEMININO;
		}
		
		if(permissao.equals("cliente")) {
			permissaoUsuario = Permissao.CLIENTE;
		}else {
			permissaoUsuario = Permissao.PROPRIETARIO;
		}		
		
		SimpleDateFormat data = new SimpleDateFormat(dataNasc);
		
		
		this.setCodigoReserva(codigoReserva);
		this.setCpf(cpf);
		this.setDataNasc(data);
		this.setNome(nome);
		this.setEmail(email);
		this.setEndereco(endereco);
		this.setSenha(senha);
		this.setSexo(sexoUsuario);
		this.setTelefone(telefone);
		this.setPermissao(permissaoUsuario);
		
		System.out.println("User criado com sucesso");
	}
	
	public Hotel cadastraHotel(String nome, String endereco, String descricao, boolean pagamentoAnte) {
		boolean permissao = this.validarPermissao();
		boolean status = this.validarDadoHotel(nome, endereco, descricao);
		
		if(!permissao) {
			System.out.println("Acesso Negado");
			return null;
		}
		
		if(!status) {
			System.out.println("Preencha todos os campos");
			return null;
		}
		
		Hotel hotel = new Hotel(nome, endereco, descricao, pagamentoAnte);
		System.out.println("Hotel criado");
		return hotel;
	}
	
	private boolean validarDadoHotel(String nome, String endereco, String descricao) {
		boolean status = true;
		
		if(nome.isEmpty()) status = false;
		if(descricao.isEmpty()) status = false;
		if(endereco.isEmpty()) status = false;
		
		return status;
	}
	
	private boolean validarDados(String nome, String cpf, String dataNasc, String endereco, String telefone, String email,
			String sexo, String permissao, String codigoReserva, String senha) {
		boolean status = true;
		
		if(nome.isEmpty()) status = false;
		if(cpf.isEmpty()) status = false;
		if(dataNasc.isEmpty()) status = false;
		if(endereco.isEmpty()) status = false;
		if(telefone.isEmpty()) status = false;
		if(email.isEmpty()) status = false;
		if(sexo.isEmpty()) status = false;
		if(permissao.isEmpty()) status = false;
		if(codigoReserva.isEmpty()) status = false;
		if(senha.isEmpty()) status = false;
		
		return status;
	}
	
	public boolean validarPermissao() {
		boolean status = false;
		
		switch (this.permissao) {
		case PROPRIETARIO: {
			status = true;
			break;
		}
		default:
			status = false;
		}
		return status;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public SimpleDateFormat getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(SimpleDateFormat dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Permissao getPermissao() {
		return permissao;
	}

	public void setPermissao(Permissao permissao) {
		this.permissao = permissao;
	}

	public String getCodigoReserva() {
		return codigoReserva;
	}

	public void setCodigoReserva(String codigoReserva) {
		this.codigoReserva = codigoReserva;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
}
