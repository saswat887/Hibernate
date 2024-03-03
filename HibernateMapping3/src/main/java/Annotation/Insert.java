package Annotation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("P");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		User u=new User();
		u.setName("Saswat");
		u.setAge(23);
		u.setMobile(111111);
		u.setPassword("111111");
		
		et.begin();
		em.persist(u);
		et.commit();
	}
}
