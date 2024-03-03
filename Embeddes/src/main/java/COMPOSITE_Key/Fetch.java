package COMPOSITE_Key;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fetch {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("P");
		EntityManager em=emf.createEntityManager();
		
		User u=em.find(User.class, 1);
		System.out.println(u.getKey().getName());
		System.out.println(u.getKey().getAge());
		System.out.println(u.getKey().getMobile());
		System.out.println();
		
		CompositeKey ck=u.getKey();
		System.out.println(ck.getName());
		System.out.println(ck.getAge());
		System.out.println(ck.getMobile());
		
		
	}

}
