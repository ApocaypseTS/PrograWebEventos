package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Rol")

public class Rol implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRol;

	@Column(name = "Rol", nullable = false, length = 25)
	private String nombreRol;

	public Rol() {
		super();
	}

	public Rol(int id, String nombreRol) {
		super();
		this.idRol = id;
		this.nombreRol = nombreRol;
	}

	public int getId() {
		return idRol;
	}

	public void setId(int id) {
		this.idRol = id;
	}

	public String getNombreRol() {
		return nombreRol;
	}

	public void setNombreRol(String nombreRol) {
		this.nombreRol = nombreRol;
	}

}
