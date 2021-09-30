package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.PrestamistaxServicio;

public interface IPrestamistaxServicioDao {
	public void insertar(PrestamistaxServicio prestamistaxServicio);
	public List<PrestamistaxServicio> listar();
	public void eliminar(int idPrestamistaxServicio);		
}
