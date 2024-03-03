package one_to_one;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchALL {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("P");
		EntityManager em=emf.createEntityManager();
		
		String j="SELECT P FROM Person P";
		Query q=em.createQuery(j);
		
		List<Person> l=q.getResultList();
		
		for(Person p:l)
		{
			System.out.println("ID: "+p.getId());
			System.out.println("Name:"+p.getName());
			System.out.println("Age:"+p.getAge());
			Pan pan=p.getPan();
			
			System.out.println("PAN ID:"+pan.getId());
			System.out.println("PAN NUMBER:"+pan.getPanNum());
			
			System.out.println("=================================");
		}
	}

}
/*
 * Person has Pan
 * Phone has Battery
 * Human has heart
 */
