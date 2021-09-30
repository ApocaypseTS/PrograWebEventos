package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Disponible;

public interface IDisponibleDao {
	public void insertar(Disponible disponible);
	public List<Disponible> listar();
	public void eliminar(int idDisponible);		
}
