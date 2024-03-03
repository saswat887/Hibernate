package one_to_many_to_one_bi;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import lombok.Data;
@Data
@Entity
public class Pen {
	@Id 
	private int id;
	private String name;
	private int price;
	@ManyToOne
	@JoinColumn
	private Box box;
	

}
