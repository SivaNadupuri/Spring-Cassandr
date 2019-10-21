package se.ikea.spring.cassandra.api.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import se.ikea.spring.cassandra.api.model.User;
import se.ikea.spring.cassandra.api.repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostConstruct
	public void saveUsers()
	{
		List <User> list=new ArrayList<>();
		
		 list.add(new User(1,"Siva","Swesden",26));
		 list.add(new User(2,"santosh","Swesden",26));
		 list.add(new User(3,"Teh","Swesden",26));
		 list.add(new User(4,"Siva","Swesden",26));
		 
		 userRepository.saveAll(list);
		
		
	}
	
	@GetMapping("/getAllUsers")
	public List<User> getUsers()
	{
		return userRepository.findAll();
	}

}
