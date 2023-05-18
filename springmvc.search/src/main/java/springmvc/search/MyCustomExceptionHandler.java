package springmvc.search;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
@ControllerAdvice
public class MyCustomExceptionHandler
{
	//Handling exception in spring mvc
		@ExceptionHandler(value=NullPointerException.class)
		@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
		public String myExceptionHandlernull(Model m)
		{
			m.addAttribute("msg", "null pointer exception has occoured");
			return "exception";
		}
		@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
		@ExceptionHandler(value=NumberFormatException.class)
		public String myExceptionHandlernumber(Model m)
		{
			m.addAttribute("msg", "Number format exception has occoured");
			return "exception";
		}
		@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
		@ExceptionHandler(value=Exception.class)
		public String myExceptionHandlerGeneric(Model m)
		{
			m.addAttribute("msg", "Exception has occoured");
			return "exception";
		}

}
