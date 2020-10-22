package com.verizontraining.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.verizontraining.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

	List<User> findByEmail(String email);
}
