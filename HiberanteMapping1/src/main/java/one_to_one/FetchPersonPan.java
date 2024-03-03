package one_to_one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FetchPersonPan {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("P");
		EntityManager em=emf.createEntityManager();
		Person person=em.find(Person.class, 3);
		
		System.out.println("ID: "+person.getId());
		System.out.println("Name:"+person.getName());
		System.out.println("Age:"+person.getAge());
		
		Pan pan=person.getPan();
		
		System.out.println("PAN ID:"+pan.getId());
		System.out.println("PAN NUMBER:"+pan.getPanNum());
	}

}
