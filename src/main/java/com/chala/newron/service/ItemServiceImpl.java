package com.chala.newron.service;

import com.chala.newron.model.dto.Item;
import com.chala.newron.model.entity.ItemEntity;
import com.chala.newron.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemRepository itemRepository;

    List<Item> itemsList = new ArrayList<>();
    List<ItemEntity> itemsEntityList = new ArrayList<>();


    @Override
    public List<Item> getAllItems() {
        itemsList.clear();
        itemsEntityList = itemRepository.findAll();

        for (ItemEntity itemEntity: itemsEntityList){
            itemsList.add(new Item(
                    itemEntity.getItemCode(),
                    itemEntity.getName(),
                    itemEntity.getDescription(),
                    itemEntity.getCategory(),
                    itemEntity.getBrand(),
                    itemEntity.getPrice(),
                    itemEntity.getImgUrl()
            ));
        }
        return itemsList;
    }

    @Override
    public Item getItemByCode(int itemCode) {
        ItemEntity itemEntity = itemRepository
                .findByItemCode(itemCode)
                .orElseThrow(() -> new RuntimeException("Item not found"));

        return new Item(
                itemEntity.getItemCode(),
                itemEntity.getName(),
                itemEntity.getDescription(),
                itemEntity.getCategory(),
                itemEntity.getBrand(),
                itemEntity.getPrice(),
                itemEntity.getImgUrl()
        );
    }

    @Override
    public void addItem(Item item) {
        ItemEntity itemEntity = new ItemEntity();

        itemEntity.setItemCode(item.getItemCode());
        itemEntity.setName(item.getName());
        itemEntity.setDescription(item.getDescription());
        itemEntity.setCategory(item.getCategory());
        itemEntity.setBrand(item.getBrand());
        itemEntity.setPrice(item.getPrice());
        itemEntity.setImgUrl(item.getImgUrl());
        itemRepository.save(itemEntity);
    }

}
