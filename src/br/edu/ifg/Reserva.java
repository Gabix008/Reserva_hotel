package br.edu.ifg;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class Reserva {
	private int id;
	private SimpleDateFormat dataInicio;
	private SimpleDateFormat dataFim;
	private double valorTotal;
	private boolean pago;
	private Usuario usuario;
	private Hotel hotel;
	private Quarto quarto;
	private ArquivoReserva bd;
	private ArquivoQuarto bdQuarto;

	public Reserva() {
		super();
		this.bd = new ArquivoReserva("BancoReserva.txt");
		this.bdQuarto = new ArquivoQuarto("BancoQuarto.txt");
	}

	public void CadastrarReserva(String dataInicio, String dataFim, Usuario usuario, Hotel hotel, Quarto quarto)
			throws ParseException {
		SimpleDateFormat dataInc = new SimpleDateFormat(dataInicio);
		SimpleDateFormat dataF = new SimpleDateFormat(dataFim);
		this.setDataInicio(dataInc);
		this.setDataFim(dataF);
		this.setValorTotal(quarto.getPreco());
		this.setUsuario(usuario);
		this.setHotel(hotel);
		this.setQuarto(quarto);
		this.setPago(false);
		this.setId(this.bd.novoID());
		boolean status = this.bd.verificarDisponibilidade(getDataInicio(), getDataFim(), hotel, quarto);
		if (!status) {
			System.out.println("Quarto indeisponivel");
			return;
		}
		this.bd.cadastrar(this.toString());
	}

	public void EditarReserva(int id, SimpleDateFormat dataInicio, SimpleDateFormat dataFim,
			Usuario usuario, Hotel hotel, Quarto quarto) {
		this.setReserva(id, dataInicio, dataFim, quarto.getPreco(), usuario, hotel, quarto);
	}

	public void setReserva(int id, SimpleDateFormat dataInicio, SimpleDateFormat dataFim, double valorTotal,
			Usuario usuario, Hotel hotel, Quarto quarto) {
		this.setId(id);
		this.setDataInicio(dataInicio);
		this.setDataFim(dataFim);
		this.setValorTotal(valorTotal);
		this.setUsuario(usuario);
		this.setHotel(hotel);
		this.setQuarto(quarto);
	}

	public Map<Integer, Reserva> getReservas(int idUsuario, Usuario usuario) {
		Map<Integer, Reserva> reservas = this.bd.getReservas(idUsuario, usuario);
		return reservas;
	}

	public void realizarPagamento() {
		this.setPago(true);
		this.bd.editar(id, this.toString());
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

	public Quarto getQuarto() {
		return quarto;
	}

	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}

	public boolean isPago() {
		return pago;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
	}

	@Override
	public String toString() {
		Date data = new Date();
		return id + "," + valorTotal + "," + dataInicio.format(data) + "," + dataFim.format(data) + "," + pago + ","
				+ usuario.getId() + "," + hotel.getId() + "," + quarto.getId();
	}

}
