package edu.fatec.dao;

public class DAOFactory {
	
	public static <T extends GenericDAO<T>> T fabrica(Class<T> dao) {
		try {
			return dao.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends GenericDAO<T>> T fabrica() {
		return (T) DAOFactory.fabrica(GenericDAOImpl.class);
	}
	
}
