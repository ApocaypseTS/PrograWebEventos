package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Reserva;
import pe.edu.upc.service.IReservaService;

@Named
@RequestScoped

public class ReservaController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IReservaService mService;
	private Reserva reserva;
	List<Reserva> listaReservas;
	
	@PostConstruct
	public void init() {
		this.listaReservas = new ArrayList<Reserva>();
		this.reserva = new Reserva();
		this.listar();
	}
	
	public String nuevoReserva() {
		this.setReserva(new Reserva());
		return "reserva.xhtml";
	}
	
	public void insertar() {
		mService.insertar(reserva);
		limpiarReserva();
	}
	
	public void listar() {
		listaReservas = mService.listar();
	}

	public void limpiarReserva() {
		this.init();
	}
	
	public void eliminar(Reserva reserva) {
		mService.eliminar(reserva.getId());
		this.listar();
	}
	
	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	public List<Reserva> getListaReservas() {
		return listaReservas;
	}

	public void setListaReservas(List<Reserva> listaReservas) {
		this.listaReservas = listaReservas;
	}
	

}
