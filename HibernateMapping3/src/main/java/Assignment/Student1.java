package Assignment;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import Many_to_Many_uni.Course;
import Many_to_Many_uni.Student;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@Data
@Entity
public class Student1 {
	@Id
	private int id;
	private String name;
	private int age;
	@ManyToMany
	private List<Course1> course;
	public Student1(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
}
