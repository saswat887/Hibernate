package one_to_one;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Battery {
	@Id
	private int id;
	private int mah;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMah() {
		return mah;
	}
	public void setMah(int mah) {
		this.mah = mah;
	}
	

}
