package one_to_one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class insertphone {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("P");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Battery b=new Battery();
		b.setId(4);
		b.setMah(4000);
		
		Phone p=new Phone();
		p.setId(104);
		p.setBrand("Apple");
		p.setModel("iphone 13");
		p.setBattery(b);
		
		et.begin();
		em.persist(p);
		em.persist(b);
		et.commit();
		
		System.out.println("Insertion Complete");
	}

}
