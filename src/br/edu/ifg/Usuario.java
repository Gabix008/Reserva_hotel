package br.edu.ifg;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class Usuario {
	private int id;
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
	private ArquivoUsuario bd;
	
	public Usuario() {
		super();
		this.bd = new ArquivoUsuario("BancoUsuario.txt");
	}
	
	public void login(String email, String senha) {
		if(email.isEmpty()) {
			System.out.println("Preencha todos os campos");
			return;
		}
		
		if(senha.isEmpty()) {
			System.out.println("Preencha todos os campos");
			return;
		}
		
		this.bd.realizaLoginUsuario(this, email, senha);
		System.out.println("login feito");
	}
	
	public void cadastrar(String nome, String cpf, String dataNasc, String endereco, String telefone, String email,
			String sexo, String permissao, String codigoReserva, String senha) {
		int id = this.bd.novoID();
		this.adicionarDados(id, nome, cpf, dataNasc, endereco, telefone, email, sexo, permissao, codigoReserva, senha);
		this.bd.cadastrar(this.toString());		
		System.out.println("User criado com sucesso");
	}
	
	public void editarUsuario(int id, String nome, String cpf, String dataNasc, String endereco, String telefone, String email,
			String sexo, String permissao, String codigoReserva, String senha) {
		
		this.adicionarDados(id, nome, cpf, dataNasc, endereco, telefone, email, sexo, permissao, codigoReserva, senha);
		this.bd.editar(id,this.toString());
		
		System.out.println("User editado com sucesso");
	}
	
	public void excluir(int id) {
		this.bd.excluir(id);
	}
	
	public void adicionarDados(int id, String nome, String cpf, String dataNasc, String endereco, String telefone, String email,
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
		
		this.setId(id);
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		Date dataFormatada = new Date();
		return id+","+ nome + ",:" + cpf + "," + dataNasc.format(dataFormatada) + "," + endereco
				+"," + telefone + "," + email + "," + sexo + "," + permissao
				+ "," + codigoReserva + "," + senha;
	}
	
}
