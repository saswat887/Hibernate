package Many_to_Many_uni;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchBYid {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("P");
		EntityManager em=emf.createEntityManager();
		
		Student s=em.find(Student.class, 1);
		
		System.out.println("Student Details");
		System.out.println(s.getName());
		System.out.println(s.getAge());
		
		List<Course> course=s.getCourse();
		System.out.println("Course Details");
		for (Course c : course) 
		{
			System.out.println(c.getCourseName());
		}
		
	}

}
