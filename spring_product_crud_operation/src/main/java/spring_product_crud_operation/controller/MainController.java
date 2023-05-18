package spring_product_crud_operation.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import spring_product_crud_operation.Productdao.ProductDao;
import spring_product_crud_operation.model.Product;

@Controller
public class MainController 
{
	@Autowired
	private ProductDao productDao;
	
	
	@Controller
	public class myclass
	{
		@RequestMapping("/")
		public String showview(Model m)
		{
			List<Product> products=productDao.getAllProducts();
			m.addAttribute("product", products);
			return "index";
		}

	}

	//show add product form
	@RequestMapping("/Add-product")
	public String addProduct(Model m)
	{
		m.addAttribute("title", "add product");
		return "add_product-form";
	}
    
	//handle add product form
	@RequestMapping(value="/handle-product",method = RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product,HttpServletRequest request)
	{
		System.out.println(product);
		productDao.CreateProduct(product);
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	}
	//delete handler
	@RequestMapping("/delete/{productid}")
	public RedirectView deleteProduct(@PathVariable("productid") int productid,HttpServletRequest request)
	{
		this.productDao.deleteById(productid);
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	}
	//update product
	@RequestMapping("/update/{productid}")
	public String updateProduct(@PathVariable("productid") int pid,Model model)
	{
		Product products= this.productDao.getProductbyId(pid);
		model.addAttribute("product", products);
		return "update_form";
		
		
	}
	

}
