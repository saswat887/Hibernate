package pack1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchData {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("karthik");
		EntityManager em=emf.createEntityManager();
		User user=em.find(User.class, 3);
		if(user!=null) 
		{
			System.out.println(user.getId());
			System.out.println(user.getName());
			System.out.println(user.getAge());
			System.out.println(user.getMobile());
		}
		else {
			System.out.println("Id not found");
		}
	}

}
