package io.javabrains;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	
	public List<User> findAllUsers(){
		List<User> users = new ArrayList<User>();
        userRepository.findAll().forEach(person -> users.add(person));
        return users;
	}
	public Optional<User> getOne(Integer id) {
		return userRepository.findById(id);
	}
	public void deleteUser(Integer id) {
		 userRepository.deleteById(id);
	}
	public void saveUser(User user) {
		userRepository.save(user);
	}
	
}
