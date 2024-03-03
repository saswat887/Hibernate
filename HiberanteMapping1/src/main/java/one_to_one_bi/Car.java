package one_to_one_bi;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Car {
	@Id
	private int id;
	private String name;
	private String color;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private MusicPlayer mp;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public MusicPlayer getMp() {
		return mp;
	}
	public void setMp(MusicPlayer mp) {
		this.mp = mp;
	}
	

}

