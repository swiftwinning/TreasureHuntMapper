package treasureHuntMapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ClueService {
	
	private List<Clue> clues = new ArrayList<>(Arrays.asList(
			 new Clue("Droopy", "Find the fossil with droopy jowls", "Glyptodont"),
			 new Clue("etc", "etc.", "etc."),
			 new Clue("Terminator", "Find the mineral that looks like T-1000", "Hematite"),
			 new Clue("Rest", "Find the other ones", "The other answers")
	));
	
	public List<Clue> getAllClues() {
		return clues;
	}
	
	public Clue getClue(String name) {
		return clues.stream().filter(t -> t.getName().equals(name)).findFirst().get();
	}

	public void addClue(Clue clue) {
		clues.add(clue);
	}
}
