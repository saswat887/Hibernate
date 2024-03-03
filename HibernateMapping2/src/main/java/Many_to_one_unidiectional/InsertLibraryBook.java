package Many_to_one_unidiectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertLibraryBook {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("P");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Library jspider=new Library();
		jspider.setId(2);
		jspider.setName("Jspiders");
		jspider.setAddress("Fire Station");
		
		Book java=new Book();
		java.setId(114);
		java.setName("Java");
		java.setAuthor("Bond 007");
		java.setPrice(2000000);
		
		Book python=new Book();
		python.setId(115);
		python.setName("Python");
		python.setAuthor("James");
		python.setPrice(5000000);
		
		Book cpp=new Book();
		cpp.setId(116);
		cpp.setName("C++");
		cpp.setAuthor("Dennis");
		cpp.setPrice(10000000);
		
		java.setLibrary(jspider);
		python.setLibrary(jspider);
		cpp.setLibrary(jspider);
		
		et.begin();
		em.persist(jspider);
		em.persist(java);
		em.persist(python);
		em.persist(cpp);
		et.commit();
		
		System.out.println("DATA INSERTED");
		
	}

}
