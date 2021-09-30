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
@Table(name="Reserva")

public class Reserva implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idReserva;
	
	@ManyToOne
	@JoinColumn(name="idUsuario", nullable=false)
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name="idUbicacion", nullable=false)
	private Ubicacion ubicacion;
	
	@ManyToOne
	@JoinColumn(name="idPrestamistaxServicio", nullable=false)
	private PrestamistaxServicio prestamistaxServicio;
	
	private Date reserva;

	public Reserva() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reserva(int id, Usuario usuario, Ubicacion ubicacion, PrestamistaxServicio prestamistaxServicio,
			Date reserva) {
		super();
		this.idReserva = id;
		this.usuario = usuario;
		this.ubicacion = ubicacion;
		this.prestamistaxServicio = prestamistaxServicio;
		this.reserva = reserva;
	}

	public int getId() {
		return idReserva;
	}

	public void setId(int id) {
		this.idReserva = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Ubicacion getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}

	public PrestamistaxServicio getPrestamistaxServicio() {
		return prestamistaxServicio;
	}

	public void setPrestamistaxServicio(PrestamistaxServicio prestamistaxServicio) {
		this.prestamistaxServicio = prestamistaxServicio;
	}

	public Date getReserva() {
		return reserva;
	}

	public void setReserva(Date reserva) {
		this.reserva = reserva;
	}
	
	

}
