package com.cv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cv.model.User;

@Repository
public interface UserRepos extends JpaRepository<User, Long>{

}
