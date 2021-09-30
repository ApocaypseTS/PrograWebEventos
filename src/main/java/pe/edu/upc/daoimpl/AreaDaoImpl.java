package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IAreaDao;
import pe.edu.upc.entity.Area;

public class AreaDaoImpl implements IAreaDao, Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Area area) {
		em.persist(area);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Area> listar() {
		List<Area> lista = new ArrayList<Area>();
		Query q = em.createQuery("select a from Area a");
		lista = (List<Area>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override	
	public void eliminar(int idArea) {
		Area area = new Area();
		area = em.getReference(Area.class, idArea);
		em.remove(area);		
	}
	
}
