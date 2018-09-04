package com.ormpra.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.ormpra.dao.IUser;
import com.ormpra.pojo.User;

//@Repository(value = "sessionFactory")
public class UserDaoImpl implements IUser{
	
	
	//@Autowired
	//private SessionFactory sessionFactory;
	@Autowired
	private HibernateTemplate template;
	
	public void userReg(User user) {
		System.out.println("Session Factory done : " + template);
		//Session session = sessionFactory.openSession();
		//session.save(user);
		//session.beginTransaction().commit();
		template.save(user);
	}

}
