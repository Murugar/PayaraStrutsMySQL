package com.iqmsoft.payara.struts.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	private static SessionFactory sf;
	
	static{
	
		Configuration conf = new Configuration().configure();
		
		 sf = conf.buildSessionFactory();
	}
	
	
	public static Session openSession(){
			
				Session session = sf.openSession();
				
				return session;
		
	}
	//获得session => 获得与线程绑定的session
	public static Session getCurrentSession(){
		//3 获得session
		Session session = sf.getCurrentSession();
		
		return session;
	}
	public static void main(String[] args) {
		System.out.println(HibernateUtils.openSession());
	}
	
}
