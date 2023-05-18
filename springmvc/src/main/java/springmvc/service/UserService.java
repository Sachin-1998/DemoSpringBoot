package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.Dao.UserDao;
import springmvc.model.user;

@Service  /* tell that present class is service class no need to declare it in xml 8*/
public class UserService 
{
	@Autowired
	private UserDao userdao;
	public int createUser(user u)
	{
		return this.userdao.saveUser(u);
	}

}
