package com.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.inventory.entity.Item;


@Repository
public interface ItemRepository extends  JpaRepository<Item,Long>{
	@Query("from Item where itemNumber= :itemNumber")
	Item getByItemNumber(@Param("itemNumber")Long itemNumber);
	
	@Modifying
	@Transactional
	@Query("Update Item set quantity =:quantity where itemNumber=:itemNumber")
	Integer depositQuantity(Long itemNumber,Integer quantity);
	
}
