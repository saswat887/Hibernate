package One_to_Many_Unidirectional;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
@Data
@Entity
public class Phone {
	@Id
	private int id;
	private String name;
	private int price;
	private String color;
	
	@OneToMany
	private List<Sim> sims;
	
	

}
