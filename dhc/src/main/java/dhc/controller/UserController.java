package dhc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import dhc.entity.User;
import dhc.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/addUsers")
	public User addUsers(User user) {
		return userService.addUsers(user);

	}

	@GetMapping("/getAllData")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

}
