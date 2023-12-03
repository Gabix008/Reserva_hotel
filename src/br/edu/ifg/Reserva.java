package br.edu.ifg;

import java.text.SimpleDateFormat;

public class Reserva {
	private int id;
	private SimpleDateFormat dataInicio;
	private SimpleDateFormat dataFim;
	private double valorTotal;
	private Usuario usuario;
	private Hotel hotel;
	
	public Reserva() {
		super();
	}
	public void CadastrarReserva(int id, SimpleDateFormat dataInicio, SimpleDateFormat dataFim, double valorTotal, Usuario usuario,
			Hotel hotel) {
		
		this.setDataInicio(dataInicio);
		this.setDataFim(dataFim);
		this.setValorTotal(valorTotal);
		this.setUsuario(usuario);
		this.setHotel(hotel);
	}
	
	public void EditarReserva(int id, SimpleDateFormat dataInicio, SimpleDateFormat dataFim, double valorTotal, Usuario usuario,
			Hotel hotel) {
		this.setReserva(id,dataInicio,dataFim, valorTotal, usuario, hotel);
	
	}
	
	public void setReserva(int id, SimpleDateFormat dataInicio, SimpleDateFormat dataFim, double valorTotal, Usuario usuario,
			Hotel hotel) {
		this.setId(id);
		this.setDataInicio(dataInicio);
		this.setDataFim(dataFim);
		this.setValorTotal(valorTotal);
		this.setUsuario(usuario);
		this.setHotel(hotel);
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public SimpleDateFormat getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(SimpleDateFormat dataInicio) {
		this.dataInicio = dataInicio;
	}

	public SimpleDateFormat getDataFim() {
		return dataFim;
	}

	public void setDataFim(SimpleDateFormat dataFim) {
		this.dataFim = dataFim;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	
}
