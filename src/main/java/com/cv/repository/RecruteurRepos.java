package com.cv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cv.model.Recruteur;

@Repository
public interface RecruteurRepos extends JpaRepository<Recruteur, Long>{

}
