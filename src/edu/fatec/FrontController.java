package edu.fatec;

import edu.fatec.dao.GenericDAO;
import edu.fatec.dao.GenericDAOImpl;
import edu.fatec.model.Nota;

public class FrontController {

	public static void main(String[] args) {
		
		GenericDAO dao = new GenericDAOImpl<Nota>();
	}
}
