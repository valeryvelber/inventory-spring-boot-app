package com.inventory.request;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateItemRequest {
	
	
	
	@NotBlank(message="Item name is requierd")
	private String itemName;
	
	private Double amount;
	
	private Integer quantity;
	
	private Long inventoryCode;

	public String getItemName() {
		return itemName;
	}

	
	
	
	
	
	//Getters & Setters
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
