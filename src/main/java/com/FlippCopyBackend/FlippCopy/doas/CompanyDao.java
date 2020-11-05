package com.FlippCopyBackend.FlippCopy.doas;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FlippCopyBackend.FlippCopy.beans.Company;

public interface CompanyDao extends JpaRepository<Company, Integer> {

	Company findById(int id);
	
	Company findByName(String name);
}
