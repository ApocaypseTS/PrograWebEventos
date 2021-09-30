package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Area;
import pe.edu.upc.entity.Servicio;
import pe.edu.upc.service.IAreaService;
import pe.edu.upc.service.IServicioService;

@Named
@RequestScoped

public class ServicioController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IServicioService mService;
	
	@Inject
	private IAreaService aService;
	private Servicio servicio;
	private Area area;
	List<Servicio> listaServicios;
	List<Area> listaAreas;
	
	@PostConstruct
	public void init() {
		this.listaServicios = new ArrayList<Servicio>();
		this.listaAreas = new ArrayList<Area>();
		this.servicio = new Servicio();
		this.area = new Area();
		this.listar();
		this.listarAreas();
	}
	
	public String nuevoServicio() {
		this.setServicio(new Servicio());
		return "motor.xhtml";
	}
	
	public void insertar() {
		mService.insertar(servicio);
		limpiarServicio();
	}
	
	public void listar() {
		listaServicios = mService.listar();
	}
	
	public void listarAreas() {
		listaAreas = aService.listar();
	}
	
	public void limpiarServicio() {
		this.init();
	}
	
	public void eliminar(Servicio servicio) {
		mService.eliminar(servicio.getIdServicio());
		this.listar();
	}
	
	
	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public List<Servicio> getListaServicios() {
		return listaServicios;
	}

	public void setListaServicios(List<Servicio> listaServicios) {
		this.listaServicios = listaServicios;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public List<Area> getListaAreas() {
		return listaAreas;
	}

	public void setListaAreas(List<Area> listaAreas) {
		this.listaAreas = listaAreas;
	}
	

}
