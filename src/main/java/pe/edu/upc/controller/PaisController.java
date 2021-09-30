package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Pais;
import pe.edu.upc.service.IPaisService;

@Named
@RequestScoped

public class PaisController implements Serializable {

	private static final long serialVersionUID = -3351318371418292111L;
	
	@Inject
	private IPaisService mService;
	
	private Pais pais;
	List<Pais> listaPaises;
	
	@PostConstruct
	public void init() {
		this.listaPaises = new ArrayList<Pais>();
		this.pais= new Pais();
		this.listar();
	}

	public String nuevoPais() {
		this.setPais(new Pais());
		return "pais.xhtml";
	}
	
	public void insertar() {
		mService.insertar(pais);
		limpiarPais();
	}
	
	public void listar() {
		listaPaises = mService.listar();
	}

	public void limpiarPais() {
		this.init();
	}
	
	public void eliminar(Pais pais) {
		mService.eliminar(pais.getIdPais());
		this.listar();
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public List<Pais> getListaPaises() {
		return listaPaises;
	}

	public void setListaPaises(List<Pais> listaPaises) {
		this.listaPaises = listaPaises;
	}
	
}
