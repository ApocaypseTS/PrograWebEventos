package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IPrestamistaxServicioDao;
import pe.edu.upc.entity.PrestamistaxServicio;
import pe.edu.upc.service.IPrestamistaxServicioService;

@Named
@RequestScoped
public class PrestamistaxServicioServiceImpl implements IPrestamistaxServicioService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IPrestamistaxServicioDao mD;

	@Override
	public void insertar(PrestamistaxServicio prestamistaxServicio) {
		mD.insertar(prestamistaxServicio);		
	}

	@Override
	public List<PrestamistaxServicio> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idPrestamistaxServicio) {
		mD.eliminar(idPrestamistaxServicio);		
	}
	

}
