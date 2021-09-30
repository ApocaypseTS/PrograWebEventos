package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IUbicacionDao;
import pe.edu.upc.entity.Ubicacion;
import pe.edu.upc.service.IUbicacionService;

@Named
@RequestScoped
public class UbicacionServiceImpl implements IUbicacionService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IUbicacionDao mD;

	@Override
	public void insertar(Ubicacion ubicacion) {
		mD.insertar(ubicacion);		
	}

	@Override
	public List<Ubicacion> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idUbicacion) {
		mD.eliminar(idUbicacion);		
	}
	

}
