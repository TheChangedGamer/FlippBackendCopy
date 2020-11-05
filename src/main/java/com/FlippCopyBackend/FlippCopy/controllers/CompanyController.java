package com.FlippCopyBackend.FlippCopy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FlippCopyBackend.FlippCopy.beans.Company;
import com.FlippCopyBackend.FlippCopy.services.CompanyService;

@RestController()
@RequestMapping("/company")
public class CompanyController {
	@Autowired
	CompanyService companyService;
	
	@GetMapping("/all")
	public List<Company> getAllCompany(){
		System.out.println("All company called");
		return companyService.getCompanys();
	}
	@GetMapping("/explore")
	public List<Company> getCompaniesForExpolore() {
		System.out.println("Explore company called");
		return companyService.getCompaniesForExplore();
		
	}
	
	@GetMapping("/find/{companyName}")
	public boolean getByName(@PathVariable("companyName") String companyName){
		System.out.println(companyName);
		return companyService.getCompanyById(companyName);
	}
	
}
