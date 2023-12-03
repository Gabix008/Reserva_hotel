package br.edu.ifg;

public class Quarto {
	private double preco;
	private String decricao;
	private int qtdCamaCasal;
	private int qtdCamaSolteiro;
	private int id;
	private int idHotel;
	private boolean disponivel;
	private ArquivoQuarto bd;
	
	public Quarto() {
		super();
		this.bd = new ArquivoQuarto("BancoQuarto.txt");		
	}
	
	public void cadastrar(double preco, String decricao, int qtdCamaCasal, int qtdCamaSolteiro, int idHotel) {
		this.setDecricao(decricao);
		this.setId(this.bd.novoID());
		this.setPreco(preco);
		this.setQtdCamaCasal(qtdCamaCasal);
		this.setQtdCamaSolteiro(qtdCamaSolteiro);
		this.setIdHotel(idHotel);
		this.setDisponivel(true);
		this.bd.cadastrar(this.toString());
	}
	
	public void editar(int id, double preco, String decricao, int qtdCamaCasal, int qtdCamaSolteiro, int idHotel) {
		this.setQuarto(id, preco, decricao, disponivel, qtdCamaCasal, qtdCamaSolteiro, idHotel);
		this.bd.editar(id, this.toString());
	}
	
	public void setQuarto(int id, double preco, String decricao, boolean disponivel, int qtdCamaCasal, int qtdCamaSolteiro, int idHotel) {
		this.setDecricao(decricao);
		this.setId(id);
		this.setPreco(preco);
		this.setDisponivel(disponivel);
		this.setQtdCamaCasal(qtdCamaCasal);
		this.setQtdCamaSolteiro(qtdCamaSolteiro);
		this.setIdHotel(idHotel);
	}
	
	public void buscar(int id) {
		this.bd.buscarQuarto(this, id);
	}

	public boolean isDisponivel() {
		// TODO Auto-generated method stub
		return disponivel;
	}

	public void reserva() {
        this.disponivel = false;
    }

	public void libera() {
		this.disponivel = true;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	

	public int getQtdCamaCasal() {
		return qtdCamaCasal;
	}

	public void setQtdCamaCasal(int qtdCamaCasal) {
		this.qtdCamaCasal = qtdCamaCasal;
	}

	public int getQtdCamaSolteiro() {
		return qtdCamaSolteiro;
	}

	public void setQtdCamaSolteiro(int qtdCamaSolteiro) {
		this.qtdCamaSolteiro = qtdCamaSolteiro;
	}

	@Override
	public String toString() {
		return id+"," + decricao +"," + qtdCamaCasal+","+qtdCamaSolteiro+","+ disponivel +"," + preco +"," + idHotel;
	}
	
	
}
