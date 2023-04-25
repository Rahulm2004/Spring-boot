package com.laptopbooking.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.laptopbooking.demo.entity.LaptopDetails;
import com.laptopbooking.demo.service.LaptopService;

@RestController
public class LaptopController {
    @Autowired
	LaptopService ls;
    
    @GetMapping("/lapdetail")
    public List<LaptopDetails> getLapDetails()
    {
    	return ls.getLapDetails();
    }
    
    @PostMapping("/save")
    public LaptopDetails saveDetails(@RequestBody LaptopDetails s)
    {
    	return ls.saveDetails(s);
    }
    
    @PutMapping("/update")
    public LaptopDetails updateDetails(@RequestBody LaptopDetails r)
    {
    	return ls.updateDetails(r);
    }
    
    @DeleteMapping("/delete/{modelid}")
    public String deleteDetails(@PathVariable int modelid)
    {
    	ls.deleteDetails(modelid);
    	return "deleted";
    }
    
    @GetMapping("/lapdetail/{modelid}")
    public Optional<LaptopDetails> findLapById(@PathVariable int modelid)
    {
    	return ls.findLapById(modelid);
    }
}
