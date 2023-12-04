package br.edu.ifg;

import java.util.HashMap;
import java.util.Map;

public class Hotel {
	private int id;
	private String nome;
	private String endereco;
	private String cidade;
	private Map<Integer, Quarto> quartos = new HashMap<>();
	private String descricao;
	private boolean pagamentoAnte;
	private int idUsuario;
	private ArquivoHotel bd;
	private ArquivoQuarto bdQuarto;

	public Hotel() {
		super();
		this.bd = new ArquivoHotel("BancoHotel.txt");
		this.bdQuarto = new ArquivoQuarto("BancoQuarto.txt");
	}

	public void cadastrar(String nome, String endereco, String descricao, String cidade, boolean pagamentoAnte,
			int idUsuario) {
		this.setNome(nome);
		this.setPagamentoAnte(pagamentoAnte);
		this.setDescricao(descricao);
		this.setEndereco(endereco);
		this.setCidade(cidade.toLowerCase());
		this.setIdUsuario(idUsuario);
		this.setId(this.bd.novoID());
		this.bd.cadastrar(this.toString());
	}

	public void cadastrarQuarto(Usuario usuario, double preco, String decricao, int qtdCamaCasal, int qtdCamaSolterio) {
		boolean permissao = usuario.validarPermissao();
		boolean status = this.validarDados(preco, decricao, qtdCamaCasal, qtdCamaSolterio);
		Map<Integer, Quarto> quartos = new HashMap<>();

		if (!permissao) {
			System.out.println("Acesso Negado");
			return;
		}

		if (!status) {
			System.out.println("Preencha todos os campos");
			return;
		}

		Quarto quarto = new Quarto();
		quarto.cadastrar(preco, decricao, qtdCamaCasal, qtdCamaSolterio, this.getId());

		quartos.put(this.getQuartos().size() + 1, quarto);

		System.out.println("Quarto criado");
	}

	public Map<Integer, Hotel> buscarHoteis(String cidade) {
		Map<Integer, Hotel> hoteis = new HashMap<>();

		hoteis = this.bd.buscarHoteis(cidade);

		return hoteis;
	}

	public void buscarHotel(int id) {
		this.bd.buscarHotel(id, this);
	}

	public void editar(Usuario usuario, int id, String nome, String endereco, String descricao, String cidade,
			boolean pagamentoAnte) {
		boolean permissao = usuario.validarPermissao();

		if (!permissao) {
			System.out.println("Acesso Negado");
			return;
		}

		this.buscarHotel(id);
		System.out.println(this.getCidade());
		if (this.cidade == null || this.cidade.isEmpty()) {
			System.out.println("Hotel não encontrado");
			return;
		}
		this.setHotel(id, nome, endereco, descricao, cidade, pagamentoAnte, usuario.getId());
		this.bd.editar(id, this.toString());
		System.out.println("Hotel editado com sucesso!");
	}

	public void excluir(int id, Usuario usuario) {
		boolean permissao = usuario.validarPermissao();

		if (!permissao) {
			System.out.println("Acesso Negado");
			return;
		}

		this.buscarHotel(id);
		System.out.println(this.toString());
		if (this.cidade == null || this.cidade.isEmpty()) {
			System.out.println("Hotel não encontrado");
			return;
		}
		this.bd.excluir(id);
	}

	public void setHotel(int id, String nome, String endereco, String descricao, String cidade, boolean pagamentoAnte,
			int idUsuario) {
		this.setNome(nome);
		this.setPagamentoAnte(pagamentoAnte);
		this.setDescricao(descricao);
		this.setEndereco(endereco);
		this.setCidade(cidade);
		this.setIdUsuario(idUsuario);
		this.setId(id);
	}

	public void buscarQuartos() {
		this.bdQuarto.buscarTodos(this, this.getId());
	}

	public void editarQuarto(Usuario usuario, int idQuarto, double preco, String decricao, int qtdCamaCasal,
			int qtdCamaSolterio) {
		boolean permissao = usuario.validarPermissao();
		boolean status = this.validarDados(preco, decricao, qtdCamaCasal, qtdCamaSolterio);

		if (!permissao) {
			System.out.println("Acesso Negado");
			return;
		}

		if (!status) {
			System.out.println("Preencha todos os campos");
			return;
		}

		this.getQuartos().get(idQuarto).editar(idQuarto, preco, decricao, qtdCamaCasal, qtdCamaSolterio,
				qtdCamaSolterio);
	}

	public boolean fazerReserva(int id) {
		Quarto quarto = quartos.get(id);
		if (quarto != null && quarto.isDisponivel()) {
			quarto.reserva();
			System.out.println("Reserva do quarto " + id + " feita com sucesso.");
			return true;
		} else {
			System.out.println("Nao foi possivel fazer a reserva do quarto " + id + ".");
			return false;
		}
	}

	public void liberarQuarto(int id) {
		for (Quarto quarto : quartos.values()) {
			if (quartos.containsKey(id)) {
				quarto.libera();
				System.out.println("Quarto " + id + " liberado com sucesso.");
				break;
			}
			System.out.println("Nao foi possivel liberar o quarto " + id + ".");
		}
	}

	private boolean validarDados(double preco, String decricao, int qtdCamaCasal, int qtdCamaSolterio) {
		boolean status = true;

		if (decricao.isEmpty())
			status = false;
		if (preco < 0)
			status = false;
		if ((qtdCamaCasal + qtdCamaSolterio) <= 1)
			status = false;

		return status;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Map<Integer, Quarto> getQuartos() {
		return quartos;
	}

	public void setQuartos(Map<Integer, Quarto> quartos) {
		this.quartos = quartos;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isPagamentoAnte() {
		return pagamentoAnte;
	}

	public void setPagamentoAnte(boolean pagamentoAnte) {
		this.pagamentoAnte = pagamentoAnte;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	@Override
	public String toString() {
		return id + "," + nome + "," + cidade + "," + endereco + "," + descricao + "," + pagamentoAnte + ","
				+ idUsuario;
	}

}
