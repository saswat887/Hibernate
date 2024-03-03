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
public class Student {
	@Id
	private int id;
	private String name;
	private int age;
	@ManyToMany
	private List<Course> course;
	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	
	

}
