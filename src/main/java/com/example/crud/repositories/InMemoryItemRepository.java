package com.example.crud.repositories;

import org.springframework.stereotype.Repository;

import com.example.crud.model.Item;

import org.springframework.data.repository.CrudRepository;
@Repository
public interface InMemoryItemRepository extends  CrudRepository<Item, Long>{
    
}
