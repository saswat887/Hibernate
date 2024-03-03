package One_to_Many_Unidirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;
@Data
@Entity
public class Sim {
	@Id
	private int simId;
	private String simName;
	private int  simNum;

}
