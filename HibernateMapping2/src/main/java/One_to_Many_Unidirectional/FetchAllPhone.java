package One_to_Many_Unidirectional;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAllPhone {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("P");
		EntityManager em=emf.createEntityManager();
		String jpql="select p from Phone p";
		Query query=em.createQuery(jpql);
		List<Phone> list=query.getResultList();
		for (Phone p: list) {
			System.out.println("================");
			List<Sim> sims=p.getSims();
			System.out.println("Details:-");
			System.out.println(p.getName());
			System.out.println(p.getPrice());
			System.out.println(p.getColor());
			for (Sim s : sims)
			{
				System.out.println("--------------");
				System.out.println(s.getSimName());
				System.out.println(s.getSimNum());
				System.out.println("--------------");
			}
			System.out.println("================");
		}
	}

}
