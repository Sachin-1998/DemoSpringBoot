package springmvc.search;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class fileUploadController
{
	@RequestMapping("/showform")
	public String showFile()
	{
		return "fileform";
	}
	
	@RequestMapping(path="/uploadimage",method=RequestMethod.POST)
	public String fileupload()
	{
		System.out.println("file upload handler");
		return "filesuccess";
	}

}
