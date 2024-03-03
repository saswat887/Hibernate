package Many_to_Many_uni;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@Data
@Entity
public class Course {
	@Id
	private int id;
	private String courseName;
	public Course(int id, String courseName) {
		this.id = id;
		this.courseName = courseName;
	}
	
	

}
