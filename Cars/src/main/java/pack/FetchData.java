package pack;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchData {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("saswat");
		EntityManager em = emf.createEntityManager();

		Car c = em.find(Car.class, 2);
		if (c != null) {
			System.out.println(c.getId());
			System.out.println(c.getBrand());
			System.out.println(c.getModel());
		}
		else
		{
			System.out.println("Data Not Found");
		}
	}

}
