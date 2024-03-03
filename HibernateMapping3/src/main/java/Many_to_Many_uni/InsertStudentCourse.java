package Many_to_Many_uni;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertStudentCourse {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("P");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Student pragnya=new Student(1, "pagnya", 20);
		Student suchismita=new Student(2, "Suchismita", 23);
		Student jatin=new Student(3, "Jatin", 25);
		
		Course java=new Course(111, "JAVA");
		Course html=new Course(112, "HTML");
		Course css=new Course(113, "CSS");
		Course js=new Course(114, "JS");
		Course python=new Course(115, "PYTHON");
		
		List<Course> list1=new ArrayList<Course>();
		list1.add(java);
		list1.add(html);
		list1.add(css);
		
		List<Course> list2=new ArrayList<Course>();
		list2.add(java);
		list2.add(js);
		
		List<Course> list3=new ArrayList<Course>();
		list3.add(html);
		list3.add(css);
		list3.add(js);
		list3.add(python);
		
		pragnya.setCourse(list1);
		suchismita.setCourse(list2);
		jatin.setCourse(list3);
		
		et.begin();
		em.persist(pragnya);
		em.persist(suchismita);
		em.persist(jatin);
		em.persist(java);
		em.persist(html);
		em.persist(css);
		em.persist(js);
		em.persist(python);
		et.commit();
		
		
	}

}
