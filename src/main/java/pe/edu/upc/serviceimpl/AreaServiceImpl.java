package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IAreaDao;
import pe.edu.upc.entity.Area;
import pe.edu.upc.service.IAreaService;

@Named
@RequestScoped
public class AreaServiceImpl implements IAreaService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IAreaDao mD;

	@Override
	public void insertar(Area area) {
		mD.insertar(area);		
	}

	@Override
	public List<Area> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idArea) {
		mD.eliminar(idArea);		
	}
	

}
