package Assignment;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import Many_to_Many_uni.Course;
import Many_to_Many_uni.Student;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@Data
@Entity
public class Course1 {
	@Id
	private int id;
	private String courseName;
	public Course1(int id, String courseName) {
		this.id = id;
		this.courseName = courseName;
	}
}
