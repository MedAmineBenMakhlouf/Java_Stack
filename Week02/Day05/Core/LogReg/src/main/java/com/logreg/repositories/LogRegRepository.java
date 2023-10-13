package com.logreg.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.logreg.models.User;

public interface LogRegRepository extends CrudRepository<User, Long> {

	Optional<User> findByEmail(String email);
}
