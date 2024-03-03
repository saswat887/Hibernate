package dao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Person;

public class PersonDao {
	Scanner sc=new Scanner(System.in);
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("A");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public void savePerson(Person p)
	{
		System.out.println("Enter Id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name");
		String name=sc.nextLine();
		System.out.println("Enter Age");
		int age=sc.nextInt();
		System.out.println("Enter Mobile no");
		long mobile=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter Email");
		String email=sc.nextLine();
		System.out.println("Enter Password");
		String password=sc.nextLine();
		p.setId(id);
		p.setName(name);
		p.setAge(age);
		p.setMobile(mobile);
		p.setEmail(email);
		p.setPassword(password);
		et.begin();
		em.persist(p);
		et.commit();
		System.out.println("DATA INSERTED");
	}
	
	public void useMerge(Person p)
	{
		System.out.println("Enter Id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name");
		String name=sc.nextLine();
		System.out.println("Enter Age");
		int age=sc.nextInt();
		System.out.println("Enter Mobile no");
		long mobile=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter Email");
		String email=sc.nextLine();
		System.out.println("Enter Password");
		String password=sc.nextLine();
		p.setId(id);
		p.setName(name);
		p.setAge(age);
		p.setMobile(mobile);
		p.setEmail(email);
		p.setPassword(password);
		et.begin();
		em.merge(p);
		et.commit();
		System.out.println("DATA INSERTED");
	}
	
	public Person findById(int id)
	{
		Person p=em.find(Person.class, id);
		return p;
	}
	
	public String deletePersonById(int id)
	{
		Person p=em.find(Person.class, id);
		if(p!=null)
		{
			
			et.begin();
			em.remove(p);
			et.commit();
			
			return "DATA DELETED";
		}
		else
		{
			return "ID NOT PRESENT";
		}
	}
	
	public String updatePersonById(int id)
	{
		Person p=em.find(Person.class, id);
		if(p!=null)
		{
			System.out.println("Enter Name");
			String name=sc.nextLine();
			System.out.println("Enter Age");
			int age=sc.nextInt();
			System.out.println("Enter Mobile no");
			long mobile=sc.nextLong();
			sc.nextLine();
			System.out.println("Enter Email");
			String email=sc.nextLine();
			System.out.println("Enter Password");
			String password=sc.nextLine();
			p.setName(name);
			p.setAge(age);
			p.setMobile(mobile);
			p.setEmail(email);
			p.setPassword(password);
			et.begin();
			em.merge(p);
			et.commit();
			
			return "DATA UPDATED";
		}
		else
		{
			return "ID NOT PRESENT";
		}
	}
	
	public List<Person> display()
	{
		String a="select p from Person p";
		Query q=em.createQuery(a);
		List<Person> l=q.getResultList();
	
		return l;
	}
	
	public List<Person> displayPersonByEmailAndPassword(String email,String Password)
	{
		String jpql="Select p from Person p where p.email=?1 and p.password=?2";
		Query q=em.createQuery(jpql);
		q.setParameter(1, email);
		q.setParameter(2, Password);
		List<Person> l=q.getResultList();
		return l;
	}

}
