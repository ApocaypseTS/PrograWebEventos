package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IUbicacionDao;
import pe.edu.upc.entity.Ubicacion;

public class UbicacionDaoImpl implements IUbicacionDao, Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Ubicacion ubicacion) {
		em.persist(ubicacion);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Ubicacion> listar() {
		List<Ubicacion> lista = new ArrayList<Ubicacion>();
		Query q = em.createQuery("select u from Ubicacion u");
		lista = (List<Ubicacion>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override	
	public void eliminar(int idUbicacion) {
		Ubicacion ubicacion = new Ubicacion();
		ubicacion = em.getReference(Ubicacion.class, idUbicacion);
		em.remove(ubicacion);		
	}
	
}
