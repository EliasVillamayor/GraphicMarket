package com.graphicmarket.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.graphicmarket.models.Buyer;

@Repository
public interface BuyerRepo extends CrudRepository<Buyer, Long> {
	Buyer findbyEmail(String email);
}
