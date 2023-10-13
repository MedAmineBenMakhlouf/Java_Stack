package com.dojosninjas.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.dojosninjas.models.LoginUser;
import com.dojosninjas.models.User;
import com.dojosninjas.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepo;

	// TO-DO: Write register and login methods!
	public User register(User newUser, BindingResult result) {
		// TO-DO: Additional validations!
		Optional<User> optUser = userRepo.findByEmail(newUser.getEmail());
		if (optUser.isPresent()) {
			result.rejectValue("email", "registerError", "email is taken");
		}
		if (!newUser.getPassword().equals(newUser.getConfirm())) {
			result.rejectValue("password", "registerError", "Password does't much");
		}
		if (result.hasErrors()) {
			return null;
		} else {
			String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
			newUser.setPassword(hashed);
			return userRepo.save(newUser);

		}
	}

	public User login(LoginUser newLoginObject, BindingResult result) {
		// TO-DO: Additional validations!
		Optional<User> optUser = userRepo.findByEmail(newLoginObject.getEmail());
		if (!optUser.isPresent()) {
			result.rejectValue("email", "loginError", "email is not found");
		} else {
			User user = optUser.get();
			if (!BCrypt.checkpw(newLoginObject.getPassword(), user.getPassword()))
			{
				result.rejectValue("password", "loginError", "invalid Password");
			}
			if (result.hasErrors()) {
				return null;
			} else {
				return user;
			}
		}
		return null;
	}
}
