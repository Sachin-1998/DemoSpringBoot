package springmvc.controller;

//import javax.servlet.http.HttpServletRequest;

//import org.apache.el.parser.AstFalse;
//import org.apache.tomcat.jni.User;
//import org.eclipse.jdt.internal.compiler.ast.FalseLiteral;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.user;
import springmvc.service.UserService;

@Controller
public class ContactController 

{
	@Autowired
	private UserService userService;
	@RequestMapping("/contact")
	public String showForm()
	{
		return "contact";
	}
	@ModelAttribute
	public void commonDataForModel(Model m)
	{
		m.addAttribute("Header", "Do Register Here");
		m.addAttribute("desc", "Learn with smile");
	}
	
	//old method of sending data from view to controller
	/*@RequestMapping(path="/processForm",method=RequestMethod.POST)
	public String handleForm(HttpServletRequest request)
	{
		String email=request.getParameter("email");
		System.out.println(email);
		return "";
	}*/

	@RequestMapping(path="/processForm",method=RequestMethod.POST)
	public String formHandler(@ModelAttribute("user") user u, Model model)
			
	{
		int i=this.userService.createUser(u);
		model.addAttribute("msg", "user created with id: "+i);
		if(u.getUserName().isBlank())
		{
			return "redirect:/contact";
		}
		return "success";
	}
	
	
	
	
	
	
	
	
	
	
	/*
	@RequestMapping(path="/processForm",method=RequestMethod.POST)
	public String formHandler(
			@RequestParam(name="email",required = false) String email,
			@RequestParam("userName") String userName,
	        @RequestParam("userPassword") String password,Model model)
	{
		System.out.println("email: "+email);
		System.out.println("user name: "+userName);
		System.out.println("password: "+password);
		
	    user u=new user();
		u.setEmail(email);
		u.setUserName(userName);
		u.setUserPassword(password);
		System.out.println(u);
		
		//process
		model.addAttribute("email", email);
		model.addAttribute("userName", userName);
		model.addAttribute("password", password);
		
		model.addAttribute("user", u);
		return "success";
	}*/
	
}
