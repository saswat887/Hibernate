package pack1;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class FetchAllUser {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("karthik");
		EntityManager em=emf.createEntityManager();
		
		String jpql="SELECT u FROM User u";
		
		Query query=em.createQuery(jpql);
		
		List<User> list = query.getResultList();
		System.out.println(list);
		
		for(User user:list)
		{
			System.out.println(user.getId());
			System.out.println(user.getName());
			System.out.println(user.getAge());
			System.out.println(user.getMobile());
			System.out.println("---------------------");
		}
	}

}
