package com.inventory.response;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.inventory.entity.Item;

public class ItemResponse {
	
	
@JsonIgnore
private Long itemNumber;

private String itemName;

private Double amount;

private Integer quantity;

private Long inventoryCode;


public ItemResponse(Item item) {
	
	this.itemNumber=item.getItemNumber();
	this.itemName=item.getItemName();
	this.amount=item.getAmount();
	this.quantity=item.getQuantity();
	this.inventoryCode=item.getInventoryCode();
}




//Getters & Setters

public Long getItemNumber() {
	return itemNumber;
}

public void setItemNumber(Long itemNumber) {
	this.itemNumber = itemNumber;
}

public String getItemName() {
	return itemName;
}

public void setItemName(String itemName) {
	this.itemName = itemName;
}

public Double getAmount() {
	return amount;
}

public void setAmount(Double amount) {
	this.amount = amount;
}

public Integer getQuantity() {
	return quantity;
}

public void setQuantity(Integer quantity) {
	this.quantity = quantity;
}

public Long getInventoryCode() {
	return inventoryCode;
}

public void setInventoryCode(Long inventoryCode) {
	this.inventoryCode = inventoryCode;
}





}
