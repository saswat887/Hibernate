package pack1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateData {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("karthik");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		User user=em.find(User.class, 100);
		user.setName("Piyush");
		user.setAge(30);
		
	/*	User user=new User();
		user.setId(3);
		user.setName("Sai");
		user.setAge(30);*///Insertion Using Merge
		
	/*	User u=new User();
		u.setId(10);
		u.setName("Sai M");
		u.setAge(30);
		u.setMobile(345);*/
		
		et.begin();
		em.merge(user);
		et.commit();
		
		System.out.println("Updated");
		
	}

}

/*
 * Simple Maven
 * -dao ->PersonDao {savePerson(Person p),Person findById(int id),String deletePersonById(int id),String updatePersonById(int d),Person obj,void useMerge(Person person),list display,diplaypersonbyemailandpassword}
 * -dto ->Person
 * -controller ->PersonController {
 * 	*Home Page*
 * -insert data
 * -display data by id
 * -update data by id
 * -input/update by id use merge
 * -delete by id
 * -exit
 * 	Choose your choice
 * }
 */
