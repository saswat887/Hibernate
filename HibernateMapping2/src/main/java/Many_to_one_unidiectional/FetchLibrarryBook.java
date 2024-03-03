package Many_to_one_unidiectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchLibrarryBook {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("P");
		EntityManager em=emf.createEntityManager();
		
		Book b=em.find(Book.class, 111);
		System.out.println("Book Details:-");
		System.out.println(b.getName());
		System.out.println(b.getAuthor());
		System.out.println(b.getPrice());
		System.out.println("Library Details:-");
		System.out.println(b.getLibrary().getName());
		System.out.println(b.getLibrary().getAddress());
		
		Library l=b.getLibrary();
		
		System.out.println(l.getName());
		System.out.println(l.getAddress());
	}

}
