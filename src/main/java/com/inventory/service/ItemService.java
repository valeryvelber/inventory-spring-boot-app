package com.inventory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.inventory.entity.Item;
import com.inventory.repository.ItemRepository;
import com.inventory.request.CreateItemRequest;


@Service
public class ItemService {
	
	@Autowired
	ItemRepository itemRepository;
	
	public Item getByItemNumber(Long itemNumber) {
		//return studentRepository.findByFirstName(firstName);
		return itemRepository.getByItemNumber(itemNumber);
	}
	
	
	
	public Item createItem(CreateItemRequest createItemRequest) {
		
		Item item=new Item(createItemRequest);
		 
		item= itemRepository.save(item);
		return item;
		
	}
	
	public String deleteItem(long itemNumber) {
		itemRepository.deleteById(itemNumber);
		return "Item has been deleted successfully";
		
		
	}



	public Integer depositQuantity(Long itemNumber, Integer quantity) {
	
		return itemRepository.depositQuantity(itemNumber, quantity); 
		}

}
