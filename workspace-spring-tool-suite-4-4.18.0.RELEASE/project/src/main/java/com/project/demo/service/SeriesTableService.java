package com.project.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.model.SeriesTable;
import com.project.demo.repository.Seriesrepo;

@Service
public class SeriesTableService {

	@Autowired
	public Seriesrepo srep;
	
	//posting the info
	public SeriesTable saveDetails(SeriesTable r)
	{
		return srep.save(r);
	}
	
	//getting the info
	public List<SeriesTable>getDetails()
	{
		return srep.findAll();
	}
	
	//updating the info
	public SeriesTable updateDetails(SeriesTable u)
	{
		return srep.saveAndFlush(u);
	}
	
	//deleting the info
	public void deleteDetails(int code)
	{
		srep.deleteById(code);
	}
}
