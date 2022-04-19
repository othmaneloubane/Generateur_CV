package com.cv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cv.model.Cv;

@Repository
public interface CvRepos extends JpaRepository<Cv, Long>{

}
