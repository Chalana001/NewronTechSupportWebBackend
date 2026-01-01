package com.chala.newron.controller;

import com.chala.newron.model.dto.Item;
import com.chala.newron.service.ItemService;
import com.chala.newron.service.ItemServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ItemController {

    private ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/getallitems")
    public List<Item> getAllItems(){
        return itemService.getAllItems();
    }

    @GetMapping("/{itemCode}")
    public Item getItemByCode(@PathVariable int itemCode) {
        return itemService.getItemByCode(itemCode);
    }

    @PostMapping("/additem")
    public Item addItem (@RequestBody Item item){
        itemService.addItem(item);
        return item;
    }
}
