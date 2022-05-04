package com.learning.loggerexample.services;

import com.learning.loggerexample.entities.GroceryItem;
import com.learning.loggerexample.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public void addItem(GroceryItem groceryItem){
        itemRepository.insert(groceryItem);
    }
}
