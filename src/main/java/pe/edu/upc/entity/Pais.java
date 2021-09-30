package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Country")
public class Pais implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPais;
	
	@Column(name="nombrePais", nullable=false, length=45)
	private String nombrePais;
	
	@Column(name="nombreContinente", nullable=false, length=45)
	private String nombreContinente;

	public Pais() {
		super();
	}

	public Pais(int idPais, String nombrePais, String nombreContinente) {
		super();
		this.idPais = idPais;
		this.nombrePais = nombrePais;
		this.nombreContinente = nombreContinente;
	}

	public int getIdPais() {
		return idPais;
	}

	public void setIdPais(int idPais) {
		this.idPais = idPais;
	}

	public String getNombrePais() {
		return nombrePais;
	}

	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}

	public String getNombreContinente() {
		return nombreContinente;
	}

	public void setNombreContinente(String nombreContinente) {
		this.nombreContinente = nombreContinente;
	}

}
