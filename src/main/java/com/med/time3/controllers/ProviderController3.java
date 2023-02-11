package com.med.time3.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/provider")
public class ProviderController3 {

	@RequestMapping("/info")
	//@ResponseBody
	public String info() {
		System.out.println("Hello bootcamp 4");
		//return("<h2 align=center>Mon Bootcamp 3</h2>");
		return "info.html";
	}
	
	@RequestMapping("/data")
	public String data(Model model)
	{
		 String name="moudi";
		model.addAttribute("name", name);
		 
		List<String> names=new ArrayList<>();
		names.add("kamel from controller");
		names.add("ali from controller");
		names.add("moudi from controller");
		names.add("lassaad from controller");
		model.addAttribute("names", names);
		
		List<Stagiaire> stagiaires=new ArrayList<>();
		stagiaires.add(new Stagiaire("kamel",25,"tunis",22514877));
		stagiaires.add(new Stagiaire("ali",35,"tunis",52252255));
		stagiaires.add(new Stagiaire("sami",45,"tunis",95595555));
		stagiaires.add(new Stagiaire("moudi",28,"tunis",33545465));
		return "data.html";
	}
	
}
