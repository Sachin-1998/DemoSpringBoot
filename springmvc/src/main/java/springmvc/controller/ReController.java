 package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController 
{
	
	@RequestMapping("/one")
	public RedirectView one()
	{
		System.out.println("handle by one");
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl("https://chat.openai.com/chat");
		return redirectView;
	}
	
	//by using redirect
//	@RequestMapping("/one")
//	public String one()
//	{
//		System.out.println("handle by one");
//		return "redirect:/enjoy";
//	}
	@RequestMapping("/enjoy")
	public String two()
	{
		System.out.println("handle by two");
		return "contact";
	}

}
