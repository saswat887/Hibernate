package one_to_one;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Pan {
	@Id
	private int id;
	private String panNum;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPanNum() {
		return panNum;
	}
	public void setPanNum(String panNum) {
		this.panNum = panNum;
	}
	
}
