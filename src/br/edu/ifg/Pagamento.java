package br.edu.ifg;

public class Pagamento {
	private String nome;
	private Reserva reserva;
	
	public Pagamento(String nome, Reserva reserva) {
		super();
		this.nome = nome;
		this.reserva = reserva;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Reserva getReserva() {
		return reserva;
	}
	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}
	
	
}
