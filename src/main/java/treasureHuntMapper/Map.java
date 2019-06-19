package treasureHuntMapper;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Map {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String imageLink;
    
    /*
    private List<Room> roomsList;
    */
    
    
    private String mapMetaJSON;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Map() {
		
	}

}
