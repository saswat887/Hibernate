package Many_to_one_unidiectional;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAllUser {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("P");
		EntityManager em=emf.createEntityManager();
		
		String jpql="select b from Book b";
		Query query=em.createQuery(jpql);
		List<Book> l=query.getResultList();
		
		for(Book b:l)
		{
			System.out.println("Book Details:-");
			System.out.println(b.getName());
			System.out.println(b.getAuthor());
			System.out.println(b.getPrice());
			Library l1=b.getLibrary();
			
			System.out.println(l1.getName());
			System.out.println(l1.getAddress());
			
			System.out.println("-------");
		}
	}

}
