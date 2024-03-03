package Assignment;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("P");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Student1 ramu=new Student1(1,"ramu",25);
		Student1 somu=new Student1(2,"somu",21);
		Student1 shyam=new Student1(3,"shyam",25);
		Student1 dhanu=new Student1(4,"dhanu",29);
		
		Course1 kotlin=new Course1(101, "Kotlin");
		Course1 cpp=new Course1(102, "C++");
		Course1 swing=new Course1(103, "Swing");
		Course1 dotnet=new Course1(104, "DotNet");
		Course1 react=new Course1(105, "React");
		Course1 spring=new Course1(106, "Spring");
		Course1 hibernate=new Course1(107, "Hibernate");
		
		List<Course1> list1=new ArrayList<Course1>();
		list1.add(kotlin);
		list1.add(swing);
		list1.add(dotnet);
		
		List<Course1> list2=new ArrayList<Course1>();
		list2.add(kotlin);
		list2.add(swing);
		list2.add(dotnet);
		
		List<Course1> list3=new ArrayList<Course1>();
		list3.add(swing);
		
		List<Course1> list4=new ArrayList<Course1>();
		list4.add(kotlin);
		list4.add(react);
		list4.add(spring);
		list4.add(hibernate);
		
		ramu.setCourse(list1);
		somu.setCourse(list2);
		shyam.setCourse(list3);
		dhanu.setCourse(list4);
		
		et.begin();
		em.persist(ramu);
		em.persist(somu);
		em.persist(shyam);
		em.persist(dhanu);
		em.persist(kotlin);
		em.persist(cpp);
		em.persist(swing);
		em.persist(dotnet);
		em.persist(react);
		em.persist(spring);
		em.persist(hibernate);
		et.commit();
	}

}
