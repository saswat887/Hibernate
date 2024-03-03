package Annotation;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "user_table")
public class User {
	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="user_name",nullable = false)
	private String name;
	@Column(name="user_age",nullable = false)
	private int age;
	@Column(name="user_mobile",nullable = false,unique = true,length = 10)
	private long mobile;
	@Column(name="user_password",nullable = false)
	private String password;
	private transient int num;
	

}
