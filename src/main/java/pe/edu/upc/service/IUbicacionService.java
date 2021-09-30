package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Ubicacion;

public interface IUbicacionService {
	public void insertar(Ubicacion ubicacion);
	public List<Ubicacion> listar();
	public void eliminar(int idUbicacion);	
}
