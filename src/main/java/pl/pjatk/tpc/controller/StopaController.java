package pl.pjatk.tpc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.pjatk.tpc.service.StopaService;
import pl.pjatk.tpc.service.UpdateStopa;

@Controller
public class StopaController {
	
	@Autowired
	private StopaService stopaService;
	
	@Autowired
	private UpdateStopa updateService;
	
	
	@RequestMapping("/history")
	public String historystopa(Model model){
		updateService.update();
		
		model.addAttribute("lista",stopaService.findAll());
		return "history";
		
	}

}
