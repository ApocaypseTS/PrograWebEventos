package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Rol;
import pe.edu.upc.entity.Usuario;
import pe.edu.upc.service.IRolService;
import pe.edu.upc.service.IUsuarioService;

@Named
@RequestScoped

public class UsuarioController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IUsuarioService mService;
	
	@Inject
	private IRolService rService;
	private Usuario usuario;
	private Rol rol;
	List<Usuario> listaUsuarios;
	List<Rol> listaRoles;
	
	@PostConstruct
	public void init() {
		this.listaUsuarios = new ArrayList<Usuario>();
		this.usuario = new Usuario();
		this.rol = new Rol();
		this.listar();
		this.listarRoles();
	}
	
	public String nuevoUsuario() {
		this.setUsuario(new Usuario());
		return "usuario.xhtml";
	}
	
	public void insertar() {
		mService.insertar(usuario);
		limpiarUsuario();
	}
	
	public void listar() {
		listaUsuarios = mService.listar();
	}
	
	public void listarRoles() {
		listaRoles = rService.listar();
	}

	public void limpiarUsuario() {
		this.init();
	}
	
	public void eliminar(Usuario usuario) {
		mService.eliminar(usuario.getIdUsuario());
		this.listar();
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
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
