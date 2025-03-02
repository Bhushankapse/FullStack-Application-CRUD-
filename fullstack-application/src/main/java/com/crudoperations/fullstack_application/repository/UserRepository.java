package com.crudoperations.fullstack_application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudoperations.fullstack_application.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
