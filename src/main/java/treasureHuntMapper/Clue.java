package treasureHuntMapper;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*         THESE ARE LOMBOK
 * @Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor    
public class Employee implements Serializable {}
 */




@Entity
public class Clue implements Serializable {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getAnswerJSON() {
		return answerJSON;
	}

	public void setAnswerJSON(String answerJSON) {
		this.answerJSON = answerJSON;
	}

	private String name;
    
    /*
    // FK
    private Room room;
    */
    
    private String text;
    
    private String answerJSON;
    
    // Must point back to a Hunt somehow
    
    
    
    public Clue() {
		
	}

	public Clue(String name, String text, String answerJSON) {
		super();
		this.name = name;
		this.text = text;
		this.answerJSON = answerJSON;
	}

	@Override
	public String toString() {
		return "Clue [id=" + id + ", name=" + name + ", text=" + text + ", answerJSON=" + answerJSON + "]";
	}

}
