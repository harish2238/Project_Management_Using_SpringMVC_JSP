package spotdraft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import spotdraft.dao.SpotDraftdao;
import spotdraft.dto.Airtable;
import spotdraft.dto.Asana;


@Controller
public class AsanaController {
	@Autowired
	Asana asana;
	@Autowired
	Airtable airtable;
	@Autowired
	SpotDraftdao dao;
	
	@RequestMapping("/viewAsana")
	public ModelAndView viewAsana() {
		List<Asana> asana=dao.getAllAsana();
		ModelAndView mav=new ModelAndView("viewAsana.jsp");
		mav.addObject("asanas", asana);
		return mav;
	}
	@RequestMapping("/saveAsana")
	public ModelAndView saveAsana() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("asana",new Asana());
		mav.setViewName("saveAsana.jsp");
		return mav;
	}
	
	@RequestMapping("/addAsana")
	public ModelAndView addAsana(@ModelAttribute Asana asana) {
		dao.saveAsana(asana);
		dao.saveAirtable(asana);
		ModelAndView mav=new ModelAndView("index.jsp");
		return mav;
	}
	
	@RequestMapping("/viewAirtable")
	public ModelAndView viewAirtable() {
		List<Airtable> airtable=dao.getAllAirtable();
		ModelAndView mav=new ModelAndView("viewAirtable.jsp");
		mav.addObject("airtables", airtable);
		return mav;
	}
	
	@RequestMapping("/updateAsana")
	public ModelAndView updateAsana(@RequestParam int id) {
		ModelAndView mav=new ModelAndView("updateAsana.jsp");
		Asana asana=dao.getAsana(id);
		mav.addObject(asana);
		return mav;
	}
	
	@RequestMapping("/saveupdateAsana")
	public ModelAndView saveupdateEmployee(@ModelAttribute Asana asana) {
		ModelAndView mav=new ModelAndView("viewAsana.jsp");
		dao.updateAsana(asana);
		mav.addObject("asanas",dao.getAllAsana());
		return mav;
	}

	@RequestMapping("/deleteAsana")
	public ModelAndView deleteEmployee(@RequestParam int id) {
		ModelAndView mav=new ModelAndView("viewAsana.jsp");
		Asana asana=dao.getAsana(id);
		dao.deleteAsana(asana);
		mav.addObject("asanas", dao.getAllAsana());
		return mav;
	}
}

