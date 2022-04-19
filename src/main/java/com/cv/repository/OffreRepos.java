package com.cv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cv.model.Offre;

@Repository
public interface OffreRepos extends JpaRepository<Offre, Long>{

}
