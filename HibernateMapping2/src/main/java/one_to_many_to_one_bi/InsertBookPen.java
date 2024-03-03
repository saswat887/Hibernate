package one_to_many_to_one_bi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertBookPen {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("P");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Box box=new Box();
		box.setId(3);
		box.setBoxName("Camlin");
		box.setBoxColor("Red");
		box.setPrice(10000);
		
		Pen p1=new Pen();
		p1.setId(104);
		p1.setName("Renoylds");
		p1.setPrice(10);
		
		Pen p2=new Pen();
		p2.setId(105);
		p2.setName("Cello");
		p2.setPrice(20);
		
		Pen p3=new Pen();
		p3.setId(106);
		p3.setName("Flair");
		p3.setPrice(30);
		
		//Box has many pen
		List<Pen> list=new ArrayList<Pen>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		//Box has many pens
		box.setPens(list);
		
		//Many pen has one box
		p1.setBox(box);
		p2.setBox(box);
		p3.setBox(box);
		
		et.begin();
		em.persist(box);
		et.commit();
	}

}
