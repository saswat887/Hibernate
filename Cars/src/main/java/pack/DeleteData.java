package pack;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteData {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("saswat");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Car c=em.find(Car.class, 3);
		
		et.begin();
		em.remove(c);
		et.commit();
		
		System.out.println("Data Deleted");
	}

}
