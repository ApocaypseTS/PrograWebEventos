package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Disponible;

public interface IDisponibleService {
	public void insertar(Disponible disponible);
	public List<Disponible> listar();
	public void eliminar(int idDisponible);	
}
