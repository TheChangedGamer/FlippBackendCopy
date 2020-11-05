package com.FlippCopyBackend.FlippCopy.doas;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FlippCopyBackend.FlippCopy.beans.Item;

public interface ItemDao extends JpaRepository<Item, Integer>{

	List<Item> findByCategory(String category);
}
