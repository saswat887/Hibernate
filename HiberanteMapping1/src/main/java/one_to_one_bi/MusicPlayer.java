package one_to_one_bi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class MusicPlayer {
	@Id
	private int id;
	private String mpName;
	private int mpPrice;
	@OneToOne(mappedBy = "mp")
	private Car car;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMpName() {
		return mpName;
	}
	public void setMpName(String mpName) {
		this.mpName = mpName;
	}
	public int getMpPrice() {
		return mpPrice;
	}
	public void setMpPrice(int mpPrice) {
		this.mpPrice = mpPrice;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	

}
