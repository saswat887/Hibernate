package COMPOSITE_Key;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertUser {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("P");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		CompositeKey ck=new CompositeKey();
		ck.setName("Sai");
		ck.setAge(25);
		ck.setMobile(7327858936l);
		
		User u=new User();
		u.setKey(ck);
		
		et.begin();
		em.persist(u);
		et.commit();
		
		System.out.println("Data Inserted");
	}

}

/*
 * Transient
 * Persist - Persist(),Merge()
 * Detach
 * Terminated
 * 
 *  
 */
