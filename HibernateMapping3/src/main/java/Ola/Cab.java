package Ola;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@Data
@Entity
public class Cab {
	@Id
	private int id;
	private String brand;
	private String model;
	@ManyToMany(mappedBy = "cab")
	private List<Driver> driver;
	public Cab(int id, String brand, String model) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
	}
	

}
