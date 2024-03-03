package Many_to_Many_Bi;

import java.util.List;

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
public class Course2 {
	@Id
	private int id;
	private String courseName;
	@ManyToMany(mappedBy = "course")
	private List<Student2> students;
	public Course2(int id, String courseName) {
		this.id = id;
		this.courseName = courseName;
	}
	

}
