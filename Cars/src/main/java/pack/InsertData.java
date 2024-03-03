package pack;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertData {
	public static void main(String[] args) {
		EntityManagerFactory emp=Persistence.createEntityManagerFactory("saswat");
		EntityManager em=emp.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Car c=new Car();
		c.setId(5);
		c.setBrand("Mercedes");
		c.setModel("S-Class");
		
		et.begin();
		em.persist(c);
		et.commit();
		
		System.out.println("Data Entered");
	}

}
