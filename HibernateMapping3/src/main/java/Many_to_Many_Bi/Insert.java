package Many_to_Many_Bi;

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
		
		Student2 subham=new Student2(1, "subham", 20);
		Student2 biswajit=new Student2(2, "biswajit", 21);
		Student2 amaresh=new Student2(3, "amaresh", 23);
		
		Course2 html=new Course2(111, "html");
		Course2 css=new Course2(222, "css");
		Course2 js=new Course2(333, "js");
		Course2 java=new Course2(444, "java");
		Course2 python=new Course2(555, "python");
		Course2 kotlin=new Course2(666, "kotlin");
		Course2 react=new Course2(777, "react");
		
		List<Course2> subhamCourse=new ArrayList<Course2>();
		subhamCourse.add(html);
		subhamCourse.add(css);
		subhamCourse.add(java);
		
		List<Course2> biswajitCourse=new ArrayList<Course2>();
		biswajitCourse.add(html);
		biswajitCourse.add(css);
		biswajitCourse.add(js);
		biswajitCourse.add(python);
		
		List<Course2> amreshCourse=new ArrayList<Course2>();
		amreshCourse.add(html);
		amreshCourse.add(css);
		amreshCourse.add(kotlin);
		amreshCourse.add(react);
		
		List<Student2> htmlcssstudent=new ArrayList<Student2>();
		htmlcssstudent.add(subham);
		htmlcssstudent.add(biswajit);
		htmlcssstudent.add(amaresh);
		
		
		List<Student2> javastudent=new ArrayList<Student2>();
		javastudent.add(subham);
		
		List<Student2> jsstudent=new ArrayList<Student2>();
		javastudent.add(biswajit);
		
		List<Student2> kotlinstudent=new ArrayList<Student2>();
		javastudent.add(amaresh);
		
		List<Student2> pythonstudent=new ArrayList<Student2>();
		javastudent.add(biswajit);
		
		List<Student2> reactstudent=new ArrayList<Student2>();
		javastudent.add(amaresh);
		
		subham.setCourse(subhamCourse);
		biswajit.setCourse(biswajitCourse);
		amaresh.setCourse(amreshCourse);
		
		html.setStudents(htmlcssstudent);
		css.setStudents(htmlcssstudent);
		js.setStudents(jsstudent);
		java.setStudents(javastudent);
		kotlin.setStudents(kotlinstudent);
		python.setStudents(pythonstudent);
		react.setStudents(reactstudent);
		
		et.begin();
		em.persist(subham);
		em.persist(biswajit);
		em.persist(amaresh);
		
		et.commit();
		
		
	}

}
