package com.inventory.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import com.inventory.request.CreateItemRequest;


@Entity
@Table( name ="items")
public class Item {
@Id	
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="itemNumber")
private Long itemNumber;

@Column(name="itemName")
private String itemName;

@Column(name="amount")
private Double amount;

@Column(name="quantity")
private Integer quantity;

@Column(name="inventoryCode")
private Long inventoryCode;


//Constructors


public Item() {}



public Item(CreateItemRequest createItemRequest) {
	
	this.itemName=createItemRequest.getItemName();
	this.amount=createItemRequest.getAmount();
	this.quantity=createItemRequest.getQuantity();
	this.inventoryCode=createItemRequest.getInventoryCode();
	
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




