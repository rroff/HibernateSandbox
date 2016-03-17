package us.roff.sandbox.hibernate.services.jpa.crud;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Service;

import us.roff.sandbox.hibernate.domain.Value;
import us.roff.sandbox.hibernate.services.crud.ValueService;
import us.roff.sandbox.hibernate.services.jpa.AbstractJpaDaoService;

@Service
public class ValueServiceJpaDaoImpl extends AbstractJpaDaoService implements ValueService {

	@Override
	public List<Value> listAll() {
		EntityManager em = emf.createEntityManager();
		return em.createQuery("FROM Value", Value.class).getResultList();
	}
	
	@Override
	public Value getById(Integer id) {
		EntityManager em = emf.createEntityManager();
		return em.find(Value.class, id);
	}
	
	@Override
	public Value saveOrUpdate(Value value) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		Value savedValue = em.merge(value);
		em.getTransaction().commit();
		
		return savedValue;
	}
	
	@Override
	public void deleteById(Integer id) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.remove(em.find(Value.class, id));
		em.getTransaction().commit();
	}
}
