package springmvc.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.user;
@Repository /*it understands that where to inject the object of userdao class*/
public class UserDao 

{
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Transactional
	public int saveUser(user u)
	{
		int id=(Integer)this.hibernateTemplate.save(u);
		return id;
	}

}
