package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IRolDao;
import pe.edu.upc.entity.Rol;

public class RolDaoImpl implements IRolDao, Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Rol rol) {
		em.persist(rol);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Rol> listar() {
		List<Rol> lista = new ArrayList<Rol>();
		Query q = em.createQuery("select r from Rol r");
		lista = (List<Rol>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override	
	public void eliminar(int idRol) {
		Rol rol = new Rol();
		rol = em.getReference(Rol.class, idRol);
		em.remove(rol);		
	}
	
}
