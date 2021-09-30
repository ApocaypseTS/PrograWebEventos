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
@Table(name="Servicio")

public class Servicio implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idServicio;
	
	@Column(name="Servicio", nullable=false, length=50)
	private String nombreServicio;
	
	@Column(name="descripcion", nullable=false, length=50)
	private String descripcion;
	
	@ManyToOne
	@JoinColumn(name="idArea", nullable=false)
	private Area area;

	public Servicio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Servicio(int id, String nombreServicio, String descripcion, Area area) {
		super();
		this.idServicio = id;
		this.nombreServicio = nombreServicio;
		this.descripcion = descripcion;
		this.area = area;
	}
	
	public int getIdServicio() {
		return idServicio;
	}

	public void setIdServicio(int idServicio) {
		this.idServicio = idServicio;
	}

	public String getNombreServicio() {
		return nombreServicio;
	}

	public void setNombreServicio(String nombreServicio) {
		this.nombreServicio = nombreServicio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	

}
