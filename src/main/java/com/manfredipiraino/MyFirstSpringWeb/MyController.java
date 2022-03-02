package com.manfredipiraino.MyFirstSpringWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@Autowired
	private ApplicationContext myContext;

	
	@GetMapping("/myget")	
	@ResponseBody
	public String myGet() {
		return "My Get";
	}
	
	@GetMapping("/mygetquerystring")
	@ResponseBody
	public String myGetQueryString(@RequestParam String myparameter, int myparameter2) {
		return "Get querystring: " + myparameter + " - " + myparameter2 * 2;
	}
	
	@GetMapping("/mygetquerystring/{myparameter1}/{myparameter2}")
	@ResponseBody
	public String myGetParameter(@PathVariable String myparameter1,@PathVariable int myparameter2) {
		return "Get con parametri " + myparameter1+ " - "+myparameter2*2;
	}
	
	//solo view
	@GetMapping("/mythemeleaftemplate")
	public ModelAndView myThymeleaf() {
		ModelAndView myView = new ModelAndView("mytemplate");
		return myView;
	}
	
	//view + model
	@GetMapping("/mythemeleaftemplateclass")
	public ModelAndView myThymeleafClass() {
		ModelAndView myView = new ModelAndView("mytemplateclass");
		MyClass myClass= myContext.getBean(MyClass.class);
		
		// Aggiunge la classe (Model) alla view
		myView.addObject("myclass", myClass);
		
		return myView;
	}
	
	@PostMapping("/mypost")
	@ResponseBody
	public String myPost(@RequestParam int myparameter,@RequestParam int myparameter2) {
		return "Post: " + myparameter + " - " + myparameter2 * 2;
	}
}
