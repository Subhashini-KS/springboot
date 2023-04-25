package com.projectreview.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projectreview.demo.model.Billboard;

@Repository
public interface Billboardrepo extends JpaRepository<Billboard, Integer>{

}
