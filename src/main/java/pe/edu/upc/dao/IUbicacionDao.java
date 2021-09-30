package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Ubicacion;

public interface IUbicacionDao {
	public void insertar(Ubicacion ubicacion);
	public List<Ubicacion> listar();
	public void eliminar(int idUbicacion);		
}
