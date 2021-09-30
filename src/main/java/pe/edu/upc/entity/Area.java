package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Area")

public class Area implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idArea;

	@Column(name = "Area", nullable = false, length = 50)
	private String nombreArea;

	public Area() {
		super();
	}

	public Area(int idArea, String nombreArea) {
		super();
		this.idArea = idArea;
		this.nombreArea = nombreArea;
	}

	public int getId() {
		return idArea;
	}

	public void setId(int id) {
		this.idArea = id;
	}

	public String getNombreArea() {
		return nombreArea;
	}

	public void setNombreArea(String nombreArea) {
		this.nombreArea = nombreArea;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idArea, nombreArea);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Area other = (Area) obj;
		return idArea == other.idArea && Objects.equals(nombreArea, other.nombreArea);
	}

}
