package com.project.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.demo.model.SeriesTable;
@Repository
public interface Seriesrepo extends JpaRepository<SeriesTable, Integer> {

}
