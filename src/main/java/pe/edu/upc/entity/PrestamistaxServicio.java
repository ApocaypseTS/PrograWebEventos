package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PrestamistaxServicio")

public class PrestamistaxServicio implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPrestamistaxServicio;
	
	@Column(name="reseña", nullable=false, length=50)
	private String resenia;
	
	@ManyToOne
	@JoinColumn(name="idUsuario", nullable=false)
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name="idServicio", nullable=false)
	private Servicio servicio;
	
	
	private int precio;


	public PrestamistaxServicio() {
		super();
		// TODO Auto-generated constructor stub
	}


	public PrestamistaxServicio(int id, String resenia, Usuario usuario, Servicio servicio, int precio) {
		super();
		this.idPrestamistaxServicio = id;
		this.resenia = resenia;
		this.usuario = usuario;
		this.servicio = servicio;
		this.precio = precio;
	}


	public int getId() {
		return idPrestamistaxServicio;
	}


	public void setId(int id) {
		this.idPrestamistaxServicio = id;
	}


	public String getResenia() {
		return resenia;
	}


	public void setResenia(String resenia) {
		this.resenia = resenia;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public Servicio getServicio() {
		return servicio;
	}


	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}

	

}
