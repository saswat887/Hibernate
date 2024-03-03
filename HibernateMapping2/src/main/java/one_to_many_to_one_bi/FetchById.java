package one_to_many_to_one_bi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchById {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("P");
		EntityManager em=emf.createEntityManager();
		
		Box b=em.find(Box.class,1);
		
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
		}
		
		Pen p=em.find(Pen.class, 101);
		System.out.println("Pen Details:-");
		System.out.println(p.getName());
		System.out.println(p.getPrice());
		System.out.println("Box Details:-");
		Box b1=p.getBox();
		System.out.println(b1.getBoxName());
		System.out.println(b1.getBoxColor());
		System.out.println(b1.getPrice());
		
		
	}
}
