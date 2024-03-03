package controller;

import java.util.List;
import java.util.Scanner;

import dao.PersonDao;
import dto.Person;

public class PersonController {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PersonDao dao=new PersonDao();
		boolean flag=true;
		while(flag)
		{
			System.out.println("***************HOME PAGE*********************");
			System.out.println("Enter Choice");
			System.out.println("1. SAVE PERSON");
			System.out.println("2. SAVE PERSON USING MERGE");
			System.out.println("3. FETCH PERSON BY ID");
			System.out.println("4. DELETE PERSON BY ID");
			System.out.println("5. UPDATE PERSON BY ID");
			System.out.println("6. DISPLAY ALL PERSON");
			System.out.println("7. DISPLAY PERSON BY USING EMAIL AND PASSWORD");
			System.out.println("8. EXIT");
			int c=sc.nextInt();
			if(c==1)
			{
				Person p=new Person();
				dao.savePerson(p);
			}
			else if(c==2)
			{
				Person p=new Person();
				dao.useMerge(p);
			}
			else if(c==3)
			{
				System.out.println("Enter the id you want to fetch");
				int id=sc.nextInt();
				Person p=dao.findById(id);
				if(p!=null)
				{
					System.out.println("Name:-"+p.getName());
					System.out.println("Age:-"+p.getAge());
					System.out.println("Mobile:-"+p.getMobile());
					System.out.println("Email:-"+p.getEmail());
				}
				else
				{
					System.out.println("ID NOT FOUND");
				}
			}
			else if(c==4)
			{
				System.out.println("Enter the id you want to delete");
				int id=sc.nextInt();
				System.out.println(dao.deletePersonById(id));
			}
			else if(c==5)
			{
				System.out.println("Enter the id you want to update");
				int id=sc.nextInt();
				System.out.println(dao.updatePersonById(id));
			}
			else if(c==6)
			{
				List<Person> l=dao.display();
				for (Person p : l) {
					System.out.println("ID:-"+p.getId());
					System.out.println("Name:-"+p.getName());
					System.out.println("Age:-"+p.getAge());
					System.out.println("Mobile:-"+p.getMobile());
					System.out.println("Email:-"+p.getEmail());
					System.out.println("=========================");
					
				}
			}
			else if(c==7)
			{
				sc.nextLine();
				System.out.println("Enter email");
				String email=sc.nextLine();
				System.out.println("Enter password");
				String password=sc.nextLine();
				List<Person> l=dao.displayPersonByEmailAndPassword(email, password);
				for (Person p : l) {
					System.out.println("ID:-"+p.getId());
					System.out.println("Name:-"+p.getName());
					System.out.println("Age:-"+p.getAge());
					System.out.println("Mobile:-"+p.getMobile());
					System.out.println("Email:-"+p.getEmail());
					System.out.println("=========================");
					
				}
				
			}
			else if(c==8)
			{
				flag=false;
				System.out.println("===================================");
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
			}
			else
			{
				System.out.println();
				System.out.println();
				System.out.println("WRONG CHOICE");
				System.out.println();
				System.out.println();
			}
			
		}
	}

}
