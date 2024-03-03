package one_to_many_to_one_bi;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAll {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("P");
		EntityManager em=emf.createEntityManager();
		String jpql="select b from Box b";
		Query query=em.createQuery(jpql);
		List<Box> box=query.getResultList();
		for (Box b : box) {
			System.out.println("Box Details:-");
			System.out.println(b.getBoxName());
			System.out.println(b.getBoxColor());
			System.out.println(b.getPrice());
			List<Pen> list=b.getPens();
			
			for(Pen l:list)
			{
				System.out.println("Pen Details:-");
				System.out.println(l.getName());
				System.out.println(l.getPrice());
				System.out.println("--------------------");
			}
		}
		System.out.println();
		System.out.println("*****************************************");
		System.out.println();
		String jpql1="select p from Pen p";
		Query query1=em.createQuery(jpql1);
		List<Pen> pen=query1.getResultList();
		for (Pen p : pen) 
		{
			System.out.println("Pen Details:-");
			System.out.println(p.getName());
			System.out.println(p.getPrice());
			System.out.println("Box Details:-");
			Box b1=p.getBox();
			System.out.println(b1.getBoxName());
			System.out.println(b1.getBoxColor());
			System.out.println(b1.getPrice());
			System.out.println("--------------------------------------");
		}
	}

}
