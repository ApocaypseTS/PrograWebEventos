package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Motor")
public class Motor implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="nombreMotor", nullable=false, length=30)
	private String nombreMotor;
	
	private Date fechaMotor;

	public Motor() {
		super();
	}

	public Motor(int id, String nombreMotor, Date fechaMotor) {
		super();
		this.id = id;
		this.nombreMotor = nombreMotor;
		this.fechaMotor = fechaMotor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreMotor() {
		return nombreMotor;
	}

	public void setNombreMotor(String nombreMotor) {
		this.nombreMotor = nombreMotor;
	}

	public Date getFechaMotor() {
		return fechaMotor;
	}

	public void setFechaMotor(Date fechaMotor) {
		this.fechaMotor = fechaMotor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fechaMotor == null) ? 0 : fechaMotor.hashCode());
		result = prime * result + id;
		result = prime * result + ((nombreMotor == null) ? 0 : nombreMotor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Motor other = (Motor) obj;
		if (fechaMotor == null) {
			if (other.fechaMotor != null)
				return false;
		} else if (!fechaMotor.equals(other.fechaMotor))
			return false;
		if (id != other.id)
			return false;
		if (nombreMotor == null) {
			if (other.nombreMotor != null)
				return false;
		} else if (!nombreMotor.equals(other.nombreMotor))
			return false;
		return true;
	}
	
	
}
