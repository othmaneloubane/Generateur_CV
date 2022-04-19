package com.cv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cv.model.Chercheur;

@Repository
public interface ChercheurRepos extends JpaRepository<Chercheur, Long> {

}
