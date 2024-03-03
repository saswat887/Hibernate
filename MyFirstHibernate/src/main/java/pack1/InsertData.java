package pack1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertData {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("karthik");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		User u=new User();
		u.setId(3);
		u.setName("Sai");
		u.setAge(25);
		u.setMobile(732785892l);
		
		et.begin();
		em.persist(u);
		et.commit();
		System.out.println("Data inserted");
		
	}

}
// create maven project table-laptop 5 column 3 rows 
// make example of car new maven project   3 columns 5 rows