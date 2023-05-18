package springmvc.search;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class formController 
{
	@RequestMapping("/complex")
	public String showForm()
	{
		return "Complex_form";
	}
	@RequestMapping(path="/handleform",method=RequestMethod.POST)
	public String formHandler(@ModelAttribute("student") Student student ,BindingResult result)
	{
		
		if(result.hasErrors())
		{
			return "Complex_form";
		}
		System.out.println(student);
		if(student.getName().isEmpty())
		{
			return "redirect:/complex";
		}
		return "success";
	}

}
