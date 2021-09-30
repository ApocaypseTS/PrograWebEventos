package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IDisponibleDao;
import pe.edu.upc.entity.Disponible;
import pe.edu.upc.service.IDisponibleService;

@Named
@RequestScoped
public class DisponibleServiceImpl implements IDisponibleService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IDisponibleDao mD;

	@Override
	public void insertar(Disponible disponible) {
		mD.insertar(disponible);		
	}

	@Override
	public List<Disponible> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idDisponible) {
		mD.eliminar(idDisponible);		
	}
	

}
