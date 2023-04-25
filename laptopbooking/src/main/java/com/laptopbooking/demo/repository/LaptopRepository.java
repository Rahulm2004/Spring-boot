package com.laptopbooking.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptopbooking.demo.entity.LaptopDetails;

public interface LaptopRepository extends JpaRepository<LaptopDetails,Integer>{

}
