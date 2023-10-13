package com.logreg.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.logreg.models.Login;
import com.logreg.models.User;
import com.logreg.repositories.LogRegRepository;

@Service
public class LogRegService {

	@Autowired
	private LogRegRepository logregRepository;

	// TO-DO: Write register and login methods!
	public User register(User newUser, BindingResult result) {
		// TO-DO: Additional validations!
		Optional<User> optUser = logregRepository.findByEmail(newUser.getEmail());
		if (optUser.isPresent()) {
			result.rejectValue("email", "registerError", "email is taken");
		}
		if (!newUser.getPassword().equals(newUser.getConfirm())) {
			result.rejectValue("password", "registerError", "Password does't much");
		}
		if(result.hasErrors())
		{
			return null;
		}
		else
		{
			String HashedPassword = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
			newUser.setPassword(HashedPassword);
			User saveduser = logregRepository.save(newUser);
			return saveduser;
		}
	}

	public User login(Login newLoginObject, BindingResult result) {
		// TO-DO: Additional validations!
		Optional<User> optUser = logregRepository.findByEmail(newLoginObject.getEmail());
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
