package com.laptopbooking.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.laptopbooking.demo.entity.LaptopDetails;
import com.laptopbooking.demo.repository.LaptopRepository;

@Service
public class LaptopService {
  
	@Autowired
	LaptopRepository lr;
	
	public List<LaptopDetails> getLapDetails()
	{
		return lr.findAll();
	}
	
	public LaptopDetails saveDetails(LaptopDetails s)
	{
		return lr.save(s);
	}

	public LaptopDetails updateDetails(LaptopDetails r)
	{
		
		return lr.save(r);
	}
	
	public void deleteDetails(int modelid)
	{
		 lr.deleteById(modelid);
	}
	
	public Optional<LaptopDetails> findLapById(int modelid)
	{
		return lr.findById(modelid);
	}
	
	

}
