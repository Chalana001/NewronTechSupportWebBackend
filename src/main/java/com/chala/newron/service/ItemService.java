package com.chala.newron.service;

import com.chala.newron.model.dto.Item;

import java.util.List;

public interface ItemService {
    List<Item> getAllItems();

    void addItem(Item item);
}
