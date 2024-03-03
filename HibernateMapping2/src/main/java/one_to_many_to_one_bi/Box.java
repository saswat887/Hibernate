package one_to_many_to_one_bi;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
@Data
@Entity
public class Box {
	@Id
	private int id;
	private String boxName;
	private String boxColor;
	private int price;
	@OneToMany(mappedBy = "box",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Pen> pens;

}

/*
 * OTO-Eager
 * OTM-Lazy
 * MTO-Eager
 * MTM-Lazy
 */
