package com.service;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AppDao;
import com.model.Login;
import com.model.Register;
import com.model.User;


@Service
public class UserService {
    @Autowired
	private AppDao appDao;
//	ArrayList<User> al = new ArrayList<User>();
	public boolean userValidation(Login login) {
//		ArrayList<Login> al = new ArrayList<Login>();
//		for (int i = 0; i<al.size(); i++ ) {
//		  login  = al.get(i);
		List<User> al = (List<User>) appDao.findAll();
		for (User usr: al) {
		if (login.getUname().equals(usr.getName()) && login.getUpassword().equals(usr.getPass())){

			return true;
		}
		}
		return false;
		
}
		
	
	
	
	public void userRegistered(User user) {
		
//		if (!register.getUname().isEmpty() && !register.getPassword().isEmpty() && !register.getEmail().isEmpty() && !register.getCity().isEmpty() && !register.getDepartment().isEmpty()  ) {
		appDao.save(user);
		
		
	}
	
	
	public List<User>loadAll(){
		List<User> al = (List<User>) appDao.findAll();
		return al;
	}
	public boolean findUser(String user) {
		Optional<User> op = appDao.findById(user);
		if(op.isPresent()) {
				return true;
			}
		return false;
	}
	
	public boolean deleteUser(String name) {
		Optional<User> op = appDao.findById(name);
		if(op.isPresent()) {
			appDao.deleteById(name);
				return true;
			}
			
	
		return false;
	}
	
	public boolean updateUser(String name, User user ) {
		Optional<User> op = appDao.findById(name);
		if(op.isPresent()) {
			appDao.deleteById(name);
			appDao.save(user);
				return true;
			}
	
		return false;
	}
	
}
