package one_to_one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertPersonPan {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("P");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Pan p=new Pan();
		p.setId(106);
		p.setPanNum("qazxs9876e");
		
		Person pe=new Person();
		pe.setId(6);
		pe.setName("Suvendu");
		pe.setAge(30);
		pe.setPan(p);
		
		et.begin();
		em.persist(pe);
		em.persist(p);
		et.commit();
		
		System.out.println("Insert Successful");
	}

}
