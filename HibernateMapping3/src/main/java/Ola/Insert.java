package Ola;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("P");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Driver diksha=new Driver(1, "disksha", 23);
		Driver ashish=new Driver(2, "ashish", 25);
		Driver karishma=new Driver(3, "karishma", 21);
		
		Cab maruti =new Cab(111, "Maruti", "Swift");
		Cab hyundai =new Cab(222, "Hyundai", "Aura");
		Cab renault =new Cab(333, "Renault", "Triber");
		Cab honda =new Cab(444, "Honda", "City");
		Cab tesla =new Cab(555, "Tesla", "Model X");
		
		List<Cab> dikshacab=new ArrayList<Cab>();
		dikshacab.add(maruti);
		dikshacab.add(renault);
		dikshacab.add(tesla);
		
		List<Cab> ashishcab=new ArrayList<Cab>();
		ashishcab.add(hyundai);
		ashishcab.add(honda);
		ashishcab.add(renault);
		ashishcab.add(maruti);
		
		List<Cab> karishmacab=new ArrayList<Cab>();
		karishmacab.add(hyundai);
		karishmacab.add(renault);
		karishmacab.add(tesla);
		
		List<Driver> marutidriver=new ArrayList<Driver>();
		marutidriver.add(ashish);
		marutidriver.add(diksha);
		
		List<Driver> hyundaidriver=new ArrayList<Driver>();
		hyundaidriver.add(ashish);
		hyundaidriver.add(karishma);
		
		List<Driver> renaultdriver=new ArrayList<Driver>();
		renaultdriver.add(ashish);
		renaultdriver.add(diksha);
		
		List<Driver> hondadriver=new ArrayList<Driver>();
		hondadriver.add(ashish);
		
		List<Driver> tesladriver=new ArrayList<Driver>();
		tesladriver.add(karishma);
		tesladriver.add(diksha);
		
		ashish.setCab(ashishcab);
		diksha.setCab(dikshacab);
		karishma.setCab(karishmacab);
		
		maruti.setDriver(marutidriver);
		hyundai.setDriver(hyundaidriver);
		honda.setDriver(hondadriver);
		renault.setDriver(renaultdriver);
		tesla.setDriver(tesladriver);
		
		et.begin();
		em.persist(ashish);
		em.persist(diksha);
		em.persist(karishma);
		em.persist(maruti);
		em.persist(hyundai);
		em.persist(honda);
		em.persist(renault);
		em.persist(tesla);
		et.commit();
		
		
		
	}

}
