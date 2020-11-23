package com.itdfq.houtai.service;

import com.itdfq.core.service.BasicService;
import com.itdfq.houtai.dao.UserMapper;
import com.itdfq.houtai.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServcie extends BasicService {
	
	@Transactional
	public List<User> findUser(String username){
		List<User> ls = this.userMapper.selectUserByUsernameLike(username);
		return ls;
	}
	
	@Transactional
	public void userAdd(User user) {
		user.setDelFlag("0");
		this.userMapper.insertUser(user);
	}
	
	@Transactional
	public void userModify(User user) {
		this.userMapper.updateUser(user);
	}
	
	@Transactional
	public void userRemove(int id) {
		this.userMapper.deleteById(id);
	}
	
	@Transactional
	public User findUserByUsername(String username) {
		User user = this.userMapper.selectUserByUsername(username);
		return user;
	}
	
	
	@Transactional
	public void passwordReset(int id,String password) {
		this.userMapper.passwordReset(id, password);
	}
	
	
	@Autowired
	private UserMapper userMapper;

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
}
