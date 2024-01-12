package com.fit.se.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fit.se.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
