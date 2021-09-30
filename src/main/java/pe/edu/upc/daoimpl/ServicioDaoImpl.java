package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IServicioDao;
import pe.edu.upc.entity.Servicio;

public class ServicioDaoImpl implements IServicioDao, Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Servicio servicio) {
		em.persist(servicio);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Servicio> listar() {
		List<Servicio> lista = new ArrayList<Servicio>();
		Query q = em.createQuery("select m from Motor m");
		lista = (List<Servicio>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override	
	public void eliminar(int idServicio) {
		Servicio servicio = new Servicio();
		servicio = em.getReference(Servicio.class, idServicio);
		em.remove(servicio);		
	}
	
}
