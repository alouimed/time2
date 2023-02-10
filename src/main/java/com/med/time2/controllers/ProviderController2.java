package com.med.time2.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/provider")
public class ProviderController2 {
	
	@RequestMapping("/info")
	//@ResponseBody
	public String info() {
		System.out.println("Hello bootcamp 3");
		//return("<h2 align=center>mon Boocamp 3</h2>");
		return"info.html";
	}
	
	
	@RequestMapping("/data")
	public String data(Model model)
	{
		
		String name="aloui lassaad";
		int tel = 93375678;
		String mail="alllll";
		
		model.addAttribute("name", name);
		model.addAttribute("telVariableHtml", tel);
		model.addAttribute("mail",mail);
		
		List<String> names=new ArrayList<>();
		names.add("sami");
		names.add("ahmed");
		names.add("ali");
		names.add("moudi");
		model.addAttribute("names", names);
		
		return "data.html";
	}
	

}