package one_to_many_to_one_bi;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteBoxPen2 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("P");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Box b = em.find(Box.class, 1);
		List<Pen> pens = b.getPens();
		Pen pen2 = null;
		for (int i = 0; i < pens.size(); i++) 
		{
			Pen pen=pens.get(i);
			if(pen.getId()==102)
			{
				 pen2 = pens.remove(i);
			}
		}
		
		et.begin();
		em.remove(pen2);
		et.commit();
	}

}
