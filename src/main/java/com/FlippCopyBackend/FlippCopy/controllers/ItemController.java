package com.FlippCopyBackend.FlippCopy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FlippCopyBackend.FlippCopy.beans.Item;
import com.FlippCopyBackend.FlippCopy.services.ItemService;

@RestController
@RequestMapping("/item")
public class ItemController {

	@Autowired
	ItemService itemService;
	
	@GetMapping("/all")
	public List<Item> getAllItems(){
		return itemService.getAllItems();
	}
	
	@GetMapping("/categories/{category}")
	public List<Item> getAllItemsBaseOnCategory(@PathVariable String category){
		return itemService.getItemsByCategory(category);
	}
}
