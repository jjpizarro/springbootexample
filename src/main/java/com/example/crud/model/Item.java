package com.example.crud.model;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Item {
    
    private  Long id;
    private  String name;
    private  Long price;
    private  String description;
    private  String image;
    
    @Id
    public Long getId() {
        return id;
    }
    
    public Item updateWith(Item item) {
        return new Item(
            this.id,
            item.name,
            item.price, 
            item.description, 
            item.image
        );
    }

    
}
