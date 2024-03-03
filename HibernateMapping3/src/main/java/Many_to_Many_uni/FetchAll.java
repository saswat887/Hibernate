package Many_to_Many_uni;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAll {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("P");
		EntityManager em=emf.createEntityManager();
		
		String jpql="select s from Student s";
		Query q=em.createQuery(jpql);
		
		List<Student> student=q.getResultList();
		
		for (Student s : student) 
		{
			System.out.println("Student Details");
			System.out.println(s.getName());
			System.out.println(s.getAge());
			List<Course> course=s.getCourse();
			System.out.println("Course Details");
			for (Course c : course) 
			{
				System.out.println(c.getCourseName());
			}
			System.out.println("**********************************************");
		}
	}

}
