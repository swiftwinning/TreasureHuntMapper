package treasureHuntMapper;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClueController {
	
	@Autowired
	private ClueService clueService;

	 @GetMapping("/clues")
	 public List<Clue> getClues() {
		 return clueService.getAllClues();
	 }
	 
	 @GetMapping("/clues/{name}")
	 public Clue getClue(@PathVariable String name) {
		 return clueService.getClue(name);
	 }
	 
	 @PostMapping("/clues")
	 public Clue addClue(@RequestBody Clue clue) {
		 clueService.addClue(clue);
		 return clue;
	 }
}
