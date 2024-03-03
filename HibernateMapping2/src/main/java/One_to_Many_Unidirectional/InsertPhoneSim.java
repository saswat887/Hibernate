package One_to_Many_Unidirectional;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertPhoneSim {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("P");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Phone poco = new Phone();
		poco.setId(2);
		poco.setName("samsung");
		poco.setPrice(200000);
		poco.setColor("blue");
		
		Sim jio= new Sim();
		jio.setSimId(104);
		jio.setSimName("jio");
		jio.setSimNum(897623);
		
		Sim airtel= new Sim();
		airtel.setSimId(105);
		airtel.setSimName("airtel");
		airtel.setSimNum(78710);
		
		Sim idea= new Sim();
		idea.setSimId(106);
		idea.setSimName("idea");
		idea.setSimNum(51723);
		
		List<Sim> list= new ArrayList<Sim>();
		list.add(jio);
		list.add(airtel);
		list.add(idea);
		
		poco.setSims(list);
		
		et.begin();
		em.persist(poco);
		em.persist(jio);
		em.persist(airtel);
		em.persist(idea);
		et.commit();
	}

}
