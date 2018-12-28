package com.heroku.heroku;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
	@Autowired
	private TestRepository repo;
	
	public void test(){
		User user=new User();
		user.setAddress("kathmandu");
		user.setName("sakshi khatri");
		repo.save(user);
		
	}

}
