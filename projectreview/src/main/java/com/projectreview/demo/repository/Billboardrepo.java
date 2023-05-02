package com.projectreview.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;  
import org.springframework.stereotype.Repository;

import com.projectreview.demo.model.Billboard;

@Repository

public interface Billboardrepo extends JpaRepository<Billboard, Integer>{

	
	List<Billboard>findBySongnameStartingWith(String prefix);
	List<Billboard>findBySongnameEndingWith(String suffix);
}
