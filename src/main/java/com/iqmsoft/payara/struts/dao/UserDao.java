package com.iqmsoft.payara.struts.dao;

import com.iqmsoft.payara.struts.domain.User;

public interface UserDao {
	
	User getByUserCode(String user_code);

}
