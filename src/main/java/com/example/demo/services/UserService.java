package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> findall() {
		return userRepository.findAll();
	}

	public User findById(Long id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.get();
	}

	public User insert(User obj) {
		return userRepository.save(obj);
	}

	public void delete(Long id) {
		userRepository.deleteById(id);
	}

	public User uptade(Long id, User obj) {
		User entity = userRepository.getOne(id);
		uptadeData(entity, obj);
		return userRepository.save(entity);
	}

	private void uptadeData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());

	}
}
