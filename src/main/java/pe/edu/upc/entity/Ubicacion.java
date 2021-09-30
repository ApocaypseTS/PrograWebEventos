package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Ubicacion")

public class Ubicacion implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idUbicacion;
	
	@Column(name="Distrito", nullable=false, length=50)
	private String nombreDistrito;
	
	@Column(name="Calle", nullable=false, length=50)
	private String nombreCalle;

	public Ubicacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ubicacion(int id, String nombreDistrito, String nombreCalle) {
		super();
		this.idUbicacion = id;
		this.nombreDistrito = nombreDistrito;
		this.nombreCalle = nombreCalle;
	}

	public int getId() {
		return idUbicacion;
	}

	public void setId(int id) {
		this.idUbicacion = id;
	}

	public String getNombreDistrito() {
		return nombreDistrito;
	}

	public void setNombreDistrito(String nombreDistrito) {
		this.nombreDistrito = nombreDistrito;
	}

	public String getNombreCalle() {
		return nombreCalle;
	}

	public void setNombreCalle(String nombreCalle) {
		this.nombreCalle = nombreCalle;
	}
	

}
