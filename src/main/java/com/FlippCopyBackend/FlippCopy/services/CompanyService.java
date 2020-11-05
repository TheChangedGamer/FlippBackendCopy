package com.FlippCopyBackend.FlippCopy.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FlippCopyBackend.FlippCopy.beans.Company;
import com.FlippCopyBackend.FlippCopy.doas.CompanyDao;

@Service
public class CompanyService {
	
	@Autowired
	CompanyDao companyDao;
	
	private final int numberOfCompaniesForExplore = 3;
	
//	List<Company> companies = companyDao.findAll();
	
	public List<Company> getCompanys() {
		return companyDao.findAll();
//		return companies;
	}
	public List<Company> getCompaniesForExplore(){
		System.out.println("explore begins");
		int companiesSize = (int)companyDao.count();
		List<Company> exploreCompanies = new ArrayList<Company>();
		HashSet<Integer> nums = new HashSet<Integer>();
		
		while(nums.size() < numberOfCompaniesForExplore) {			
			int random = (int) (Math.random() *  companiesSize) + 1;


			if(!nums.contains(random)) {
				exploreCompanies.add( companyDao.findById(random));
				nums.add(random);
			}			
		}
		

		System.out.println("expolore end");
		return exploreCompanies;		
	}
	
	public boolean getCompanyById(String companyName) {
		List<Company> companies = companyDao.findAll();
		for(Company company: companies) {
			// ==
			if(companyName.equals(company.getName())) {
				return true;
			}
		}
		return false;
	}
//	public int getCompany
}
