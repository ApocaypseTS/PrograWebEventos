package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Disponible")

public class Disponible implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idDisponible;
	
	@ManyToOne
	@JoinColumn(name="idPrestamistaxServicio", nullable=false)
	private PrestamistaxServicio prestamistaxServicio;
	
	private boolean disponible;
	
	private Date fechadisponible;

	public Disponible() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Disponible(int idDisponible, PrestamistaxServicio prestamistaxServicio, boolean disponible,
			Date fechadisponible) {
		super();
		this.idDisponible = idDisponible;
		this.prestamistaxServicio = prestamistaxServicio;
		this.disponible = disponible;
		this.fechadisponible = fechadisponible;
	}

	public int getIdDisponible() {
		return idDisponible;
	}

	public void setIdDisponible(int idDisponible) {
		this.idDisponible = idDisponible;
	}

	public PrestamistaxServicio getPrestamistaxServicio() {
		return prestamistaxServicio;
	}

	public void setPrestamistaxServicio(PrestamistaxServicio prestamistaxServicio) {
		this.prestamistaxServicio = prestamistaxServicio;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public Date getFechadisponible() {
		return fechadisponible;
	}

	public void setFechadisponible(Date fechadisponible) {
		this.fechadisponible = fechadisponible;
	}

	
	

}
