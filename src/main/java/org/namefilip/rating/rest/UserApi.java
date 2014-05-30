package org.namefilip.rating.rest;

import javax.inject.Inject;

import org.namefilip.rating.entity.User;
import org.namefilip.rating.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/users")
public class UserApi {
	
	@Inject
	UserRepository userRepository;
	
	/**
	 * Get a list of users
	 */
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET)
	public Iterable<User> listUsers() {
		return userRepository.findAll();
	}
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST)
	public User saveUser(@RequestBody User userJson) {
		return userRepository.save(userJson);
	}
	
	@ResponseBody
	@RequestMapping(value = "/{userId}", method = RequestMethod.GET)
	public User findUser(@PathVariable Long userId) {
		return userRepository.findOne(userId);
	}
	
	@RequestMapping(value = "/{userId}", method = RequestMethod.DELETE)
	public void deleteUser(@PathVariable Long userId) {
		userRepository.delete(userId);
	}
	
	@ResponseBody
	@RequestMapping(value = "/{userId}", method = RequestMethod.PUT)
	public User updateUser(@RequestBody User userJson) {
		return userRepository.save(userJson);
	}
	
}
