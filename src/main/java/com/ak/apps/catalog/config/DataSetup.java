package com.ak.apps.catalog.config;

import com.ak.apps.catalog.model.Item;
import com.ak.apps.catalog.repository.ItemRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class DataSetup {
    @Autowired
    private ItemRepository itemRepository;

    @PostConstruct
    public void setupData(){

        Item i1 = Item.builder().id(1).itemName("Dell Computer").price(1499.91).build();
        Item i2 = Item.builder().id(2).itemName("HardDrive").price(149.91).build();
        Item i3 = Item.builder().id(3).itemName("Laptop").price(2900.91).build();
        List<Item> items = Arrays.asList(i1,i2,i3);
        itemRepository.saveAll(items);

    }

}
