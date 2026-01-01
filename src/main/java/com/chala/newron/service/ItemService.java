package com.chala.newron.service;

import com.chala.newron.model.dto.Item;

import java.util.List;

public interface ItemService {
    List<Item> getAllItems();
    Item getItemByCode(int itemCode);
    void addItem(Item item);
}
