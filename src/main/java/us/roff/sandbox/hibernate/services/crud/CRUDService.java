package us.roff.sandbox.hibernate.services.crud;

import java.util.List;

public interface CRUDService<T> {

	List<?> listAll();
	
	T getById(Integer id);
	
	T saveOrUpdate(T domainObject);
	
	void deleteById(Integer id);
}
