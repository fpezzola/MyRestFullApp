package com.myRestFullApp.repository.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myRestFullApp.domain.user.User;

public interface IUserRepository extends JpaRepository<User, Long>{

}
