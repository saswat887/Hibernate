package Many_to_one_unidiectional;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class Library {
	@Id
	private int id;
	private String name;
	private String address;

}
