package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Rol;
import pe.edu.upc.service.IRolService;

@Named
@RequestScoped

public class RolController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IRolService mService;
	private Rol rol;
	List<Rol> listaRoles;
	
	@PostConstruct
	public void init() {
		this.listaRoles = new ArrayList<Rol>();
		this.rol = new Rol();
		this.listar();
	}
	
	public String nuevoRol() {
		this.setRol(new Rol());
		return "rol.xhtml";
	}
	
	public void insertar() {
		mService.insertar(rol);
		limpiarRol();
	}
	
	public void listar() {
		listaRoles = mService.listar();
	}

	public void limpiarRol() {
		this.init();
	}
	
	public void eliminar(Rol rol) {
		mService.eliminar(rol.getId());
		this.listar();
	}
	
	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public List<Rol> getListaRoles() {
		return listaRoles;
	}

	public void setListaRoles(List<Rol> listaRoles) {
		this.listaRoles = listaRoles;
	}
	

}
