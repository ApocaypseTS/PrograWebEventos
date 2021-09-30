package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Disponible;
import pe.edu.upc.service.IDisponibleService;

@Named
@RequestScoped

public class DisponibleController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IDisponibleService mService;
	private Disponible disponible;
	List<Disponible> listaDisponibles;
	
	@PostConstruct
	public void init() {
		this.listaDisponibles = new ArrayList<Disponible>();
		this.disponible = new Disponible();
		this.listar();
	}
	
	public String nuevoDisponible() {
		this.setDisponible(new Disponible());
		return "disponible.xhtml";
	}
	
	public void insertar() {
		mService.insertar(disponible);
		limpiarDisponible();
	}
	
	public void listar() {
		listaDisponibles = mService.listar();
	}

	public void limpiarDisponible() {
		this.init();
	}
	
	public void eliminar(Disponible disponible) {
		mService.eliminar(disponible.getIdDisponible());
		this.listar();
	}
	
	public Disponible getDisponible() {
		return disponible;
	}

	public void setDisponible(Disponible disponible) {
		this.disponible = disponible;
	}

	public List<Disponible> getListaDisponibles() {
		return listaDisponibles;
	}

	public void setListaDisponibles(List<Disponible> listaDisponibles) {
		this.listaDisponibles = listaDisponibles;
	}
	

}
