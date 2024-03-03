package One_to_Many_Unidirectional;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchPhoneSim {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("P");
		EntityManager em=emf.createEntityManager();
		
		Phone phone = em.find(Phone.class, 1);
		System.out.println("Phone Details: ");
		System.out.println(phone.getId());
		System.out.println(phone.getName());
		System.out.println(phone.getPrice());
		System.out.println(phone.getColor());
		
		System.out.println("--------------");
		List<Sim> sims = phone.getSims();
		System.out.println("Sim details: ");
		System.out.println(sims);
		for(Sim sim : sims)
		{
			System.out.println(sim.getSimId());
			System.out.println(sim.getSimName());
			System.out.println(sim.getSimNum());
		}
	}

}
