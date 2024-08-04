package com.ak.apps.catalog.repository;

import com.ak.apps.catalog.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ItemRepository extends JpaRepository<Item,Integer> {
    Optional<Item> findItemById(Integer itemId);
}
