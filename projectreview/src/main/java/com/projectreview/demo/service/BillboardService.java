package com.projectreview.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectreview.demo.model.Billboard;
import com.projectreview.demo.repository.Billboardrepo;

@Service
public class BillboardService {

	@Autowired
	public Billboardrepo brep;
	
	//posting the info
	public Billboard saveInfo(Billboard r)
	{
		return brep.save(r);
	}
	
	//displaying the info
	public List<Billboard> getInfo()
	{
		return brep.findAll();
	}
	
	//updating the info
	public Billboard updateInfo(Billboard u)
	{
		return brep.saveAndFlush(u);
	}
	
	//deleting the info
	public void deleteInfo(int sno)
	{
		brep.deleteById(sno);
	}
}
