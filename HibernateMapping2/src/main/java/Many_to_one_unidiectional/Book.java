package Many_to_one_unidiectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
@Data
@Entity
public class Book {
	@Id
	private int id;
	private String name;
	private String author;
	private int price;
	
	@ManyToOne
	private Library library;

}
