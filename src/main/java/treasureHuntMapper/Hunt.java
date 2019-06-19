package treasureHuntMapper;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hunt {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    
    /*
    private List<Clue> cluesList;
    
    private Map map;
    */
    
    
    
    private String huntMetaJSON;
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    
    public Hunt() {
		
	}

}
