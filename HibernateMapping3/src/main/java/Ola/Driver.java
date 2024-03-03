package Ola;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@Data
@Entity
public class Driver {
	@Id
	private int id;
	private String name;
	private int age;
	@ManyToMany
	@JoinColumn
	private List<Cab> cab;
	public Driver(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	

}
