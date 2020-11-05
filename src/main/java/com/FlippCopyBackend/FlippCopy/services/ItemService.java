package com.FlippCopyBackend.FlippCopy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FlippCopyBackend.FlippCopy.beans.Company;
import com.FlippCopyBackend.FlippCopy.beans.Item;
import com.FlippCopyBackend.FlippCopy.doas.CompanyDao;
import com.FlippCopyBackend.FlippCopy.doas.ItemDao;

@Service
public class ItemService {

	@Autowired
	ItemDao itemDao;
	
	@Autowired
	CompanyDao companyDao;
	
	public List<Item> getAllItems(){
		System.out.println("get all items");
		System.out.println(itemDao.findAll().toString());
		
		
		return itemDao.findAll();
	}
	
	public List<Item> getItemsByCategory(String category){
		
		return setCompanyNameById(itemDao.findByCategory(category));
	}
	
	public List<Item> setCompanyNameById(List<Item> items){
		for(Item item:items) {
			item.setCompanyName(companyDao.findById(item.getCompanyId()).getName());
			item.setCompanyLogo(companyDao.findById(item.getCompanyId()).getLogo());
		}

		return items;
	}
}
