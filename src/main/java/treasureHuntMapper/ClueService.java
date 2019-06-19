package treasureHuntMapper;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ClueService {
	
	private List<Clue> clues = Arrays.asList(
			 new Clue("Droopy Dog", "Find the fossil with droopy jowls", "Glyptodont"),
			 new Clue("etc.", "etc.", "etc."),
			 new Clue("Terminator Soup", "Find the mineral that looks like T-1000", "Hematite"),
			 new Clue("And the rest", "Find the other ones", "The other answers")
	);
	
	public List<Clue> getAllClues() {
		return clues;
	}
}
