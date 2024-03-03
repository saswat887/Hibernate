package Many_to_Many_Bi;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import Many_to_Many_uni.Course;
import Many_to_Many_uni.Student;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
public class Student2 {
	@Id
	private int id;
	private String name;
	private int age;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn
	private List<Course2> course;
	public Student2(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	

}
