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
		return "data.html";
	}
	
}
