	package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.PrestamistaxServicio;
import pe.edu.upc.service.IPrestamistaxServicioService;

@Named
@RequestScoped

public class PrestamistaxServicioController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IPrestamistaxServicioService mService;
	private PrestamistaxServicio prestamistaxServicio;
	List<PrestamistaxServicio> listaPrestamistaxServicios;
	
	@PostConstruct
	public void init() {
		this.listaPrestamistaxServicios = new ArrayList<PrestamistaxServicio>();
		this.prestamistaxServicio = new PrestamistaxServicio();
		this.listar();
	}
	
	public String nuevoPrestamistaxServicio() {
		this.setPrestamistaxServicio(new PrestamistaxServicio());
		return "parte.xhtml";
	}
	
	public void insertar() {
		mService.insertar(prestamistaxServicio);
		limpiarPrestamistaxServicio();
	}
	
	public void listar() {
		listaPrestamistaxServicios = mService.listar();
	}

	public void limpiarPrestamistaxServicio() {
		this.init();
	}
	
	public void eliminar(PrestamistaxServicio prestamistaxServicio) {
		mService.eliminar(prestamistaxServicio.getId());
		this.listar();
	}
	
	public PrestamistaxServicio getPrestamistaxServicio() {
		return prestamistaxServicio;
	}

	public void setPrestamistaxServicio(PrestamistaxServicio prestamistaxServicio) {
		this.prestamistaxServicio = prestamistaxServicio;
	}

	public List<PrestamistaxServicio> getListaPrestamistaxServicios() {
		return listaPrestamistaxServicios;
	}

	public void setListaPrestamistaxServicios(List<PrestamistaxServicio> listaPrestamistaxServicios) {
		this.listaPrestamistaxServicios = listaPrestamistaxServicios;
	}
	

}
