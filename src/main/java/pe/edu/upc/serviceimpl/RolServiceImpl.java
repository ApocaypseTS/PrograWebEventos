package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IRolDao;
import pe.edu.upc.entity.Rol;
import pe.edu.upc.service.IRolService;

@Named
@RequestScoped
public class RolServiceImpl implements IRolService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IRolDao mD;

	@Override
	public void insertar(Rol rol) {
		mD.insertar(rol);		
	}

	@Override
	public List<Rol> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idRol) {
		mD.eliminar(idRol);		
	}
	

}
