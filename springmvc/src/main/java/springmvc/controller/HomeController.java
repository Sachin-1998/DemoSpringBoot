package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController 
{
	@RequestMapping("/home")
	public String home()
	{
		System.out.println("this is home url");
		return "index";
	}
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("this is about url");
		return "about";
	}
	
	@RequestMapping("/data")
	public String name(Model model)
	{
		model.addAttribute("name", "sachin shinde");
		model.addAttribute("ID", 1234);
		List<String> list=new ArrayList<String>();
		list.add("Tushar");
		list.add("Jiya");
		list.add("shubham");
	    model.addAttribute("List", list);
		return "name";
	}
	
	@RequestMapping("/help")
	public ModelAndView  help()
	{
		//creating object of model and view
		ModelAndView modelAndView=new ModelAndView();
		
		//setting name and rollnumber
		modelAndView.addObject("name", "Sagar ");
		modelAndView.addObject("rollnumber", 12345);
		LocalDateTime now=LocalDateTime.now();
		modelAndView.addObject("time", now);
		
		//create a list of student marks
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(87);
		list.add(78);
		list.add(83);
		list.add(65);
		list.add(45);
		modelAndView.addObject("marks", list);
		
		//setting the view name
		
		modelAndView.setViewName("help");
		
		return modelAndView;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
