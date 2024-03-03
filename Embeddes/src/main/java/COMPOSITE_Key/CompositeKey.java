package COMPOSITE_Key;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class CompositeKey {
	private String name;
	private int age;
	private long mobile;
	

}
