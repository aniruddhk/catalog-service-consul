package com.ak.apps.catalog.controller;

import com.ak.apps.catalog.model.Item;
import com.ak.apps.catalog.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ItemsController {

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("/catalog/items")
    public List<Item> getItems(){
        return itemRepository.findAll();
    }

    @GetMapping("/catalog/item/{id}")
    public Item getItem(@PathVariable("id") String itemId){
        int id =-1;
        try{
            id = Integer.parseInt(itemId);
        }catch(Exception e){
            throw new RuntimeException("Invalid Value");
        }
        return itemRepository.findItemById(id).get();
    }
}
