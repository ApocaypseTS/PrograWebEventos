package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IDisponibleDao;
import pe.edu.upc.entity.Disponible;

public class DisponibleDaoImpl implements IDisponibleDao, Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Disponible disponible) {
		em.persist(disponible);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Disponible> listar() {
		List<Disponible> lista = new ArrayList<Disponible>();
		Query q = em.createQuery("select m from Motor m");
		lista = (List<Disponible>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override	
	public void eliminar(int idDisponible) {
		Disponible motor = new Disponible();
		motor = em.getReference(Disponible.class, idDisponible);
		em.remove(motor);		
	}
	
}
