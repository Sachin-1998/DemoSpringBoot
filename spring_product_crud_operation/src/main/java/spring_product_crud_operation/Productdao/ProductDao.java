package spring_product_crud_operation.Productdao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import spring_product_crud_operation.model.Product;

@Component
public class ProductDao 
{
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	@Transactional
	public void CreateProduct(Product product)
	{
		this.hibernateTemplate.saveOrUpdate(product);
	}
	
	//get all products
	
	public List<Product> getAllProducts()
	{
		List<Product> product=this.hibernateTemplate.loadAll(Product.class);
		return product;
	}
	
	//get product by id
	
	public Product getProductbyId(int pid)
	{
		Product p=this.hibernateTemplate.get(Product.class,pid);
		return p;
		
	}
	
	//delete by id
	@Transactional
	public void deleteById(int id)
	{
		Product p=this.hibernateTemplate.load(Product.class,id);
		this.hibernateTemplate.delete(p);
	}

}
