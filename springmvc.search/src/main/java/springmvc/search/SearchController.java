package springmvc.search;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController
{
	@RequestMapping("/user/{id}/{userName}")
	public String getUserDetails(@PathVariable("id") int userId,@PathVariable("userName") String userName )
	{
		System.out.println("getting user details");
		System.out.println(userId);
		System.out.println(userName);
		Integer.parseInt(userName);
		
		return "Home";
	}
	@RequestMapping("/home")
	public String home()
	{
		System.out.println("this is going to home page ");
		String s=null;
		System.out.println(s.length());
		return "Home";
	}
	
	
	
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query)
	{
		
		String url="https://www.google.com/search?q="+ query;
		
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(url);
		return redirectView;
	}

}
