package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Area;
import pe.edu.upc.service.IAreaService;

@Named
@RequestScoped

public class AreaController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IAreaService mService;
	private Area area;
	List<Area> listaAreas;
	
	@PostConstruct
	public void init() {
		this.listaAreas = new ArrayList<Area>();
		this.area = new Area();
		this.listar();
	}
	
	public String nuevoArea() {
		this.setArea(new Area());
		return "area.xhtml";
	}
	
	public void insertar() {
		mService.insertar(area);
		limpiarArea();
	}
	
	public void listar() {
		listaAreas = mService.listar();
	}

	public void limpiarArea() {
		this.init();
	}
	
	public void eliminar(Area area) {
		mService.eliminar(area.getId());
		this.listar();
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
