package pack1;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchUserByName {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("karthik");
		EntityManager em=emf.createEntityManager();
		String jpql="select u from User u where u.name=?1";
		Query query=em.createQuery(jpql);
		query.setParameter(1, "Saswat");

		List<User> list = query.getResultList();	
		//int id=0;
		for(User user:list)
		{
			//id=user.getId();
			System.out.println(user.getId());
			System.out.println(user.getName());
			System.out.println(user.getAge());
			System.out.println(user.getMobile());
			System.out.println("---------------------");
		}
	//	System.out.println(id);
	}

}
