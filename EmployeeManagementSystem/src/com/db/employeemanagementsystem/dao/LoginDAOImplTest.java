package com.db.employeemanagementsystem.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import com.db.employeemanagementsystem.bean.LoginBean;



class LoginDAOImplTest {

	@Test
	void testAuthenticate() {
		LoginBean loginBean = new LoginBean("root","root");
		Assertions.assertEquals(true, new LoginDAOImpl().authenticate(loginBean),"checking the credential");
	}

}
