package Many_to_Many_Bi;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchBYId {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("P");
		EntityManager em=emf.createEntityManager();
		
		Student2 s=em.find(Student2.class, 3);
		
		System.out.println("Student Details");
		System.out.println(s.getName());
		System.out.println(s.getAge());
		
		List<Course2> course=s.getCourse();
		System.out.println("Course Taken by "+s.getName()+":-");
		for (Course2 c : course) 
		{
			System.out.println(c.getCourseName());
		}
		
		System.out.println("******************************************************");
		Course2 c=em.find(Course2.class,111);
		System.out.println("Course Details:-");
		System.out.println(c.getCourseName());
		List<Student2> student=c.getStudents();
		System.out.println("Student who had taken this "+c.getCourseName()+" course");
		for (Student2 s1 : student) 
		{
			System.out.println(s1.getName());
			System.out.println(s1.getAge());
		}
		
		
	}

}
