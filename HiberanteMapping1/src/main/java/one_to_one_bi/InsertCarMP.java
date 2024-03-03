package one_to_one_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertCarMP {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("P");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Car car=new Car();
		car.setId(3);
		car.setName("BMW");
		car.setColor("black");
		
		MusicPlayer mp=new MusicPlayer();
		mp.setId(113);
		mp.setMpName("WMB");
		mp.setMpPrice(1000000);
		mp.setCar(car);
		car.setMp(mp);
		
		et.begin();
		em.persist(car);
		et.commit();
	}

}
