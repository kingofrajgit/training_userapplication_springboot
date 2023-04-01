package com.user.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.application.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

	UserEntity findByMailId(String mailId);

		
}
