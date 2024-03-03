package one_to_one_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchCarMp {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("P");
		EntityManager em=emf.createEntityManager();
		
		Car c=em.find(Car.class, 3);
		
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getColor());
		System.out.println(c.getMp().getId());
		System.out.println(c.getMp().getMpName());
		System.out.println(c.getMp().getMpPrice());
		System.out.println(c.getMp().getCar().getName());
		
		MusicPlayer mp=em.find(MusicPlayer.class, 113);
		System.out.println(mp.getId());
		System.out.println(mp.getMpName());
		System.out.println(mp.getMpPrice());
		System.out.println(mp.getCar().getId());
		System.out.println(mp.getCar().getName());
		System.out.println(mp.getCar().getColor());
	}

}
