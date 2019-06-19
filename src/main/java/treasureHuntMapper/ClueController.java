package treasureHuntMapper;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClueController {
	
	@Autowired
	private ClueService clueService;

	 @GetMapping("/clues")
	 public List<Clue> displayClues() {
		 return clueService.getAllClues();
	 }
	 
	 @GetMapping("/cluee")
	 public Clue displayCluee() {
		 Clue droopy = new Clue("Droopy Dog", "Find the fossil with droopy jowls", "Glyptodont");
		 System.out.println(droopy);
		 return droopy;
	 }
}
