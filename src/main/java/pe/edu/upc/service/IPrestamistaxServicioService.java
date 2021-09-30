package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.PrestamistaxServicio;

public interface IPrestamistaxServicioService {
	public void insertar(PrestamistaxServicio prestamistaxServicio);
	public List<PrestamistaxServicio> listar();
	public void eliminar(int idPrestamistaxServicio);	
}
