package com.gokhanbilgin.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gokhanbilgin.core.entities.User;

public interface UserDao extends JpaRepository<User, Integer> {
	User findByEmail(String email);
}
