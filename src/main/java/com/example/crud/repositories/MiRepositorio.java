package com.example.crud.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.crud.model.Item;
@Repository
public interface MiRepositorio  extends CrudRepository<Item, Long>{
    
}
