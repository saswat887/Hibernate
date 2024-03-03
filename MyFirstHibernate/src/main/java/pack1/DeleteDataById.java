package pack1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteDataById {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("karthik");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		User user=em.find(User.class, 2);
		et.begin();
		em.remove(user);
		et.commit();
		System.out.println("Data Deleted");
		
	}

}
