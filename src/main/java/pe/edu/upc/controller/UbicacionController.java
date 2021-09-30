package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Ubicacion;
import pe.edu.upc.service.IUbicacionService;

@Named
@RequestScoped

public class UbicacionController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IUbicacionService mService;
	private Ubicacion ubicacion;
	List<Ubicacion> listaUbicaciones;
	
	@PostConstruct
	public void init() {
		this.listaUbicaciones = new ArrayList<Ubicacion>();
		this.ubicacion = new Ubicacion();
		this.listar();
	}
	
	public String nuevoUbicacion() {
		this.setUbicacion(new Ubicacion());
		return "ubicacion.xhtml";
	}
	
	public void insertar() {
		mService.insertar(ubicacion);
		limpiarUbicacion();
	}
	
	public void listar() {
		listaUbicaciones = mService.listar();
	}

	public void limpiarUbicacion() {
		this.init();
	}
	
	public void eliminar(Ubicacion ubicacion) {
		mService.eliminar(ubicacion.getId());
		this.listar();
	}
	
	public Ubicacion getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}

	public List<Ubicacion> getListaUbicaciones() {
		return listaUbicaciones;
	}

	public void setListaUbicaciones(List<Ubicacion> listaUbicaciones) {
		this.listaUbicaciones = listaUbicaciones;
	}
	

}
