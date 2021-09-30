package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Motor;
import pe.edu.upc.entity.Parte;

import pe.edu.upc.service.IMotorService;
import pe.edu.upc.service.IParteService;

@Named
@RequestScoped

public class ParteController implements Serializable {

	private static final long serialVersionUID = -3351318371418292111L;

	@Inject
	private IMotorService mService;
	
	@Inject
	private IParteService pService;
	
	private Motor motor;
	private Parte parte;
	
	List<Motor> listaMotores;
	List<Parte> listaPartes;	
	
	
	@PostConstruct
	public void init() {		
		this.listaMotores = new ArrayList<Motor>();
		this.listaPartes = new ArrayList<Parte>();		
		this.motor = new Motor();
		this.parte= new Parte();		
		this.listar();
		this.listarParte();
	}

	public String nuevoParte() {
		this.setParte(new Parte());
		return "parte.xhtml";
	}
	
	public void insertar() {
		pService.insertar(parte);		
		limpiarParte();
		this.listarParte();
	}
	
	public void listar() {
		listaMotores = mService.listar();
	}

	public void listarParte() {
		listaPartes = pService.listar();
	}	
	public void limpiarParte() {
		this.init();
	}
	
	public void eliminar(Parte parte) {
		pService.eliminar(parte.getIdParte());
		this.listarParte();
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Parte getParte() {
		return parte;
	}

	public void setParte(Parte parte) {
		this.parte = parte;
	}

	public List<Motor> getListaMotores() {
		return listaMotores;
	}

	public void setListaMotores(List<Motor> listaMotores) {
		this.listaMotores = listaMotores;
	}

	public List<Parte> getListaPartes() {
		return listaPartes;
	}

	public void setListaPartes(List<Parte> listaPartes) {
		this.listaPartes = listaPartes;
	}

}
