package com.inventory.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.inventory.entity.Item;
import com.inventory.repository.ItemRepository;
import com.inventory.request.CreateItemRequest;
import com.inventory.response.ItemResponse;
import com.inventory.service.ItemService;

@RestController
@RequestMapping("/api/item/")
public class ItemController {
	
	

	@Autowired
	ItemService itemService;

	@GetMapping("getByItemNumber/{itemNumber}")
	public ItemResponse getByItemNumber(@PathVariable Long itemNumber) {
		
	return	new ItemResponse(itemService.getByItemNumber(itemNumber));
	
	}
	
	@GetMapping("withdrawalQuantity/{itemNumber}")
	public String withdrawalQuantity(@PathVariable Long itemNumber) {

		return "Item Quantity :"+ (getByItemNumber(itemNumber)).getQuantity();
	}
	
	@PutMapping("depositQuantity/{itemNumber}/{quantity}")
	public String depositQuantity(@PathVariable Long itemNumber,@PathVariable Integer quantity) {
		
		return itemService.depositQuantity(itemNumber,quantity)+ " Item has been updated";
	}
	
	@PostMapping("add")
	public ItemResponse addItem(@Valid @RequestBody CreateItemRequest createItemRequest) {
		
		Item item=itemService.createItem(createItemRequest);
		 return new ItemResponse(item);
		
	}
	

	@DeleteMapping("delete/{itemNumber}")
	public String deleteItem(@PathVariable long itemNumber) {
		
		return itemService.deleteItem(itemNumber);
	
	
	}

	
	
	
	
}
