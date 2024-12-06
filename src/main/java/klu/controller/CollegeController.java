package klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import klu.model.College;
import klu.model.CollegeManager;

public class CollegeController {
	
	@RestController
	@RequestMapping("/college")
	public class CollgerController {
		
		@Autowired
		CollegeManager CM;
		@PostMapping("/save")
		public String save(College C) {
			return CM.saveData(C);
		}
		
	}
	
}
